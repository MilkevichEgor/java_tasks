package org.example.dataStructures;

import java.util.List;
import java.util.Objects;

public class Person {

  private String firstName;
  private String secondName;
  private int age;
  private String profession;
  private List<Pet> friends;

  public Person() {}

  public Person(String firstName, String secondName,
                int age, String profession,
                List<Pet> friends) {
    this.firstName = firstName;
    this.secondName = secondName;
    this.age = age;
    this.profession = profession;
    this.friends = friends;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getSecondName() {
    return secondName;
  }

  public int getAge() {
    return age;
  }

  public String getProfession() {
    return profession;
  }

  public List<Pet> getFriends() {
    return friends;
  }


  @Override
  public String toString() {
    return firstName  + " " + secondName + " " + age + " " + profession;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age &&
            Objects.equals(firstName, person.firstName) &&
            Objects.equals(secondName, person.secondName) &&
            Objects.equals(profession, person.profession) &&
            Objects.equals(friends, person.friends);
  }

  @Override
  public int hashCode() {
    return Objects.hash(firstName, secondName, age, profession, friends);
  }
}
