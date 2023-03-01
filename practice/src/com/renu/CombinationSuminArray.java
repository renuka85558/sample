package com.renu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSuminArray {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 5, 6 };
		int sum = 6;
		List<List<Integer>> ll = combinationSum(arr, sum);
		System.out.println(ll);

	}

	public static List<List<Integer>> combinationSum(int[] arr, int target) {
		List<List<Integer>> ans = new ArrayList<>();
		Arrays.sort(arr);
		dfs(0, arr, target, new ArrayList<>(), ans);
		return ans;
	}

	private static void dfs(int s, int[] arr, int target, List<Integer> path, List<List<Integer>> ans) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			ans.add(new ArrayList<>(path));
			return;
		}

		for (int i = s; i < arr.length; ++i) {
			if (i > s && arr[i] == arr[i - 1]) {
				continue;
			}
			path.add(arr[i]);
			dfs(i + 1, arr, target - arr[i], path, ans);
			path.remove(path.size() - 1);
		}
	}
}
