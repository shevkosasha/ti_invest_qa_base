package org.example;

public class Book {

    private String name;
    private String author;
    private int serialNumber;
    private int pagesNumber;
//    private final String DEFAULT_STRING = "N/A";
//    private final int DEFAULT_NUMBER = 0;


    public Book() {
//        setDefaults();
    }

    public Book(String name, String author) {
//        setDefaults();
        this.name = name;
        this.author = author;
    }

    public Book(String name, String author, int pagesNumber) {
//        setDefaults();
        this.name = name;
        this.author = author;
        this.pagesNumber = pagesNumber;
    }

    public Book(String name, String author, int serialNumber, int pagesNumber) {
        this.name = name;
        this.author = author;
        this.serialNumber = serialNumber;
        this.pagesNumber = pagesNumber;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    //    private void setDefaults(){
//        this.name = DEFAULT_STRING;
//        this.author = DEFAULT_STRING;
//        this.pagesNumber = DEFAULT_NUMBER;
//        this.serialNumber = DEFAULT_NUMBER;
//    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", serialNumber=" + serialNumber +
                ", pagesNumber=" + pagesNumber +
                '}';
    }
}
