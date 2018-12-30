package Chapter11.Lab;
//Created by Safeeullah Saifuddin
//Java 26B
//Chapter 11 Lab
public class InvalidMonthException extends Exception {

    public InvalidMonthException() {
        super("Invalid month number. There are only 12 months in a year!");
    }

    public InvalidMonthException(int monNum) {
        super(monNum + " is not a valid month number!");
    }

}
