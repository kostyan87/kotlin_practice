package task5.service;

import task5.Genre;
import task5.entity.Author;
import task5.entity.Book;
import task5.entity.Status;
import task5.entity.User;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService {

    private final List<Book> booksRepository = new ArrayList<>();
    private final List<User> usersRepository = new ArrayList<>();

    @Override
    public List<Book> findBooks(String substring) {
        return null;
    }

    @Override
    public List<Book> findBooks(Author author) {
        return booksRepository
                .stream()
                .filter(book -> book.getAuthors().contains(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooks(Year year) {
        return booksRepository
                .stream()
                .filter(book -> book.getYear().equals(year))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooks(Genre genre) {
        return booksRepository
                .stream()
                .filter(book -> book.getGenre() == genre)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return booksRepository;
    }

    @Override
    public List<Book> getAllAvailableBooks() {
        return booksRepository
                .stream()
                .filter(book -> book.getStatus().getStatus().equals("Available"))
                .collect(Collectors.toList());
    }

    @Override
    public Status getBookStatus(Book book) {
        return book.getStatus();
    }

    @Override
    public Map<Book, Status> getAllBookStatuses() {
        return null;
    }

    @Override
    public void setBookStatus(Book book, Status status) {

    }

    @Override
    public void addBook(Book book, Status status) {

    }

    @Override
    public void registerUser(User user) {

    }

    @Override
    public void unregisterUser(User user) {

    }

    @Override
    public void takeBook(User user, Book book) {

    }

    @Override
    public void returnBook(Book book) {

    }
}
