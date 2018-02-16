import java.util.Scanner;

public class Chap3Lab
{
   public static void main(String[] args)
   {
      //Declaring Variables
      int hours;
      double packageA,packageB,packageC;
      double packageAover, packageBover;
      Scanner myInput = new Scanner(System.in);
      String A, B, C;
      String pack;
      double moneySaved;
      
      //Cost for packages with no additional hours
      packageA = 9.95;
      packageB = 13.95;
      packageC = 30;
      A = "A";
      B = "B";
      C = "C";
      moneySaved = 0;
      
      //Start of Program
      System.out.println("Welcome User, Please enter the following information.");
      
      
      //Asking for Package Letter
      System.out.println("Which package have you purchased? [A/B/C]");
      pack = myInput.nextLine();
      
      //Asking for amount of hours
      System.out.println("How many hours of internet usage have you consumed?");
      hours = myInput.nextInt();
      
      //Calculations for cost for packages with additional hours
      packageAover = 2* hours + 9.95;
      packageBover = 1 * hours + 13.95;
      
      //Checking if inputed package is Package A
      if (A.equals(pack))
         //Checking if additional hour fees neccessary
         if (hours < 10)
            System.out.println("Your amount due is " + packageA);
         else
            System.out.println("Your amount due is " + packageAover);
    
      //Checking if inputed package is Package B  
      if (B.equals(pack))
         //Checking if additional hour fees neccessary
         if (hours < 20)
            System.out.println("Your amount due is " + packageB);
         else
            System.out.println("Your amount due is " + packageBover);
      
      //Checking if package is Package C, no additional hour fees possible      
      if (C.equals(pack))
         System.out.println("Your amount due is " + packageC);
      
      
      //Money Saved
      if (A.equals(pack))
         //Checking if money can be saved. If true than also true for Package C
         if (packageAover > packageBover)
               {
               moneySaved = (float)(packageAover - packageBover);
               System.out.println("By switching to Package B, you can save " + moneySaved);
               moneySaved = (float)(packageAover - packageC);
               System.out.println("By switching to Package C, you can save " + moneySaved);
               }
            
         if (B.equals(pack))
            if (packageBover > packageC)
               {
               moneySaved = (float)(packageBover - packageC);
               System.out.println("By switching to Package C, you can save " + moneySaved);
               }        
            

      
      
   }
}