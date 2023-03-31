package knoldus.question12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MaxIntegerOfList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(45);
        list.add(32);
        list.add(92);
        list.add(23);
        int max = Collections.max(list); // finding the maximum value in the list
        System.out.println("The maximum value is " + max); // printing the maximum value
    }
}
