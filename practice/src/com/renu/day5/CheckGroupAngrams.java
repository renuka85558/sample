package com.renu.day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CheckGroupAngrams {

	public static void main(String[] args) {
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		 List<List<String>> groupAnagrams = groupAnagrams(strs);
		 System.out.println(groupAnagrams);
	}
	public static List<List<String>> groupAnagrams(String[] strs) {
	    Map<String, List<String>> keyToAnagrams = new HashMap<>();

	    for (final String str : strs) {
	      char[] chars = str.toCharArray();
	      Arrays.sort(chars);
	      String key = String.valueOf(chars);
	      keyToAnagrams.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
	    }

	    return new ArrayList<>(keyToAnagrams.values());
	  }
}
