package org.example.interview.tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PascalsTriangle {

  public static void main(String[] args) {

	PascalsTriangle pascalsTriangle = new PascalsTriangle();
	System.out.println(pascalsTriangle.generate(5));
  }

  public List<List<Integer>> generate(int numRows) {

	List<List<Integer>> list = new ArrayList<>();

	for (int i = 0; i < numRows; i++) {
		list.add(new ArrayList<>());
		list.get(i).add(i);
	}

	return list;
  }
}
