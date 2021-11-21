package task5.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
    private final String firstName;
    private final String lastName;
    private final List<Book> books;

    public User(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        books = new ArrayList<>();
    }

    public User setBook(Book book) {
        User newUser = new User(firstName, lastName);
        newUser.books.addAll(books);
        newUser.books.add(book);
        return newUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
