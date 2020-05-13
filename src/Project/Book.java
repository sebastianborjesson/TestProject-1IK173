package Project;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private int numberOfEx;
    private int numberOfBorrowedEx;

    public Book() {
    }


    public Book(String title, String author, int isbn, boolean borrowedStatus, String storePos, int numberOfEx, int numberOfBorrowedEx) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.numberOfEx = numberOfEx;
        this.numberOfBorrowedEx = numberOfBorrowedEx;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getNumberOfEx() {
        return numberOfEx;
    }

    public void setNumberOfEx(int numberOfEx) {
        this.numberOfEx = numberOfEx;
    }

    public int getNumberOfBorrowedEx() {
        return numberOfBorrowedEx;
    }

    public void setNumberOfBorrowedEx(int numberOfBorrowedEx) {
        this.numberOfBorrowedEx = numberOfBorrowedEx;
    }
}
