package org.example;

import java.util.List;
import java.util.Random;

public class Reader {

//    private List<Book> bookList;
//    private Book currentBook;
    private Random random = new Random();

    public Book choiceBook(List<Book> bookList){
        return bookList.get(random.nextInt(bookList.size() - 1));
    }

    public String readBook(Book book){
        return book.toString();
    }

    public int gradeBook(Book book){
        int grade = 0;
//        if (book.getName() != null && book.getName().length() > 0){
        grade += (book.getName() != null && book.getName().length() > 0) ? book.getName().length() : -random.nextInt(10);
        grade += (book.getAuthor() != null && book.getAuthor().length() > 0) ? book.getAuthor().length() : -random.nextInt(10);
        grade += book.getPagesNumber() > 0 ? book.getPagesNumber() : -random.nextInt(10);
        grade += book.getSerialNumber() > 0 ? book.getSerialNumber() : -random.nextInt(10);

//                (book.getPagesNumber() != null && book.getAuthor().length() > 0) ? book.getAuthor().length() : -random.nextInt(10);

        return grade;
    }

//    private int gradeParam(Object param){
//        if (param != null)
////        if (param == null) return 0-random.nextInt();
//        return 0;
//    }
}
