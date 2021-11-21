package task5.entity;

import task5.*;

import java.time.Year;
import java.util.List;

public class Book {
    private final String title;
    private final List<Author> authors;
    private final Genre genre;
    private final Year year;
    private Status status;

    public void setStatus(Status status) {
        this.status = status;
    }

    public Book(String title, List<Author> authors, Genre genre, Year year) {
        this.title = title;
        this.authors = authors;
        this.genre = genre;
        this.year = year;
    }

    public Status getStatus() {
        return status;
    }

    public String getTitle() {
        return title;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public Genre getGenre() {
        return genre;
    }

    public Year getYear() {
        return year;
    }
}