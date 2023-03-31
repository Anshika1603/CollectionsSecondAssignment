package knoldus.question6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArraylist {
    public static void main(String[] args) {
        List<Integer> sortArrayList=new ArrayList<>();
        sortArrayList.add(10);
        sortArrayList.add(20);
        sortArrayList.add(5);
        sortArrayList.add(15);
        sortArrayList.add(25);
        /* Sorting  ArrayList using streams */
        List<Integer> numbers =sortArrayList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List: "+numbers);
    }
}
