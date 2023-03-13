package com.renu.day13;

import java.util.HashMap;
import java.util.Map;

public class ConvertRomanNumToInteger {

	public static void main(String[] args) {
		String s = "MCMXC";

		System.out.println("Roman number :" + s);
		int integerNum = convertRomantoInteger(s);
		System.out.println("integer number :" + integerNum);
		String str="CMXCIX";
		int num = convertRomantoInteger(str);
		System.out.println("Roman to Integer number :"+num);

	}

	public static int convertRomantoInteger(String roman) {

		Map<Character, Integer> romantointmap = new HashMap<Character, Integer>();
		romantointmap.put('I', 1);
		romantointmap.put('V', 5);
		romantointmap.put('X', 10);
		romantointmap.put('L', 50);
		romantointmap.put('C', 100);
		romantointmap.put('D', 500);
		romantointmap.put('M', 1000);
		int result = 0;
		for (int i = 0; i < roman.length(); i++) {
			char ch = roman.charAt(i);
			if (i > 0 && romantointmap.get(ch) > romantointmap.get(roman.charAt(i - 1))) {

				result += romantointmap.get(ch) - 2 * romantointmap.get(roman.charAt(i - 1));
			} else {
				result += romantointmap.get(ch);
			}

		}

		return result;
	}

}
