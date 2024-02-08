package org.example.interview.tasks;

import java.util.Arrays;

public class SearchInsertPosition {

  public static void main(String[] args) {
	int[] nums = {1,3,5,6};

	int target1 = 5;
	int target2 = 2;
	int target3 = 7;

	SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
	System.out.println(searchInsertPosition.searchInsert(nums, target3));
  }
  public int searchInsert(int[] nums, int target) {
	int result = Arrays.binarySearch(nums, target);
	return result < 0 ? Math.abs(result) - 1 : result;
  }
}
