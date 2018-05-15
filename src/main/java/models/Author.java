package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name="authors")
public class Author {

    private int id;
    private String firstName;
    private String lastName;
    private int noOfBooks;
    private Set<Book> books;

    public Author(String firstName, String lastName, int noOfBooks) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.noOfBooks = noOfBooks;
    }

    public Author() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "first_name")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "no_of_books")
    public int getNoOfBooks() {
        return noOfBooks;
    }

    public void setNoOfBooks(int noOfBooks) {
        this.noOfBooks = noOfBooks;
    }

    @OneToMany(mappedBy = "author")
    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }
}
