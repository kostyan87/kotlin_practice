package task5.service;

import task5.Genre;
import task5.entity.*;

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
        return booksRepository
                .stream()
                .filter(book -> book.getTitle().contains(substring))
                .collect(Collectors.toList());
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
//        return booksRepository
//                .stream()
//                .collect(Collectors.groupingBy(Book, Book::getStatus));
        return null;
    }

    @Override
    public void setBookStatus(Book book, Status status) {
        Book newBook = book.changeStatus(status);
        booksRepository.add(newBook);
    }

    @Override
    public void addBook(Book book, Status status) {
//        book.setStatus(status);
//        booksRepository.add(book);
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
    public void takeBook(User user, Book book) {
//        user.setBook(book);
//        book.setStatus(new UsedBy(user));
    }

    @Override
    public void returnBook(Book book) {

    }
}
