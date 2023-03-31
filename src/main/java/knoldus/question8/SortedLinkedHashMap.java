package knoldus.question8;

import java.util.*;

public class SortedLinkedHashMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap=new TreeMap<>();
        treeMap.put("Monday", 1);
        treeMap.put("Tuesday", 2);
        treeMap.put("Wednesday", 3);
        treeMap.put("Thursday", 4);
        treeMap.put("Friday", 5);
        treeMap.put("Saturday", 6);
        treeMap.put("Sunday", 7);

        // Creating a Comparator to sort the TreeMap by values in descending order
        Comparator<Map.Entry<String, Integer>> valueComparator = new Comparator<Map.Entry<String,Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entryMap1, Map.Entry<String, Integer> entryMap2) {
                Integer value1 = entryMap1.getValue();
                Integer value2 = entryMap2.getValue();
                return value2.compareTo(value1);
            }
        };

        // Sorting the entries in the TreeMap by values using the valueComparator
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(treeMap.entrySet());
        Collections.sort(entryList, valueComparator);

        // Creating a new LinkedHashMap to store the sorted entries
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : entryList) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }

        // Printing the sorted entries in the LinkedHashMap
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
