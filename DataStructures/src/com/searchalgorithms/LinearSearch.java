package com.searchalgorithms;

public class LinearSearch {
	public static int find(int arr[], int target)
	{	
		for(var i=0; i<arr.length; i++) {
			if(arr[i]== target) return i;
		}
		return -1;
	}
	public static boolean contains(int arr[], int target)
	{	
		for(var i=0; i<arr.length; i++) {
			if(arr[i]== target) return true;
		}
		return false;
	}
}
