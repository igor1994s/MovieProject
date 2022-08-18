package by.tms.repository.impl;

import by.tms.model.Film;
import by.tms.repository.FilmRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FilmRepositoryImpl implements FilmRepository {

    private final SessionFactory sessionFactory;

    @Autowired
    public FilmRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Film> allFilms() {

        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Film", Film.class).list();
    }

    @Override
    public void add(Film film) {
        Session session=sessionFactory.getCurrentSession();
        session.persist(film);
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void edit(Film film) {

    }

    @Override
    public Film getById(int id) {
        return null;
    }
}
