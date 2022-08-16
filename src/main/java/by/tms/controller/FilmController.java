package by.tms.controller;

import by.tms.model.Film;
import by.tms.service.FilmService;
import by.tms.service.FilmServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class FilmController {

    public FilmService filmService = new FilmServiceImpl();


    //@RequestMapping(value ="/", method = RequestMethod.GET)
    @GetMapping(value = "/")
    public ModelAndView allFilms() {
        ModelAndView modelAndView = new ModelAndView();
        List<Film> films = filmService.allFilms();
        modelAndView.addObject("films", films);
        modelAndView.setViewName("films");
        return modelAndView;
    }

    @GetMapping(value = "/edit/{id}")
    public ModelAndView editPage(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        Film film = filmService.getById(id);
        modelAndView.setViewName("editPage");
        modelAndView.addObject("film", film);
        return modelAndView;
    }

    @GetMapping(value = "/add")
    public ModelAndView addPage() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("editPage");
        return modelAndView;

    }

    @PostMapping(value = "/add")
    public ModelAndView addFilm(@ModelAttribute("film") Film film) {
        ModelAndView modelAndView = new ModelAndView();
        filmService.add(film);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }

    @PostMapping(value = "/edit")
    public ModelAndView editFilm(@ModelAttribute("film") Film film) {
        ModelAndView modelAndView = new ModelAndView();
        filmService.edit(film);
        modelAndView.setViewName("redirect:/");
        return modelAndView;
    }


}