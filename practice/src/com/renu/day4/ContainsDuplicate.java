package com.renu.day4;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		int[] arr= {2,4,5,6,9,9};
		boolean b=containsDuplicate(arr);
		System.out.println(b);
	}
	public static boolean containsDuplicate(int[] nums) {
	    Set<Integer> seen = new HashSet<>();

	    for (final int num : nums)
	      if (!seen.add(num))
	        return true;

	    return false;
	  }
}
