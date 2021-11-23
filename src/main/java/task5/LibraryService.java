package task5;

import task5.Genre;
import task5.entity.Author;
import task5.entity.Book;
import task5.entity.Status;
import task5.entity.User;

import java.time.Year;
import java.util.List;
import java.util.Map;

public interface LibraryService {
    List<Book> findBooks(String substring);
    List<Book> findBooks(Author author);
    List<Book> findBooks(int year);
    List<Book> findBooks(Genre genre);

    List<Book> getAllBooks();
    List<Book> getAllAvailableBooks();

    Status getBookStatus(Book book);
    Map<Book, Status> getAllBookStatuses();

    void setBookStatus(Book book, Status status);

    void addBook(Book book, Status status, List<Author> authors);

    void registerUser(User user);
    void unregisterUser(User user);

    // my method
    List<User> findUsers(String substring);

    void takeBook(User user, Book book);
    void returnBook(Book book);

}
