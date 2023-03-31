package knoldus.question10;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class PriorityQueueSorting {
    public static void main(String[] args) {
        // Creating a PriorityQueue of integers with values
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(5);
        queue.add(3);
        queue.add(8);
        queue.add(1);
        queue.add(2);

        // Creating a new ArrayList to store the sorted integers
        ArrayList<Integer> list = new ArrayList<>();

        // Removing integers from the PriorityQueue and adding them to the ArrayList in descending order
        while (!queue.isEmpty()) {
            int number = queue.poll();
            list.add(0, number);
        }

        // Printing the sorted integers in the ArrayList
        System.out.println(list);
    }
}
