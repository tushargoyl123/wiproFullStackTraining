package com.bitwiseAlgorithms;

public class countSetBits {
	public static int countSetBitsFun(int n) {
		int count = 0;
		while (n > 0) {
			count += n & 1;
			n >>= 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		System.out.println("set bits in "+n+" is " + countSetBitsFun(n) ); 
	}

}
