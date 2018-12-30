package Chapter19.Homework;
/**
 * Created by Safeeullah Saifuddin
 * 11/10/2018
 * Chapter 19 Homework Streams
 */
public class Book {
    private String name, ISBN;
    private Author author;

    public Book(Author author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return author.toString();
    }
}
