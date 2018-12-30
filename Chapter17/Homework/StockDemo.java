package Chapter17.Homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Safeeullah Saifuddin
 * Java 2
 * 10/23/2018
 * Sorts and Searches ArrayList of Stock objects
 * Worst case time complexity:
 * O(n) + O(n) + O(n) + O(n) + O(n^3)
 * So the time complexity of this program is O(n^3)
 */

public class StockDemo {
    private static ArrayList<Stock> stockArray = new ArrayList<>();
    private static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        createStockArray();
        System.out.println("Unsorted Array: ");
        printOutArray(stockArray);
        quickSortArray();
        System.out.println("Sorted Array: ");
        printOutArray(stockArray);
        requestSearch();
    }

    /**
     * Creates ArrayList of Stock objects
     * O(n)
     */
    private static void createStockArray() {
        stockArray.add(new Stock("APPLE", 650));
        stockArray.add(new Stock("GOOGLE", 1000));
        stockArray.add(new Stock("DCEU", 1500));
        stockArray.add(new Stock("MARVEL", 100));
        stockArray.add(new Stock("TWITCH", 56));
        stockArray.add(new Stock("YOUTUBE", 9000));
        stockArray.add(new Stock("CORSAIR", 50000));
        stockArray.add(new Stock("MSI", 978));
        stockArray.add(new Stock("SJDC", 296));
        stockArray.add(new Stock("BERKELEY", 5666));
        stockArray.add(new Stock("OK", 8765));
        stockArray.add(new Stock("GORILLAZ", 890));
        stockArray.add(new Stock("VIBE", 345));
        stockArray.add(new Stock("SNOOP DOG", 420));
        stockArray.add(new Stock("CALVIN KLEIN", 6666));
        stockArray.add(new Stock("JELLY", 6));
        stockArray.add(new Stock("CHAIN", 562));
        stockArray.add(new Stock("DATE", 4845));
        stockArray.add(new Stock("SANTA", 4734));
        stockArray.add(new Stock("VEVO", 900));
        stockArray.add(new Stock("TAME IMPALA", 456));

    }

    /**
     * Prints out any ArrayList containing Stock objects passed as argument
     * O(n)
     * @param stockArray    ArrayList of Stock objects to be printed out
     */
    private static void printOutArray(List<Stock> stockArray) {
        for (int i = 0; i < stockArray.size(); i++) {
            System.out.println(stockArray.get(i).toString());
        }
    }

    /**
     * Creates instance of QuickSortStockArrayList class and passes Arraylist of Stock objects as parameter to constructor.
     * Replaces old ArrayList with new sorted ArrayList
     * O(n^3)
     */
    private static void quickSortArray() {
        QuickSortStockArrayList QSA = new QuickSortStockArrayList(stockArray);
        stockArray = QSA.getStockArray();
    }


    /**
     * Prompts user to enter info of Stock they are searching for.
     * Calls querySearch() method to handle search
     * O(n)
     */
    private static void requestSearch() {
        System.out.println("Enter the stock name");
        String searchStockName = keyboard.nextLine();
        System.out.println("Enter the price of the stock");
        double searchStockPrice = keyboard.nextDouble();
        querySearch(searchStockName, searchStockPrice);

    }


    /**
     * Creates Stock object from the data that the user inputted.
     * Uses equals method from Stock class to check if object is in ArrayList.
     * Displays appropriate message
     * O(n)
     * @param searchStockName   Stock name that is to be searched
     * @param searchStockPrice  Stock price that is to be searched
     */
    private static void querySearch(String searchStockName, double searchStockPrice) {
        Stock searchQuery = new Stock(searchStockName, searchStockPrice);
        boolean found = false;
        for (Stock s : stockArray) {
            if (searchQuery.equals(s)) {
                displayStockFound(s);
                found = true;
            }
        }
        if (!found) displayStockNotFound(searchQuery);
    }

    /**
     * Displays message when stock is not found. Displays info that user inputted
     * @param searchQuery
     */
    private static void displayStockNotFound(Stock searchQuery) {
        System.out.println("Sorry, stock not found");
        System.out.println(searchQuery.toString() + " not found");
    }

    /**
     * Displays found stock message with information of found stock
     *
     * @param s Stock that was searched and found
     */
    private static void displayStockFound(Stock s) {
        System.out.println("Stock found!");
        System.out.println(s.toString());
    }



}
