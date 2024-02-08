package org.example.interview.tasks;

import java.util.*;

public class ValidParentheses {

  String str1 = "()";
  String str2 = "()[]{}";
  String str3 = "(]";

  public static void main(String[] args) {
	ValidParentheses validParentheses = new ValidParentheses();
	validParentheses.isValid(validParentheses.str2);
  }

  public boolean isValid(String s) {
	Stack<Character> stack = new Stack<>();
	for (int i = 0; i < s.length(); i++) {
	  char bracket = s.charAt(i);
	  if (bracket == '{' || bracket == '[' || bracket == '(') {
		stack.push(bracket);
	  } else {
		if (stack.isEmpty()) {
		  return false;
		}
		char top = stack.pop();
		if (bracket == '}' && top != '{'
				|| bracket == ']' && top != '['
				|| bracket == ')' && top != '(')  {
		  return false;
		}
	  }
	}
	return stack.isEmpty();

  }
}
