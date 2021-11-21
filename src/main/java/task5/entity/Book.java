package task5.entity;

import task5.*;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public final class Book {
    private final String title;
    private final List<Author> authors;
    private final Genre genre;
    private final Year year;
    private final Status status;

    public Book changeStatus(Status status) {
        return new Book(title, new ArrayList<Author>(authors),
                genre, year);
    }

    public Book(String title, List<Author> authors, Genre genre, Year year) {
        this.title = title;
        this.authors = authors;
        this.genre = genre;
        this.year = year;
        this.status = new Available();
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