package by.tms.service.impl;

import by.tms.model.Film;
import by.tms.repository.FilmRepository;
import by.tms.repository.impl.FilmRepositoryImpl;
import by.tms.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService {

    private final FilmRepository filmRepository;

    @Autowired
    public FilmServiceImpl(FilmRepository filmRepository){
        this.filmRepository=filmRepository;

    }

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
