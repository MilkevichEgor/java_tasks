package org.example.interview.tasks;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

  int[] array = new int[]{1,1,2};
  int[] nums = new int[]{0,0,1,1,1,1,2,3,4,4};


  public static void main(String[] args) {

    RemoveDuplicates main = new RemoveDuplicates();
//    main.removeDuplicates(main.nums);
    main.removeDuplicates2(main.nums);
  }

  public int removeDuplicates(int[] nums) {

    nums = Arrays.stream(nums).distinct().toArray();
    System.out.println(Arrays.toString(nums));
	return nums.length;
  }

  public int removeDuplicates2(int[] nums) {
      int length = nums.length;
      int k = 1;

      for (int i = 1; i < length; i++) {
          if (nums[i] != nums[i - 1]) {
              nums[k] = nums[i];
              k++;
          }
      }
	  return k;
  }

}
