package by.tms.repository.impl;

import by.tms.model.Film;
import by.tms.repository.FilmRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


@Repository
public class FilmRepositoryImpl implements FilmRepository {

    private static final AtomicInteger AUTO_ID = new AtomicInteger(0);
    private static Map<Integer, Film> films = new HashMap<>();

    static {
        Film film1 = new Film();
        film1.setId(AUTO_ID.getAndIncrement());
        film1.setTitle("Inception");
        film1.setYear(2010);
        film1.setGenre("sci-fi");
        film1.setWatched(true);
        films.put(film1.getId(), film1);

        Film film2 = new Film();
        film2.setId(AUTO_ID.getAndIncrement());
        film2.setTitle("Terminator");
        film2.setYear(1995);
        film2.setGenre("Action");
        film2.setWatched(true);
        films.put(film2.getId(), film2);

        Film film3 = new Film();
        film3.setId(AUTO_ID.getAndIncrement());
        film3.setTitle("Teminator2");
        film3.setYear(1997);
        film3.setGenre("Action");
        film3.setWatched(true);
        films.put(film3.getId(), film3);
    }

    @Override
    public List<Film> allFilms() {
        return new ArrayList<>(films.values());
    }

    @Override
    public void add(Film film) {
        film.setId(AUTO_ID.getAndIncrement());
        films.put(film.getId(),film);
    }

    @Override
    public void delete(int id) {
        films.remove(id);
    }

    @Override
    public void edit(Film film) {
        films.put(film.getId(),film);
    }

    @Override
    public Film getById(int id) {
        return films.get(id);
    }
}
