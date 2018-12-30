package Chapter17.Lab;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Safeeullah Saifuddin
 * CSP 26B
 * 10/21/2018
 * Chapter 17 Lab
 */

public class QuickSortPartition {
    private static ArrayList<Integer> unsortedArrayList = new ArrayList<>();
    public static void main(String[] args) {
        addElementsToArrayList();
        System.out.println(unsortedArrayList);
        quickSortArray(unsortedArrayList, 1, 0);


    }

    private static void quickSortArray(ArrayList<Integer> unsortedArrayList, int start, int end) {

        int pivotPoint = end;
        int pivotValue = unsortedArrayList.get(pivotPoint);
        int endOfList = start;
        for (int i= 0; i < unsortedArrayList.size()-1; i++) {
            System.out.println("for loop unchecked " + i + unsortedArrayList);

            int element = unsortedArrayList.get(i);
            if (element < pivotValue) {
                System.out.println("for loop checked " + i + unsortedArrayList);
                endOfList++;
                Collections.swap(unsortedArrayList, i, endOfList);
                System.out.println("for loop checked after " + i + unsortedArrayList);
            }
        }
        Collections.swap(unsortedArrayList, pivotPoint, endOfList);

        System.out.println(unsortedArrayList);
    }

    private static void addElementsToArrayList() {
        unsortedArrayList.add(35);
        unsortedArrayList.add(20);
        unsortedArrayList.add(18);
        unsortedArrayList.add(46);
        unsortedArrayList.add(28);
        unsortedArrayList.add(58);
        unsortedArrayList.add(73);
        unsortedArrayList.add(15);
        unsortedArrayList.add(56);
        unsortedArrayList.add(87);
    }

}
