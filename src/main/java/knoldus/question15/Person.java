package knoldus.question15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jasleen", 25));
        people.add(new Person("Rishika", 30));
        people.add(new Person("Rahul", 20));
        people.add(new Person("Sahil", 35));

        /* Using Comparator to sort list people */
        Comparator<Person> comparator = new PersonComparator();
        Collections.sort(people, comparator);

        /* printing sorted list of persons */
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
