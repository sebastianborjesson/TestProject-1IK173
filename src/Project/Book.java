package Project;

public class Book {
    private String title;
    private String author;
    private int isbn;
    private boolean borrowedStatus;
    private String storePos;
    private int numberOfEx;
    private int numberOfBorrowedEx;

    public Book() {
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

    public boolean isBorrowedStatus() {
        return borrowedStatus;
    }

    public void setBorrowedStatus(boolean borrowedStatus) {
        this.borrowedStatus = borrowedStatus;
    }

    public String getStorePos() {
        return storePos;
    }

    public void setStorePos(String storePos) {
        this.storePos = storePos;
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
