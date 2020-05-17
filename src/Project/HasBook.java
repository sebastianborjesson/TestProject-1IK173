package Project;

public class HasBook {
    private String title;
    private int ID;
    private String ISBN;


    public HasBook(String title,int ID, String ISBN) {
        this.title = title;
        this.ID = ID;
        this.ISBN = ISBN;
    }

    public HasBook() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
