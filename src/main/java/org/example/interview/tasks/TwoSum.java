package org.example.interview.tasks;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

  int[] array = new int[]{2, 5, 1, 9, 6, 4, 7, 3};
  int target = 10;

  public static void main(String[] args) {

	TwoSum main = new TwoSum();
	System.out.println(main.twoSum2(main.array, main.target));


  }

  public int[] twoSum2(int[] nums, int target) {
	for (int i = 0; i < nums.length; i++) {
	  for (int j = i + 1; j < nums.length; j++) {
		if (nums[j] == target - nums[i]) {
		  return new int[] { i, j };
		}
	  }
	}
	// In case there is no solution, we'll just return null
	return null;
  }

  public int[] twoSum(int[] nums, int target) {
	Map<Integer, Integer> map = new HashMap<>();

	for (int i = 0; i < nums.length; i++) {
	  map.put(nums[i], i);
	}

	for (int i = 0; i < nums.length; i++) {
	  int result = target - nums[i];
	  if (map.containsKey(result) && map.get(result) != i) {
		return new int[]{i, map.get(result)};
	  }
	}
	return null;
  }



}