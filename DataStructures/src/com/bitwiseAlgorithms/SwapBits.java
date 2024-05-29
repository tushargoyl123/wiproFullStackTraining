package com.bitwiseAlgorithms;

public class SwapBits {
	public static int swapBitsFun(int n, int i, int j) {
		int biti = (n>>i) & 1;
		int bitj = (n>>j) & 1;
		if(biti==bitj) return n;
		int mask = (1<<i) | (1<<j);
		return n ^ mask;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		int i = 1;
		int j = 3;
		int result = swapBitsFun(n, i, j);
		System.out.println("Number after swapping bits position "+i+" and "+j+" : result ("+Integer.toBinaryString(result)+")" );
	}

}
