package task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task5.entity.*;
import task5.service.LibraryService;
import task5.service.LibraryServiceImpl;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    private LibraryService libraryService = new LibraryServiceImpl();
    private User user;
    private Book book;

    @BeforeEach
    void setUp() {
        libraryService.addBook(new Book("Мастер и Маргарита", Genre.CLASSIC, 1940),
                new ComingSoon(), List.of(new Author("Михаил", "Булгаков")));
        libraryService.addBook(new Book("Мёртвые души", Genre.CLASSIC, 1842),
                new Available(), List.of(new Author("Николай", "Гоголь")));
        libraryService.addBook(new Book("Двенадцать стульев", Genre.CLASSIC, 1928),
                new Available(), List.of(new Author("Илья", "Ильф"),
                        new Author("Евгений", "Петров")));
        libraryService.addBook(new Book("Собачье сердце", Genre.CLASSIC, 1925),
                new Available(), List.of(new Author("Михаил", "Булгаков")));
        libraryService.addBook(new Book("Алхимик", Genre.FANTASY, 1988),
                new ComingSoon(), List.of(new Author("Пауло", "Коэльо")));
        libraryService.addBook(new Book("Путешествия Гулливера", Genre.FANTASY, 1726),
                new Available(), List.of(new Author("Джонатан", "Свифт")));
        libraryService.addBook(new Book("Вий", Genre.HORROR, 1835),
                new Restoration(), List.of(new Author("Николай", "Гоголь")));
        libraryService.addBook(new Book("Пиковая дама", Genre.HORROR, 1835),
                new Available(), List.of(new Author("Александр", "Пушкин")));
        libraryService.addBook(new Book("Приключения Тома Сойера", Genre.HUMOR, 1876),
                new Restoration(), List.of(new Author("Марк", "Твен")));
        libraryService.addBook(new Book("Денискины рассказы", Genre.HUMOR, 1972),
                new Available(), List.of(new Author("Виктор", "Драгунский")));

        libraryService.registerUser(new User("Квентин", "Тарантино"));
        libraryService.registerUser(new User("Галь", "Гадот"));
        libraryService.registerUser(new User("Джеймс", "Гослинг"));
        libraryService.registerUser(new User("Линус", "Торвальдс"));
        libraryService.registerUser(new User("Илон", "Маск"));

        user = libraryService.findUsers("Галь").get(0);
        book = libraryService.findBooks("стул").get(0);
        libraryService.takeBook(user, book);
    }

    @Test
    void addBook() {
        assertEquals(10, libraryService.getAllBooks().size());
    }

    @Test
    void findBooks1() {
        assertEquals(1, libraryService.findBooks(1876).size());
        assertEquals(2, libraryService.findBooks(1835).size());
    }

    @Test
    void findBooks2() {
        assertEquals(2, libraryService.findBooks("ни").size());
    }

    @Test
    void findBooks3() {
        assertEquals(4, libraryService.findBooks(Genre.CLASSIC).size());
    }

    @Test
    void findBooks4() {
        assertEquals(2, libraryService.findBooks(new Author("Николай", "Гоголь")).size());
    }

    @Test
    void setBookStatus() {
        libraryService.setBookStatus(libraryService.findBooks("Мёртв").get(0), new ComingSoon());
        assertEquals(new ComingSoon(),
                libraryService.getBookStatus(libraryService.findBooks("Мёртв").get(0)));
    }

    @Test
    void takeBook() {
        assertEquals(new UsedBy(user),
                libraryService.getBookStatus(book));
    }

    @Test
    void returnBook() {
        libraryService.returnBook(book);
        assertEquals(new Available(),
                libraryService.getBookStatus(book));
    }

    @Test
    void getAllAvailableBooks() {
        List<Book> bookList = libraryService.getAllAvailableBooks();
        assertEquals(5, bookList.size());
    }
}