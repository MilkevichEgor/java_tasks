package org.example.sorted;

import java.util.Arrays;
import java.util.Collections;

public class Sorted {

  public static void main(String[] args) {

	int[] array = new int[] { 2, 5, 1, 9, 6, 8, 4, 7, 3};
	int n = array.length;
	for (int i = 0; i < n; i++) {
	  for (int j = i + 1; j < n; j++) {
	    if (array[i] > array[j]) {
	      int temp = array[i];
	      array[i] = array[j];
	      array[j] = temp;
	    }
	  }
	}
	System.out.println(Arrays.toString(array));
  }
}
