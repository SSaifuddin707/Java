package Chapter19.InClass;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Safeeullah Saifuddin
 * CSP 26B
 * 10/23/2018
 */
public class Lab {
    private static List<String> stringList = new ArrayList<>();

    public static void main(String[] args) {
        createArrayList();
        displayArrayList();
        ListIterator<String> it = stringList.listIterator();
        removeSecondElement(it);
        insertThirdElement(it);
        replaceSixthElement(it);
        displayElementsGreaterThanZero();

    }

    private static void createArrayList() {
        stringList.add("Chris");
        stringList.add("John");
        stringList.add("Kyle");
        stringList.add("Michael");
        stringList.add("Jessica");
        stringList.add("Susan");
        stringList.add("Smith");
        stringList.add("Birmingham");
    }

    private static void displayArrayList() {
        System.out.println("ArrayList: ");

        for (String s : stringList) {
            System.out.println(s);
        }
    }

    private static void removeSecondElement(ListIterator<String> it) {

        for (int i = 0; i < 1; i++) {
            it.next();
        }
        System.out.println("\nSecond element: ");
        System.out.println(it.next());
        it.remove();
    }

    private static void insertThirdElement(ListIterator<String> it) {
        it = stringList.listIterator();
        for (int i = 0; i < 2; i++) {
            it.next();
        }
        it.add("Jenny");
    }

    private static void replaceSixthElement(ListIterator<String> it) {
        it = stringList.listIterator();
        for (int i = 0; i < 6; i++) {
            it.next();
        }
        it.set("Johnny");
    }


    private static void displayElementsGreaterThanZero() {
        stringList.forEach(
                x -> {
                    if (x.length() > 8) {
                        System.out.println(x);
                    }
                }
        );
    }


}
