package by.tms.service;

import by.tms.model.Film;
import by.tms.repository.FilmRepository;
import by.tms.repository.impl.FilmRepositoryImpl;

import java.util.List;

public class FilmServiceImpl implements FilmService{
    private FilmRepository filmRepository=new FilmRepositoryImpl();

    @Override
    public List<Film> allFilms() {
        return filmRepository.allFilms();
    }

    @Override
    public void add(Film film) {
        filmRepository.add(film);
    }

    @Override
    public void delete(int id) {
        filmRepository.delete(id);
    }

    @Override
    public void edit(Film film) {
        filmRepository.edit(film);
    }

    @Override
    public Film getById(int id) {
        return filmRepository.getById(id);
    }
}
