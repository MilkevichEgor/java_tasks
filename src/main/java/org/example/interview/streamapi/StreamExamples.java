package org.example.interview.streamapi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;
import org.example.dataStructures.Person;
import org.example.dataStructures.Pet;

public class StreamExamples {

  Random random = new Random();

  public static void main(String[] args) throws IOException {
	Person person = new Person("Derek", "Banas", 35, "Manager", new ArrayList<>());

	StreamExamples streamExamples = new StreamExamples();
	streamExamples.streamExamples();

  }

  public void streamExamples() throws IOException {
//	List<Integer> integersList = Stream.of(1, 2, 3, 4, 5, 6, 7).toList();
//	List<Integer> integersList2 = Stream.of(1, 2, 3, 4, 4, 3, 2, 5, 6, 7).toList();
//	integersList.stream().filter(i -> i < 3).forEach(System.out::println);
//	integersList2.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
//	integersList.stream().filter(i -> i > 3).limit(3).forEach(System.out::println);

//	Integer integer = Stream.of(1, 2, 3, 4, 5)
//			.filter(i -> i % 2 == 0)
//			.findFirst().get();
//	System.out.println(integer);
//
//	List<Integer> integersList = Stream.of(1, 2, 3, 4, 5, 6, 7).toList();
//	Integer sum = integersList.stream().mapToInt(i -> i).sum();
//	System.out.println(sum);


//	Stream<Long> stream2 = Stream.of(1L, 2L, 3L);
//	List<Long> listConcat = Stream.concat(stream1, stream2).toList();
//	listConcat.forEach(System.out::println);

//	Path path = Path.of("/home/fusion/Documents/common.txt");
//	Files.lines(path).forEach(System.out::println);

//	Map<String, String> map = new HashMap<>();
//	map.put("key1", "value1");
//
//	map.entrySet().stream().forEach(System.out::println);
//	map.values().stream().forEach(System.out::println);

//	List<Person> personList = new ArrayList<>();
//	List<Pet> petList = List.of(new Pet("Bob", 12, "Dog"), new Pet("Jill", 2, "Cat"));
//
//	personList.add(new Person("Derek", "Banas", 35, "Manager", new ArrayList<>()));
//	personList.add(new Person("John", "Whick", 20, "Developer", new ArrayList<>()));
//	personList.add(new Person("David", "Fincher", 30, "Software Engineer", petList));
//
//	List<Pet> strings = personList.stream()
//			.flatMap(person -> person.getFriends().stream())
//			.toList();
//
//	System.out.println(strings);
//
//	Integer[][] array2d = new Integer[][]{
//			{1, 2, 3},
//			{4, 5, 6}
//	};

//	Arrays.stream(array2d).flatMap(Arrays::stream).forEach(System.out::println);

	List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);
	List<Integer> ages = List.of(1, 2, 3, 4, 5, 6);

//	int sum1 = numbers.stream().reduce(0, Integer::sum);
//	int sum2 = numbers.stream().reduce(0, (subtotal, element) -> subtotal + element);

//	int sum1 = numbers
//			.parallelStream()
//			.reduce(0, (a, b) -> a + b, Integer::sum);
//
//	int sum2 = ages
//			.parallelStream()
//			.reduce(0, Integer::sum, Integer::sum);

	List<String> letters = List.of("a", "b", "c", "d", "e");
	List<String> letters2 = List.of("Bob", "Jill", "Tom", "Joe");

	Map<Integer, String> map = IntStream.range(0, letters2.size())
			.boxed()
			.collect(Collectors.toMap(i -> i + 1, letters2::get));
	System.out.println(map);

//	String result = letters.stream().reduce("", String::concat);
//
//	String result2 = letters.stream().reduce("", (partitalString, element) -> partitalString + element);
  }
}
