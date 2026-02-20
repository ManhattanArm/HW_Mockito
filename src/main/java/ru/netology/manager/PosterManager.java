package ru.netology.manager;

import ru.netology.film.Film;

public class PosterManager {
    private Film[] films = new Film[0];
    private int lastFilmsLength;

    public PosterManager() {
    }

    public PosterManager(int lastFilmsLength) {
        this.lastFilmsLength = lastFilmsLength;
    }

    public void addFilm(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] findAll() {
        return films;
    }

    public Film[] findLast() {
        if (lastFilmsLength > films.length || lastFilmsLength <= 0) {
            lastFilmsLength = 5;
        }

        Film[] lastFilms = new Film[lastFilmsLength];

        for (int i = 0; i < lastFilmsLength; i++) {
            lastFilms[i] = films[films.length - 1 - i];
        }
        return lastFilms;
    }
}
