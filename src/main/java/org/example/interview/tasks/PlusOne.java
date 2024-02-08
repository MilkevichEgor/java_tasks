package org.example.interview.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PlusOne {

  public static void main(String[] args) {
	int[] digits = {1,2,3};
	int[] digits2 = {4,3,2,1};

	PlusOne plusOne = new PlusOne();
	plusOne.plusOne(digits);

  }

  public int[] plusOne(int[] digits) {
	List<Integer> list = new ArrayList<>();
	int num = 1;
	for (int i = digits.length - 1; i >= 0; i--) {
	  list.add((digits[i] + num) % 10);
	  num = (digits[i] + num) / 10;
	}
	if (num == 1) {
	  list.add(1);
	}
	Collections.reverse(list);
	return list.stream().mapToInt(i->i).toArray();
  }
}

