package org.example.interview.tasks;

public class RemoveElements {

  int[] array1 = new int[]{3, 2, 2, 3};
  int[] array2 = new int[]{0, 1, 2, 2, 3, 0, 4, 2};
  int[] array3 = new int[]{8, 1, 3, 4, 4, 2, 0, 7};
  int val1 = 3;
  int val2 = 2;
  int val3 = 4;

  public static void main(String[] args) {

	RemoveElements main = new RemoveElements();
	System.out.println(main.removeElement(main.array3, main.val3));
  }

  public int removeElement(int[] nums, int val) {

	int j = 0;
	for (int i = 0; i < nums.length; i++) {
	  if (nums[i] != val) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
		j++;
	  }
	}

	return j;
  }
}