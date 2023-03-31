package knoldus.question1;

import java.util.HashMap;

public class DisplayNameAndAge {
    public static void main(String[] args) {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("Anshika",23);
        map.put("Jasleen",22);
        map.put("Salil",24);
        map.put("Riya",23);
        System.out.println(map);
    }
}
