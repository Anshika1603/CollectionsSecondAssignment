package knoldus.question14;

import java.util.*;

public class MapSortDescending {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>(); // initialize your map of strings to integers

        // adding entries to the map
        map.put("foo", 3);
        map.put("bar", 1);
        map.put("baz", 2);

        // creating a list of entries from the map
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());

        // sorting the list in descending order by value
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> entryMap1, Map.Entry<String, Integer> entryMap2) {
                return entryMap2.getValue().compareTo(entryMap1.getValue());
            }
        });

        // creating a new map from the sorted list of entries
        Map<String, Integer> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        System.out.println(sortedMap); // printing the sorted map
    }
}
