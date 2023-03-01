package com.renu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*Find all words that are concatenations of a list.

Input:
["tech", "lead", "techlead", "cat", "cats", "dog", "catsdog"]

Output:
['techlead', 'catsdog']*/
public class FindConcatenatedWords {

	public static void main(String[] args) {
		String[] words = { "tech", "lead", "techlead", "cat", "cats", "dog", "catsdog" };
		List<String> list = findAllConcatenatedWordsInADict(words);
		System.out.println(list);
	}

	public static List<String> findAllConcatenatedWordsInADict(String[] words) {
		List<String> ans = new ArrayList<>();
		Set<String> wordSet = new HashSet<>(Arrays.asList(words));
		Map<String, Boolean> memo = new HashMap<>();

		for (String word : words)
			if (wordBreak(word, wordSet, memo))
				ans.add(word);

		return ans;
	}

	private static boolean wordBreak(String word, Set<String> wordSet, Map<String, Boolean> memo) {
		if (memo.containsKey(word))
			return memo.get(word);

		for (int i = 1; i < word.length(); ++i) {
			String prefix = word.substring(0, i);
			String suffix = word.substring(i);
			if (wordSet.contains(prefix) && (wordSet.contains(suffix) || wordBreak(suffix, wordSet, memo))) {
				memo.put(word, true);
				return true;
			}
		}

		memo.put(word, false);
		return false;
	}

}
