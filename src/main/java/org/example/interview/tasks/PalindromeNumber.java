package org.example.interview.tasks;

import java.util.Arrays;

public class PalindromeNumber {
  int number = 121;
  int number2 = -121;
  int number3 = 10;
  int number4 = -2147447412;

  public static void main(String[] args) {

	PalindromeNumber main = new PalindromeNumber();

//	main.isPalindrome2(main.number);
//	main.isPalindrome2(main.number2);
//	main.isPalindrome2(main.number3);
//	main.isPalindrome(main.number4);
	main.isPalindrome3(main.number);
	main.isPalindrome3(main.number2);
	main.isPalindrome3(main.number3);
	main.isPalindrome3(main.number4);

  }

  public boolean isPalindrome(int x) {
	String s = String.valueOf(x);
	char[] arr1 = s.toCharArray();
	char[] arr2 = new char[arr1.length];

	for (int i = arr1.length - 1; i >= 0; i--) {
	  arr2[i] = arr1[arr1.length - 1 - i];
	}
	if (Arrays.equals(arr1, arr2)) {
	  return true;
	}
	return false;
  }


  public boolean isPalindrome2(int x) {
	return String.valueOf(x).equals(new StringBuilder(String.valueOf(x)).reverse().toString());
  }

  public boolean isPalindrome3(int x) {
	if (x < 0) {
	  return false;
	}

	int revertedNumber = 0;
	int xCopy = x;
	while (xCopy != 0) {
	  revertedNumber = revertedNumber * 10 + xCopy % 10;
	  xCopy = xCopy / 10;
	}
	return revertedNumber == x;
  }
}
