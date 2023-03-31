package knoldus.question9;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

// Creating a custom object class with a name field
class Person {
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class SortingLinkedList {

    public static void main(String[] args) {
        // Creating a LinkedList of custom objects
        LinkedList<Person> personList = new LinkedList<>();
        personList.add(new Person("Anshika"));
        personList.add(new Person("Vanshika"));
        personList.add(new Person("Rishika"));

        // Sorting the LinkedList in alphabetical order by the "name" field using a Comparator
        Collections.sort(personList, new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                String name1 = person1.getName();
                String name2 = person2.getName();
                return name1.compareToIgnoreCase(name2);
            }
        });

        // Printing the sorted LinkedList
        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}

