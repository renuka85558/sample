package com.renu.day9;

import java.util.ArrayDeque;
import java.util.Deque;

public class ValidParentheses {

	public static void main(String[] args) {
		String str ="";
		boolean b =isValid(str);
		System.out.println(b);
	}
	public static boolean isValid(String s) {
	    Deque<Character> stack = new ArrayDeque<>();

	    for (final char c : s.toCharArray())
	      if (c == '(')
	        stack.push(')');
	      else if (c == '{')
	        stack.push('}');
	      else if (c == '[')
	        stack.push(']');
	      else if (stack.isEmpty() || stack.pop() != c)
	        return false;

	    return stack.isEmpty();//collection has no elements will return true
	  }
}
