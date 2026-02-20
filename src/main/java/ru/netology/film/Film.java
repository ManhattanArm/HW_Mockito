package ru.netology.film;

public class Film {
    private String title;
    private String genre;

    public Film(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
}
