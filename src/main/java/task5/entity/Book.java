package task5.entity;

import task5.*;

import java.time.Year;

public final class Book {
    private final String title;
    private final Genre genre;
    private final int year;

    public Book(String title, Genre genre, int year) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public Genre getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }
}