package task5.entity;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && Objects.equals(title, book.title) && genre == book.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, genre, year);
    }
}