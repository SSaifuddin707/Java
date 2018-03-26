import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Chap4Lab {
    public static void main(String[] args) {
        int rainfall, years;
        int totalRainfall = 0;
        double averageRainfall;
        int months;

        Random rand = new Random();
        Scanner myInput = new Scanner(System.in);

        years = ThreadLocalRandom.current().nextInt(1, 6);
        months = 12 * years;

        for (int i= 1; i <= years; i++){
            for (int s = 1; s < 13; s++) {
                System.out.printf("Enter the amount of rainfall in inches for month %d and year %d\n" ,s, i);
                rainfall = myInput.nextInt();
                if (rainfall > 0){
                    totalRainfall = totalRainfall + rainfall;
                }
                else{
                    System.out.println("Invalid input please input a valid amount of rainfall.");
                    s--;
                }
            }
        }
        averageRainfall = totalRainfall/months;
        System.out.printf("Total Months: %d\n", months);
        System.out.printf("Total Inches of Rainfall: %d\n", totalRainfall);
        System.out.printf("Average Rainfall per Month: %.2f\n", averageRainfall);
        }
}

