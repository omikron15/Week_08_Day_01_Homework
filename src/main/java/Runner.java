import db.DBHelper;
import db.DBHelper;
import models.Author;
import models.Book;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Author author1 = new Author("FirstName 1", "LastName 1", 3);
        Author author2 = new Author("FirstName 2", "LastName 2", 10);
        Author author3 = new Author("FirstName 3", "LastName 3", 1);
        Author author4 = new Author("FirstName 4", "LastName 4", 7);
        Author author5 = new Author("FirstName 5", "LastName 5", 14);

        DBHelper.save(author1);
        DBHelper.save(author2);
        DBHelper.save(author3);
        DBHelper.save(author4);
        DBHelper.save(author5);

        DBHelper.delete(author2);

        List<Author> authorList = DBHelper.getAll(Author.class);

        Author author = DBHelper.find(Author.class, author1.getId());

        Book book1 = new Book("Title 1", author1);
        Book book2 = new Book("Title 2", author1);
        Book book3 = new Book("Title 3", author4);
        Book book4 = new Book("Title 4", author3);
        Book book5 = new Book("Title 5", author5);

        DBHelper.save(book1);
        DBHelper.save(book2);
        DBHelper.save(book3);
        DBHelper.save(book4);
        DBHelper.save(book5);

        DBHelper.delete(book4);

        List<Book> booklist = DBHelper.getAll(Book.class);

        Book book = DBHelper.find(Book.class, book1.getId());



    }
}
