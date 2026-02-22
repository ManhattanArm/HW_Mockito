package ru.netology.manager;

import ru.netology.film.Film;

public class PosterManager {
    private Film[] films = new Film[0];
    private final int defaultLastFilmsLength = 5;
    private int userLastFilmsLength;

    public PosterManager() {
    }

    public PosterManager(int userLastFilmsLength) {
        this.userLastFilmsLength = userLastFilmsLength;
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
        if (userLastFilmsLength > films.length || userLastFilmsLength <= 0) {
            userLastFilmsLength = defaultLastFilmsLength;
        }

        Film[] lastFilms = new Film[userLastFilmsLength];

        for (int i = 0; i < userLastFilmsLength; i++) {
            lastFilms[i] = films[films.length - 1 - i];
        }
        return lastFilms;
    }
}
