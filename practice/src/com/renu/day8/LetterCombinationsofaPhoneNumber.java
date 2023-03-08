package com.renu.day8;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

	public static void main(String[] args) {
		String str ="23";
		 List<String>ll=letterCombinations(str);
		 System.out.println(ll);

	}
	 public  static List<String> letterCombinations(String digits) {
		    if (digits.isEmpty())
		      return new ArrayList<>();

		    List<String> ans = new ArrayList<>();
		    ans.add("");
		    final String[] digitToLetters = {"",    "",    "abc",  "def", "ghi",
		                                     "jkl", "mno", "pqrs", "tuv", "wxyz"};

		    for (final char d : digits.toCharArray()) {
		      List<String> temp = new ArrayList<>();
		      for (final String s : ans)
		        for (final char c : digitToLetters[d - '0'].toCharArray())
		          temp.add(s + c);
		      ans = temp;
		    }

		    return ans;
		  }
}
