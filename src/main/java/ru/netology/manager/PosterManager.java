package ru.netology.manager;

import ru.netology.film.Film;

public class PosterManager {
    private Film[] films = new Film[0];
    private int lastFilmsLength;

    public PosterManager() {
    }

    public PosterManager(int userLastFilmsLength) {
        this.lastFilmsLength = userLastFilmsLength;
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

        if (lastFilmsLength < films.length && lastFilmsLength > 0) {
            tmpLastLength = getLastFilmsLength();
        } else {
            tmpLastLength = 5;
        }

        Film[] lastFilms = new Film[tmpLastLength];

        for (int i = 0; i < tmpLastLength; i++) {
            lastFilms[i] = films[films.length - 1 - i];
        }
        return lastFilms;
    }
}
