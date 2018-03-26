

import java.util.*;
public class Chap4Homework {
    public static void main(String[] args){
        int rooms, totalRooms = 0, occuRooms, floors;
        double totalOccuRooms = 0, totalVacant;
        double occuRate;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome User, please enter the following information");
        System.out.println("How many floors does the hotel have?");
        floors = keyboard.nextInt();

        for (int i = 1; i <= floors; i++){
            System.out.printf("How many rooms are on floor %d\n", i);
            rooms = keyboard.nextInt();

            if (rooms < 10){
                System.out.println("Invalid input, number of rooms on a floor must be greater than or equal to 10.");
                i--;
                continue;
            }
            else{
                totalRooms = totalRooms + rooms;
            }

            System.out.printf("How many rooms are occupied on floor %d\n", i);
            occuRooms = keyboard.nextInt();

            if (occuRooms > rooms){
                System.out.println("Invalid input, the number of occupied rooms cannot be larger than the number of rooms on that floor.");
                i--;
                continue;
            }
            else{
                totalOccuRooms = totalOccuRooms + occuRooms;
            }
        }
        occuRate = totalOccuRooms/totalRooms;
        totalVacant = totalRooms - totalOccuRooms;
        System.out.printf("The total amount of rooms in all floors is %d\n", totalRooms);
        System.out.printf("The total amount of occupied rooms in the hotel is %.0f\n", totalOccuRooms);
        System.out.printf("The total amount of vacant rooms is %.0f\n", totalVacant);
        System.out.printf("The occupancy rate of the entire Hotel is %.2f\n", occuRate);


    }

}
