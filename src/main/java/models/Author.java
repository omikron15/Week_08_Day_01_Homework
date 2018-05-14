package models;

public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private int noOfBooks;

    public Author(String firstName, String lastName, int noOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noOfBooks = noOfBooks;
    }

    public Author() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }
}
