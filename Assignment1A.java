import java.util.Scanner;

public class Assignment1A
{  
   private static Scanner myInput;

public static void main(String[] args)
   {
      //declaring variables
      float regHours;
      float regPayRate;
      float overHours;
      float overPayRate;
      float regGrossPay;
      float overGrossPay;
      float totalGrossPay;
      
      //accepting input from user
      System.out.println("Welcome User, please enter the following information.");
      myInput = new Scanner(System.in);
      System.out.println("How many non-overtime hours have you worked?");
      regHours = myInput.nextFloat();
           
      System.out.println("What is the regular hourly pay rate?");
      regPayRate = myInput.nextFloat();
       
      System.out.println("how many overtime hours have you worked?");
      overHours = myInput.nextFloat();
     
      System.out.println("What is the overtime hourly pay rate?");
      overPayRate = myInput.nextFloat();
      
      //calculating output
      regGrossPay = regHours*regPayRate;
      System.out.println("Regular Gross Pay: " + regGrossPay);
      
      overGrossPay = overHours*overPayRate;
      System.out.println("Overtime Gross Pay: " + overGrossPay);
      
      totalGrossPay = regGrossPay + overGrossPay;
      System.out.println("Total Gross Pay: " + totalGrossPay);
      
      
      
    }
}