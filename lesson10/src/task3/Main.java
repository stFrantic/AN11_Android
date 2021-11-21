package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("John"));
        persons.add(new Person("Mike"));
        persons.add(new Person("Adam"));
        persons.add(new Person("Rose"));
        persons.add(new Person("Harry"));
        persons.add(new Person("Elon"));
        for (Person p : persons) {
            System.out.println(p.toString());
        }
        System.out.println("-------------------------------");
        persons.get(1).setName("Adam");
        for (Person p : persons) {
            System.out.println(p.toString());
        }
        System.out.println("-------------------------------");
        Person mike = new Person("Mike");
        System.out.println(persons.contains(mike));
        System.out.println("-------------------------------");
        persons.remove(persons.size() - 1);
        for (Person p : persons) {
            System.out.println(p.toString());
        }
        System.out.println("-------------------------------");
        persons.removeAll(persons);
        System.out.println(persons.toString());
    }
}
