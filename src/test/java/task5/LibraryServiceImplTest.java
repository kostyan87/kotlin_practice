package task5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import task5.entity.Author;
import task5.entity.Available;
import task5.entity.Book;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceImplTest {

    private LibraryService libraryService = new LibraryServiceImpl();

    @BeforeEach
    void setUp() {

    }

    @Test
    void addBook() {
        libraryService.addBook(new Book("Мастер и Маргарита", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Михаил", "Булгаков")));
        libraryService.addBook(new Book("Мёртвые души", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
        libraryService.addBook(new Book("Master and Margrarita", Genre.CLASSIC, 1940),
                new Available(), List.of(new Author("Michael", "Bulgakov")));
    }

}