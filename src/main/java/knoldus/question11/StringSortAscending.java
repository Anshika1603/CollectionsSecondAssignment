package knoldus.question11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StringSortAscending {

        public static void main(String[] args) {
            List<String> listOfString =new ArrayList<>();
            // initializing list of strings
                listOfString.add("Delhi");
                listOfString.add("Ghaziabad");
                listOfString.add("Noida");
                listOfString.add("Gurugram");
                listOfString.add("Faridabad");
            Collections.sort(listOfString); // sorting the list in ascending order
            System.out.println(listOfString); // printing the sorted list
        }
}
