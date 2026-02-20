package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.film.Film;

public class PosterManagerTest {

    Film film1 = new Film("Бладшот", "боевик");
    Film film2 = new Film("Вперёд", "мультфильм");
    Film film3 = new Film("Отель \"Белград\" ", "комедия");
    Film film4 = new Film("Джентльмены", "боевик");
    Film film5 = new Film("Человек-невидимка", "ужасы");
    Film film6 = new Film("Тролли. Мировой тур", "мультфильм");
    Film film7 = new Film("Номер один", "комедия");

    @Test
    public void addFilmTest() {
        PosterManager posterRepo = new PosterManager();
        posterRepo.addFilm(film1);
        posterRepo.addFilm(film2);
        posterRepo.addFilm(film3);
        posterRepo.addFilm(film4);
        posterRepo.addFilm(film5);
        posterRepo.addFilm(film6);
        posterRepo.addFilm(film7);

        Film[] expected = {film1, film2, film3, film4, film5, film6, film7};
        Film[] actual = posterRepo.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastTest() {
        PosterManager posterRepo = new PosterManager(3);
        posterRepo.addFilm(film1);
        posterRepo.addFilm(film2);
        posterRepo.addFilm(film3);
        posterRepo.addFilm(film4);
        posterRepo.addFilm(film5);
        posterRepo.addFilm(film6);
        posterRepo.addFilm(film7);
        posterRepo.findLast();

        Film[] expected = {film7, film6, film5};
        Film[] actual = posterRepo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOutOfMaxBoundTest() {
        PosterManager posterRepo = new PosterManager(10);
        posterRepo.addFilm(film1);
        posterRepo.addFilm(film2);
        posterRepo.addFilm(film3);
        posterRepo.addFilm(film4);
        posterRepo.addFilm(film5);
        posterRepo.addFilm(film6);
        posterRepo.addFilm(film7);
        posterRepo.findLast();

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = posterRepo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastOutOfMinBoundTest() {
        PosterManager posterRepo = new PosterManager(-2);
        posterRepo.addFilm(film1);
        posterRepo.addFilm(film2);
        posterRepo.addFilm(film3);
        posterRepo.addFilm(film4);
        posterRepo.addFilm(film5);
        posterRepo.addFilm(film6);
        posterRepo.addFilm(film7);
        posterRepo.findLast();

        Film[] expected = {film7, film6, film5, film4, film3};
        Film[] actual = posterRepo.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }
}
