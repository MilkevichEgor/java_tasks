package org.example.dataStructures;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person p1, Person p2) {
      return p1.getAge() - (p2.getAge());
    }

}
