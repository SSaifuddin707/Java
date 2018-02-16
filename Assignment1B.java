/*A soft drink company recently surveyed 12467 of its customers and found that approximately 14 percent 
of those surveyed purchase one or more energy drink per week. Of those customer
who purchase energy drinks, approximately 64 percent of them prefer citrus-flavored
energy drinks. Write a program that displays the following:

    the approximate number of customers who purchase one or more energy drinks per week
    the approximate number of customers who prefer citrus-flavor energy drinks
*/

public class Assignment1B
{
   public static void main(String[] args)
   {
      double weeklyCustomers;
      double citrusCustomers;
      
      weeklyCustomers = (int)((0.14)*(12467.0));
      System.out.println("Number of weekly energy drink consumers: " + weeklyCustomers);
      
      citrusCustomers = (int) ((0.64)*(weeklyCustomers));
      System.out.println("Number of customers that prefer citrus drinks: " + citrusCustomers);
      
    }
}