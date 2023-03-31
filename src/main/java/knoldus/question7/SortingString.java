package knoldus.question7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingString {
    public static void main(String[] args) {
        HashSet<String> listOfString=new HashSet<String>();
        listOfString.add("Delhi");
        listOfString.add("Ghaziabad");
        listOfString.add("Noida");
        listOfString.add("Gurugram");
        listOfString.add("Faridabad");
        /* Adding the set values into ArrayList and sorting into Descending Order */
        ArrayList<String> sortedStrings=new ArrayList<>(listOfString);
        Collections.sort(sortedStrings, Collections.reverseOrder());
        System.out.println(sortedStrings);
    }
}
