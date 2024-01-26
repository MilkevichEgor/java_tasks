package org.example.interview;

import java.security.SecureRandom;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import org.example.dataStructures.Person;

public class Main {

  public static void main(String[] args) {

	Point.count = 0;
	Point point = new Point( 0, 0);
	Point point2 = new Point( 0, 0);

	point.getCount();
//	System.out.println(point);

	point2.getCount();
//	System.out.println(point2);

//	Random random = new Random();
//	SecureRandom secureRandom = new SecureRandom();
//
//	System.out.println(secureRandom.nextLong(1000000000 , 9000000000L));

//	Date date = new Date();
//	SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
//	String formattedDate = dateFormat.format(date);
//	System.out.println(formattedDate);

//	int[] array = new int[] { 1, 2, 3, 4, 5 };
//	for (int i : array){
//
//	  i = i * 2;
//	  System.out.println(i);
//	}
//
//	System.out.println(Arrays.toString(array));
//
//	int[] array2 = new int[] { 1, 2, 3, 4, 5 };
//	for (int i=0; i<array2.length;i++){
//	  array2[i] = array2[i] * 2;
//	  System.out.println(array2[i]);
//	}
//	System.out.println(Arrays.toString(array2));

//	int[][][] nums = new int[3][2][3];
//
//	for (int i = 0; i < nums.length; i++) {
//	  for (int j = 0; j < nums[i].length; j++) {
//	    for (int k = 0; k < nums[i][j].length; k++) {
////	      nums[i][j][k] = 2;
//	      System.out.println(nums[i][j][k]);
//	    }
//	  }
//	}
//
//	System.out.println(Arrays.deepToString(nums));

//	System.out.println(Arrays.deepToString(nums));

//	List<Person> personList = new ArrayList<>();
//	Person person = new Person("Derek", "Banas", 35, "Manager", new ArrayList<>());
//	personList.add(person);
//	personList.add(new Person("John", "Whick", 20, "Developer", new ArrayList<>()));
//
//	LinkedList<Integer> list = new LinkedList<>();
//	list.addLast(1);
//	System.out.println(personList.indexOf(person));
//


//	Map<Integer, Integer> map = new HashMap<>();
//	map.put(null, 1);
//	Set<String> set = new HashSet<>();
//	set.add("Derek");
//	set.add("John");
//	set.add("David");

//	LocalDateTime dateNow = LocalDateTime.now();
//	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy 'г.'",
//			new Locale.Builder().setLanguage("ru").build());
//	String formattedDate = dateNow.format(formatter);
//
//	String payToDate = dateNow.plusMonths(1).minusDays(1).format(formatter);
//
//	System.out.println(formattedDate);
//	System.out.println(payToDate);

//	int maxValue = Integer.MAX_VALUE;
//	int minValue = 0;
//
//	int randomValue = minValue + (int) (Math.random() * (maxValue - minValue + 1));
//	System.out.println(randomValue);

//	for (int i = 0; i < 10; i++) {
//	  System.out.println(random.nextInt(10));
//	  System.out.println(secureRandom.nextInt(10));
//	}
//
//	Point p1 = new Point(1.0, 2.0);
//	ColoredPoint p2 = new ColoredPoint(1.0, 2.0, "red");
//
//	System.out.println(p1.equals(p2));
//	System.out.println(p2.equals(p1));

//	  Integer i = 100;
//	  String s = "";
//	  s = i.toString();
//	  System.out.println(s);
//
//	  boolean str = new String("hello").intern() == new String("hello").intern();
//	  System.out.println(str);
//
//	  StringBuilder sb = new StringBuilder();
//	  sb.append("hello");
//	  sb.append(" ");
//	  sb.append("world");
//	  System.out.println(sb);
  }

  static class Point {
	private double x;
	private double y;
	private static int count = 0;

	public Point(double x, double y) {
	  this.x = x;
	  this.y = y;
	  count++;
	}

	public void getCount() {
	  System.out.println(count);
	}

	@Override
	public boolean equals(Object obj) {
	  if (this == obj) {
		return true;
	  }
//	  if (obj == null || getClass() != obj.getClass()) {
//		return false;
//	  }
	  Point other = (Point) obj;
	  return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
	  return "Point: " + x + " " + y;
	}
  }

  static class ColoredPoint extends Point {
	private String color;

	public ColoredPoint(double x, double y, String color) {
	  super(x, y);
	  this.color = color;
	}
  }
}