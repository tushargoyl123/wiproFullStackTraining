package com.bitwiseAlgorithms;

public class OptimizedAnd {
	
	public static void OptimizedAndFun(int arr[], int n) {
		int result = arr[0];
		for(int num: arr) {
			if(result == 0) break;
			result&=num;
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12, 15, 7};
		OptimizedAndFun(arr, 3);

	}

}
