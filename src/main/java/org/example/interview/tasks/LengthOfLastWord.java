package org.example.interview.tasks;

import java.util.ArrayList;
import java.util.List;

public class LengthOfLastWord {

  public static void main(String[] args) {
	String str1 = "Hello World";
	String str2 = " ";

		LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
		System.out.println(lengthOfLastWord.lengthOfLastWord(str2));
  }

  public int lengthOfLastWord(String s) {

	String[] words = s.split(" ");
	if (words.length == 0) {
	  return 0;
	}
	return words[words.length - 1].length();
  }
}
