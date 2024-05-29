package com.bitwiseAlgorithms;

public class remove2Unique {
	
	public static void remove2UniqueFun(int arr[], int n) {
		int xor = 0;
		for(int num: arr) {
			xor^=num;
		}
		
		int setBit = xor&-xor;
		int x = 0;
		int y = 0;
		for(int num: arr) {
			
			if((num & setBit)==0) x^=num;
			else y^=num;
		}
		System.out.println(x+" "+y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {4,2,4,5,2,3,3,1};
		int n = 8;
		remove2UniqueFun(arr, n);

	}

}
