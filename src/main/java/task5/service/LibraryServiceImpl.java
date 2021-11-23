package task5.service;

import task5.entity.Genre;
import task5.entity.*;

import java.util.*;
import java.util.stream.Collectors;

public class LibraryServiceImpl implements LibraryService {

    private final Map<Book, Status> bookStatuses;
    private final Map<Book, List<Author>> bookAuthors;
    private final List<User> usersRepository;

    {
        bookStatuses = new HashMap<>();
        bookAuthors = new HashMap<>();
        usersRepository = new ArrayList<>();
    }

    @Override
    public List<Book> findBooks(String substring) {
        return bookStatuses
                .keySet()
                .stream()
                .filter(book -> book.getTitle().contains(substring))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooks(Author author) {
        return bookStatuses
                .keySet()
                .stream()
                .filter(book -> bookAuthors.get(book).contains(author))
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooks(int year) {
        return bookStatuses
                .keySet()
                .stream()
                .filter(book -> book.getYear() == year)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> findBooks(Genre genre) {
        return bookStatuses
                .keySet()
                .stream()
                .filter(book -> book.getGenre() == genre)
                .collect(Collectors.toList());
    }

    @Override
    public List<Book> getAllBooks() {
        return List.copyOf(bookStatuses.keySet());
    }

    @Override
    public List<Book> getAllAvailableBooks() {
        return bookStatuses
                .keySet()
                .stream()
                .filter(book -> getBookStatus(book).getStatus().equals("Available"))
                .collect(Collectors.toList());
    }

    @Override
    public Status getBookStatus(Book book) {
        return bookStatuses.get(book);
    }

    @Override
    public Map<Book, Status> getAllBookStatuses() {
        return bookStatuses;
    }

    @Override
    public void setBookStatus(Book book, Status status) {
        bookStatuses.put(book, status);
    }

    @Override
    public void addBook(Book book, Status status, List<Author> authors) {
        bookStatuses.put(book, status);
        bookAuthors.put(book, authors);
    }

    @Override
    public void registerUser(User user) {
        usersRepository.add(user);
    }

    @Override
    public void unregisterUser(User user) {
        usersRepository.remove(user);
    }

    @Override
    public List<User> findUsers(String substring) {
        return usersRepository
                .stream()
                .filter(user -> user.getFirstName().contains(substring) ||
                        user.getLastName().contains(substring))
                .collect(Collectors.toList());
    }

    @Override
    public void takeBook(User user, Book book) {
        setBookStatus(book, new UsedBy(user));
    }

    @Override
    public void returnBook(Book book) {
        setBookStatus(book, new Available());
    }
}
