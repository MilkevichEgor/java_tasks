package org.example.interview.tasks;

public class FindIndexOfTheFirstOccurrenceInString {

  String str1 = "sadbutsad";
  String str2 = "sad";

  String str3 = "leetcode";
  String str4 = "leeto";

	public static void main(String[] args) {
		FindIndexOfTheFirstOccurrenceInString findIndex = new FindIndexOfTheFirstOccurrenceInString();
		System.out.println(findIndex.strStr(findIndex.str3, findIndex.str4));
	}

  public int strStr(String haystack, String needle) {
	int index = haystack.indexOf(needle);
	return index;
  }
}
