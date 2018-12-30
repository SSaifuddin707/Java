package Chapter19.Lab;
/**
 * Created by Safeeullah Saifuddin
 * Chapter 19 Lab
 * Sets
 */

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Sets {
    private static Set<String> stringSet = new HashSet<>();

    public static void main(String[] args) {
        File file =
                new File("C:\\Users\\12flu\\Documents\\Java 2\\src\\Chapter19\\Lab\\ch19textfile.txt");

        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(br.readLine());


            for (String line; (line = br.readLine()) != null; ) {
                stringBuilder.append(line);
            }

            System.out.println(stringBuilder);
            String[] tokens = stringBuilder.toString().split("[\\n\\s]");
            stringSet.addAll(Arrays.asList(tokens));
            System.out.println(stringSet);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
