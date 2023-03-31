package knoldus.question13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(45);
        list.add(32);
        list.add(92);
        list.add(23);
        Collections.shuffle(list); // shuffle the order of elements in the list
        System.out.println(list); // print the shuffled list
    }
}
