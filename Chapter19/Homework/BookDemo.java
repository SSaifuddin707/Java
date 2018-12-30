package Chapter19.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Safeeullah Saifuddin
 * 11/10/2018
 * Chapter 19 Homework Streams
 */

public class BookDemo {
    private static ArrayList<Book> library = new ArrayList<>();

    public static void main(String[] args) {
        createBookArrayList();
        createStreamList();
    }

    /**
     * Creates Stream object of Array list that is used to create an array of authors over 50 years of age and the array list has size 10
     */
    private static void createStreamList() {
        Stream<Book> libraryStream = library.stream();
        List<Book> outputArray = libraryStream
                .filter(x -> x.getAuthor().getAge() >= 50)
                .limit(10)
                .map(p -> new Book(new Author(p.getAuthor().getFirstName(), p.getAuthor().getLastName() , p.getAuthor().getAge())))
                .collect(Collectors.toList());

        System.out.println(outputArray.toString());
    }

    /**
     * Creates Array list of 20 Books with Author objects.
     * Prints out size of array list
     */
    private static void createBookArrayList() {
        library.add(new Book(
                new Author("J. K.",
                        "Rowling",
                        53)
        ));
        library.add(new Book(
                new Author("Stephen",
                        "King",
                        71)
        ));
        library.add(new Book(
                new Author("Agatha",
                        "Christie",
                        20)
        ));
        library.add(new Book(
                new Author("Mark",
                        "Angelou",
                        70)
        ));
        library.add(new Book(
                new Author("Maya",
                        "Achebe",
                        52)
        ));
        library.add(new Book(
                new Author("Dr",
                        "Seuss",
                        18)
        ));
        library.add(new Book(
                new Author("Peter ",
                        "Ackroyd",
                        51)
        ));
        library.add(new Book(
                new Author("George",
                        "Eliot",
                        90)
        ));
        library.add(new Book(
                new Author("Jane",
                        "Austin",
                        40)
        ));
        library.add(new Book(
                new Author("Ayn",
                        "Rand",
                        18)
        ));
        library.add(new Book(
                new Author("Ernest ",
                        "Hemingway",
                        26)
        ));
        library.add(new Book(
                new Author("Dante",
                        "Alighieri",
                        90)
        ));
        library.add(new Book(
                new Author("Maya",
                        "Rowling",
                        75)
        ));
        library.add(new Book(
                new Author("Anne",
                        "Rice",
                        55)
        ));
        library.add(new Book(
                new Author("Nora",
                        "Roberts",
                        56)
        ));
        library.add(new Book(
                new Author("Anne",
                        "Brontë",
                        80)
        ));
        library.add(new Book(
                new Author("Charles",
                        "Dickens",
                        90)
        ));
        library.add(new Book(
                new Author("Barbara",
                        "Kingsolver",
                        30)
        ));
        library.add(new Book(
                new Author("Charlotte",
                        "Bronte",
                        59)
        ));
        library.add(new Book(
                new Author("Scott",
                        "Fitzgerald",
                        60)
        ));
        System.out.println("Library array list of size " + library.size() + " has been created");
    }

}
