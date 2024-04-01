package org.example.interview.tasks;

import java.util.HashSet;
import java.util.Set;

public class ExamplesSet {

  public static void main(String[] args) {
	int array[] = new int[]{2, 2, 5, 5, 1, 1, 9, 9, 6, 4, 7, 3};

	Set set = new HashSet();

	for (int i = 0; i < array.length; i++) {
	  if (set.contains(array[i])) {
		set.remove(array[i]);
	  } else {
		set.add(array[i]);
	  }
	}
	System.out.println(set);
  }
}
