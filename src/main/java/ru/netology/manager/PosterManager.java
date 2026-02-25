package ru.netology.manager;

import ru.netology.film.Film;

public class PosterManager {
    private Film[] films = new Film[0];
    private final int lastFilmsLength;

    public PosterManager() {
        this.lastFilmsLength = 5;
    }

    public PosterManager(int userLastFilmsLength) {
        if (userLastFilmsLength > 0) {
            this.lastFilmsLength = userLastFilmsLength;
        }  else {
            this.lastFilmsLength = 5;
        }
    }

    public int getLastFilmsLength() {
        return lastFilmsLength;
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
        int tmpLastLength;

        if (lastFilmsLength < films.length) {
            tmpLastLength = getLastFilmsLength();
        } else {
            tmpLastLength = films.length;
        }

        Film[] lastFilms = new Film[tmpLastLength];

        for (int i = 0; i < tmpLastLength; i++) {
            lastFilms[i] = films[films.length - 1 - i];
        }
        return lastFilms;
    }
}
