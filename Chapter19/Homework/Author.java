package Chapter19.Homework;
/**
 * Created by Safeeullah Saifuddin
 * 11/10/2018
 * Chapter 19 Homework Streams
 */
public class Author {
    private String firstName, lastName;
    private int age;

    public Author(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\nSurname: " + lastName +
                "\nAge: " + age + "\n";
    }
}
