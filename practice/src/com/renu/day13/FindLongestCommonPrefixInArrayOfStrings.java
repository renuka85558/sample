package com.renu.day13;

public class FindLongestCommonPrefixInArrayOfStrings {

	public static void main(String[] args) {
		String[] str = { "javaTpoint", "javalearn", "javabeginner", "javaaa","ja" };

		String commonLongestPrefix = findCommonPrefix(str);
		System.out.println("common prefix string :" + commonLongestPrefix);
	}

	public static String findCommonPrefix(String[] strArr) {
		if (strArr.length == 0) {
			return "";
		}
		String minLength = findMinLength(strArr);
		int prefixMinLength = minLength.length();
		for (int i = 0; i < strArr.length; i++) {
			int j;
			for (j = 0; j < prefixMinLength; j++) {
				if (minLength.charAt(j) != strArr[i].charAt(j)) {
					break;
				}

			}
			if (j < prefixMinLength) {
				prefixMinLength = j;
			}
		}
		return minLength.substring(0, prefixMinLength);

	}

	public static String findMinLength(String[] str) {
		String minStrLength = str[0];
		for (int i = 1; i < str.length; i++) {
			if (str[i].length() < minStrLength.length()) {
				minStrLength = str[i];

			}

		}
		return minStrLength;
	}

}
