package Chapter11.Lab;
//Created by Safeeullah Saifuddin
//Java 26B
//Chapter 11 Lab
import java.util.Scanner;

public class MonthDemo {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int monthNumber;
        System.out.println("Please enter a month number");
        try{
            monthNumber = keyboard.nextInt();
            Month month = new Month(monthNumber);
        }catch (InvalidMonthException e){
            System.out.println(e.getMessage());
        }
    }
}