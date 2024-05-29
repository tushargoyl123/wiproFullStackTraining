package com.searchalgorithms;

public class SearchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		int target = 2;
		System.out.println(LinearSearch.find(arr,target));
		System.out.println(BinarySearch.find(arr, target));

	}

}
