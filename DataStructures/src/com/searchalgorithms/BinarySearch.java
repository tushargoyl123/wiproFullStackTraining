package com.searchalgorithms;

public class BinarySearch {
	public static int find(int arr[], int target) {
		int start = 0;
		int end = arr.length - 1;
		boolean asc = false;
		if (arr[start] < arr[end])
			asc = true;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (asc) {
				if (arr[mid] == target)
					return mid;
				else if (arr[mid] < target)
					start = mid + 1;
				else
					end = mid - 1;
			} else {
				if (arr[mid] == target)
					return mid;
				else if (arr[mid] < target)
					start = mid - 1;
				else
					end = mid + 1;
			}
		}
		return -1;
	}
}
