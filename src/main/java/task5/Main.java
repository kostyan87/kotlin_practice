package task5;

import task5.entity.Book;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("Title", Genre.CLASSIC, 2021);
        String a = book.getTitle();
        a = "new Title";
        System.out.println(book.getTitle());
    }
}
