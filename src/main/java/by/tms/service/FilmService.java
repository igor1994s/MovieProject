package by.tms.service;

import by.tms.model.Film;

import java.util.List;

public interface FilmService {
    List<Film> allFilms();
    void add(Film film);
    void delete(int id);
    void edit(Film film);
    Film getById(int id);
}
