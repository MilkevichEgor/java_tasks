package org.example.interview.tasks;

import java.math.BigInteger;

public class AddBinary {

  public static void main(String[] args) {
	String a = "1010";
	String b = "1011";

	AddBinary addBinary = new AddBinary();
	System.out.println(addBinary.addBinary(a,b));
  }
  public String addBinary(String a, String b) {

	StringBuilder str = new StringBuilder();
	StringBuilder strBuild1 = new StringBuilder(a).reverse();
	StringBuilder strBuild2 = new StringBuilder(b).reverse();
	if (a.length() < b.length()) {
	  strBuild1 = new StringBuilder(b).reverse();
	  strBuild2 = new StringBuilder(a).reverse();
	}

	int num = 0;

	for (int i = 0; i < strBuild1.length(); i++) {
	  int x = strBuild1.charAt(i) - '0';
	  int y = i >= strBuild2.length() ? 0 : strBuild2.charAt(i) - '0';


	  str.append((x + y + num) % 2);
	  num = (x + y + num) / 2;
	}
	if (num == 1) {
	  str.append(1);
	}

	return str.reverse().toString();
  }
}
