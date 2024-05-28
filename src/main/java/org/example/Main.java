package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book());
        bookList.add(new Book("first", "John"));
        bookList.add(new Book("second","Dany",100));
        bookList.add(new Book("third","Mike", 5, 250));

        Reader reader = new Reader();
        Book book = reader.choiceBook(bookList);
        System.out.println(reader.readBook(book));
        System.out.println(reader.gradeBook(book));
    }
}