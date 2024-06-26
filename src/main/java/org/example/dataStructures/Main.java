package org.example.dataStructures;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    
    Map<String, Person> map = new HashMap<>();
    Scanner in = new Scanner(new File("input.txt"));
    int n = in.nextInt();
    List<Person> personList = new ArrayList<>();
    for (int i = 0; i < n; i++) {

      String firstName = in.next();
      String secondName = in.next();
      int age = in.nextInt();
      String profession = in.next();
      Person person = new Person(firstName, secondName, age, profession, new ArrayList<>());
      map.put(person.getFirstName() + " " + person.getSecondName(), person);
      personList.add(person);
    }


    personList.sort(Comparator.comparing(Person::getProfession));
    personList.sort(Comparator.comparing(Person::getAge));
    personList.sort(Comparator.comparing(Person::getFirstName));
    personList.sort(Comparator.comparing(Person::getSecondName));

    for (Person person : personList) {
      System.out.println(person);
    }

    int m = in.nextInt();
    for (int i = 0; i < m; i++) {

      String firstName = in.next();
      String secondName = in.next();

      System.out.println(map.get(firstName + " " + secondName).getProfession());

      map.forEach((key, value) -> {
          System.out.println(value.getProfession());
        
      });

//      for (Person person : sortedList) {
//        if (person.getFirstName().equals(firstName) && person.getSecondName().equals(secondName)) {
//          System.out.println(person.getProfession());
//        }
    }
  }
}