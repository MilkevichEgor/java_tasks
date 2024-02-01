package org.example.interview.streamapi;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.example.dataStructures.Person;

public class Main {

    public static void main(String[] args) throws IOException {

      List<Person> personList = new ArrayList<>();
      personList.add(new Person("Derek", "Banas", 35, "Manager", new ArrayList<>()));
      personList.add(new Person("John", "Whick", 20, "Developer", new ArrayList<>()));
      personList.add(new Person("David", "Fincher", 30, "Software Engineer", new ArrayList<>()));

      ArrayList<String> stringList = new ArrayList<>();
      stringList.add("One");
      stringList.add("OneAndOnly");
      stringList.add("Derek");
      stringList.add("Change");
      stringList.add("factory");
      stringList.add("justBefore");
      stringList.add("Italy");
      stringList.add("Italy");
      stringList.add("Thursday");
      stringList.add("");
      stringList.add("");
      List<String> streamList = stringList.stream()
          .filter(element -> element.contains("d")).toList(); // OneAndOnly, Derek
      System.out.println(streamList);

      // Stream of primitives
      IntStream intStream = IntStream.range(1, 3); // 1, 2
      intStream.forEach(System.out::println);
      LongStream longStream = LongStream.rangeClosed(1, 3); // 1, 2, 3
      longStream.forEach(System.out::println);

      Random random = new Random();
      DoubleStream doubleStream = random.doubles(3); // three random doubles
      doubleStream.forEach(System.out::println);
      IntStream intStream2 = random.ints(3); // three random ints
      intStream2.forEach(System.out::println);
      LongStream longStream2 = random.longs(3); // three random longs
      longStream2.forEach(System.out::println);

      // Stream of String
      IntStream streamOfChars = "abc".chars();
      streamOfChars.forEach(System.out::println); // 97, 98, 99
      Stream<String> streamOfString = Pattern.compile(", ").splitAsStream("a, b, c"); // a, b, c
      streamOfString.forEach(System.out::println);

      // Stream of Collection
      List<Person> personAverage = new ArrayList<>();
      personAverage.add(new Person("Derek", "Banas", 25, "Software Engineer", new ArrayList<>()));
      personAverage.add(new Person("John", "Banas", 20, "Developer", new ArrayList<>()));
      personAverage.add(new Person("Jane", "Banas", 30, "Manager", new ArrayList<>()));
      double averageAge = personAverage.stream()
          .collect(Collectors.averagingInt(Person::getAge));
      System.out.println("averageAge = " + averageAge); // 25

      // IntSummaryStatistics
      IntSummaryStatistics statistics = personAverage.stream()
          .collect(Collectors.summarizingInt(Person::getAge));
      System.out.println("statistics = " + statistics); // IntSummaryStatistics{count=3, sum=75, min=20, average=25.0, max=30}

      Map<Integer, List<Person>> collectorMapOfLists = personList.stream()
          .collect(Collectors.groupingBy(Person::getAge)); // {20=[John], 30=[David, Fincher], 35=[Derek]}
      System.out.println("collectorMapOfLists = " + collectorMapOfLists);

      Map<Boolean, List<Person>> mapPartioned = personList.stream()
          .collect(Collectors.partitioningBy(person -> person.getAge() > 20)); // {false=[Derek, John], true=[David, Fincher]}
      System.out.println("mapPartioned = " + mapPartioned);

      Set<Person> unmodifiableSet = personList.stream()
          .collect(Collectors.collectingAndThen(Collectors.toSet(),
              Collections::unmodifiableSet));
      System.out.println("unmodifiableSet = " + unmodifiableSet);

      // Stream of paths
      List<String> uris = new ArrayList<>();
      uris.add("./input.txt");
      Stream<Path> streamPaths = uris.stream().map(uri -> Paths.get(uri)); // input.txt
      Path path = Paths.get("./input.txt");
      Stream<String> streamOfStrings = Files.lines(path);
      Stream<String> streamWithChareset = Files.lines(path, Charset.forName("UTF-8")); // generate stream of text file
//      streamWithChareset.forEach(System.out::println);

      // Stream of arrays
      String[] array = new String[] {"a", "b", "c"};
      Stream<String> streamArray = Arrays.stream(array); // a, b, c
      streamArray = Stream.of("a", "b", "c");

      // Stream builder
      Stream<String> streamBuilder = Stream.<String>builder().add("a").add("b").add("c").build(); // a, b, c

      // Stream generate
      Stream<String> streamGenerate = Stream.generate(() -> "element").limit(3); // element, element, element

      // Stream iterate
      Stream<Integer> streamIterated = Stream.iterate(40, n -> n + 2).limit(5); // 40, 42, 44, 46 48
      streamIterated.forEach(System.out::println);

      List<Person> personListIterate = new ArrayList<>();
      personList.add(new Person(
          "Derek", "Banas", 33, "Developer", new ArrayList<>(List.of("Derek", "Banas"))));
      Stream<String> streamProfession
          = personList.stream().flatMap(person -> person.getFriends().stream()); // ["Derek", "Banas"]
      streamProfession.forEach(System.out::println);

      List<String> validList = new ArrayList<>();
      validList.add("Derek");
      validList.add("David");
      validList.add("John");
      validList.add("Jane");

      boolean isValid = validList.stream().anyMatch(element -> element.contains("d")); // true
      System.out.println(isValid);
      boolean isValidOne = validList.stream().allMatch(element -> element.contains("d")); // false
      System.out.println(isValidOne);
      boolean isValidTwo = validList.stream().noneMatch(element -> element.contains("d")); // false
      System.out.println(isValidTwo);

      var streamEmpty = Stream.empty().allMatch(Objects::nonNull); // always true
      System.out.println("Empty stream allMatch: " + streamEmpty);
      var streamEmpty2 = Stream.empty().anyMatch(Objects::nonNull); // always false
      System.out.println("Empty stream anyMatch: " + streamEmpty2);


      List<Integer> list = Stream.of(1, 2, 3, 4, 5, 5, 5, 4, 6).toList();
      long count = list.stream().distinct().count(); // 6
      System.out.println("Count unique elements: " + count);

      Integer[][] array2d = new Integer[][] {
          {1, 2, 3},
          {4, 5}
      };
      List<Integer> list2 = Arrays.stream(array2d).flatMap(Arrays::stream).toList(); // [1, 2, 3, 4, 5]
      System.out.println(list2);

      // Reduction Stream
      List<Integer> integers = Arrays.asList(1, 1, 1);
      Integer reduced = integers.stream().reduce(23, (a, b) -> a + b); // 26
      System.out.println("Reduced: " + reduced);

      List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
      int sum = numbers.stream().reduce(0, Integer::sum); // 21
      System.out.println("Reduced: " + sum);

      List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
      String result = letters.stream().reduce("", String::concat); // abcde
      System.out.println("Reduced: " + result);

      OptionalInt reduced2 = IntStream.range(1, 4).reduce((a, b) -> a + b); // 6
      System.out.println("Reduced: " + reduced2.getAsInt());

      int reducedTwoParams = IntStream.range(1, 4).reduce(10, (a, b) -> a + b); // 16
      System.out.println("Reduced: " + reducedTwoParams);

      int reducedParallel = Arrays.asList(1, 2, 3).parallelStream()
          .reduce(10, (a, b) -> a + b, (a, b) -> {
            System.out.println("combiner was called");
            return a + b;
          }); // 36
      System.out.println("Reduced: " + reducedParallel);

      // Referencing a Stream
      Stream<String> stream =
          Stream.of("a", "b", "c").filter(element -> element.contains("b"));
      Optional<String> anyElement = stream.findAny();
//      Optional<String> firstElement = stream.findFirst(); // exception IllegalStateException:


      List<String> elements = Stream.of("a", "b", "c")
          .filter(element -> element.contains("b")).toList();
      Optional<String> anyElement2 = elements.stream().findAny();
      Optional<String> firstElement2 = elements.stream().findFirst();
      anyElement2.ifPresent(System.out::println); // b
      firstElement2.ifPresent(System.out::println); // b

      // Stream pipeline
      Stream<String> stream1 = Stream.of("abcd", "bbcd", "cbcd")
          .skip(1)
          .map(element -> element.substring(0, 2)); // bb, cb
      stream1.forEach(System.out::println);

      List<String> list1 = Arrays.asList("abc1", "abc2", "abc3");
      long size = list1.stream().skip(1)
          .map(element -> element.substring(0, 3)).sorted().count();
      System.out.println("Size: " + size);

      List<String> list3 = Arrays.asList("abc1", "abc2", "abc3");

      Optional<String> streamLazy = list3.stream().filter(element -> {
        System.out.println("filter() was called");
        return element.contains("2");
      }).map(element -> {
        System.out.println("map() was called");
        return element.toUpperCase();
      }).findFirst();
      streamLazy.ifPresent(System.out::println);

      List<Person> people = personList.stream()
          .filter(person -> person.getProfession().contains("Engineer")).toList();
      System.out.println(people);

      // Parallel Stream
      Stream<Person> streamOfCollection = personList.parallelStream();
      boolean isParallel = streamOfCollection.isParallel();
      boolean bigAge = streamOfCollection.map(person -> person.getAge() * 2)
          .anyMatch(age -> age > 50);
      System.out.println("Is parallel: " + isParallel);
      System.out.println("Is big age: " + bigAge);

      IntStream intStreamParallel = IntStream.range(1, 150).parallel();
      boolean isParallel2 = intStreamParallel.isParallel();
      System.out.println("Is parallel: " + isParallel2);

      IntStream intStreamSequential = intStreamParallel.sequential();
      boolean isParallel3 = intStreamSequential.isParallel();
      System.out.println("Is parallel: " + isParallel3);
    }
}
