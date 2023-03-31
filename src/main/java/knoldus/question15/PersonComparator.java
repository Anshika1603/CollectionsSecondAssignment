package knoldus.question15;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    /* Person Comparator to compare and sort persons */
    @Override
    public int compare(Person person1, Person person2) {
        return Integer.compare(person1.getAge(), person2.getAge());
    }
}