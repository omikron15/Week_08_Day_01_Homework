import db.DBAuthor;
import db.DBBook;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Book book1 = new Book("Title 1", "Author 1");
        Book book2 = new Book("Title 2", "Author 2");
        Book book3 = new Book("Title 3", "Author 3");
        Book book4 = new Book("Title 4", "Author 4");
        Book book5 = new Book("Title 5", "Author 5");

        DBBook.save(book1);
        DBBook.save(book2);
        DBBook.save(book3);
        DBBook.save(book4);
        DBBook.save(book5);

        DBBook.delete(book4);

        List<Book> booklist = DBBook.getBooks();

        Book book = DBBook.find(book1.getId());

        Author author1 = new Author("FirstName 1", "LastName 1", 3);
        Author author2 = new Author("FirstName 2", "LastName 2", 10);
        Author author3 = new Author("FirstName 3", "LastName 3", 1);
        Author author4 = new Author("FirstName 4", "LastName 4", 7);
        Author author5 = new Author("FirstName 5", "LastName 5", 14);

        DBAuthor.save(author1);
        DBAuthor.save(author2);
        DBAuthor.save(author3);
        DBAuthor.save(author4);
        DBAuthor.save(author5);

        DBAuthor.delete(author2);

        List<Author> authorList = DBAuthor.getAuthors();

        Author author = DBAuthor.find(author1.getId());

    }
}
