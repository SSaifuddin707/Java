package Chapter17.Lab;

import java.util.ArrayList;
import java.util.Collections;
/**
 * Safeeullah Saifuddin
 * CSP 26B
 * 10/21/2018
 * Chapter 17 Lab
 */

/**
 * Time Analysis:
 * Time for 1 Comparison = C
 * Total time = C1 x (1 + 2 + 3... + N) x C2 x (1 + 2 + 3...+ N)
 *            = *something* x N^2
 * O(N^2)
 */
public class QuickSort {
    private static ArrayList<Integer> unsortedArrayList = new ArrayList<>();

    public static void main(String[] args) {
        addElementsToArrayList();
        System.out.println("Unsorted Array List: " + unsortedArrayList);
        quickSort(unsortedArrayList, 0, unsortedArrayList.size()-1);
        System.out.println("Quick sorted array list: " + unsortedArrayList);
    }

    private static void quickSort(ArrayList<Integer> unsortedArrayList, int start, int end) {
        int pivotPoint;
        if (start < end){
            pivotPoint = partition(unsortedArrayList, start, end);
            quickSort(unsortedArrayList, start, pivotPoint - 1);
            quickSort(unsortedArrayList, pivotPoint +1, end);
        }
    }

    private static int partition(ArrayList<Integer> unsortedArrayList, int start, int end) {
        int pValue;
        int midPoint;
        int endOfList;

        midPoint = (start + end) / 2;

        Collections.swap(unsortedArrayList, start, midPoint);

        pValue = unsortedArrayList.get(start);

        endOfList = start;

        for (int i = start + 1; i<= end; i++){
            if (unsortedArrayList.get(i) < pValue){
                endOfList++;
                Collections.swap(unsortedArrayList, endOfList, i);
            }
        }

        Collections.swap(unsortedArrayList, start, endOfList);
        return endOfList;


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
