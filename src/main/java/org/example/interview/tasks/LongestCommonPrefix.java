package org.example.interview.tasks;

import java.util.Arrays;
import java.util.Comparator;

class LongestCommonPrefix {

  String[] strs = {"flower", "flow", "flight"};
  String[] strs2 = {"dog","racecar","car"};

  public static void main(String[] args) {

	LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
	System.out.println(longestCommonPrefix(longestCommonPrefix.strs));
  }
  public static String longestCommonPrefix(String[] strs) {
	int index = Arrays.stream(strs).min(Comparator.comparingInt(String::length)).get().length();
	for (String str: strs) {
	  for (int i = 0; i < str.length() && i	< index; i++) {
		if (str.charAt(i) != strs[0].charAt(i)) {
		  index = i;
		}
	  }
	}
	return strs[0].substring(0, index);
  }
}

