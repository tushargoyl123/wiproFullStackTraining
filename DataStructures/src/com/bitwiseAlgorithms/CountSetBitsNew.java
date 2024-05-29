package com.bitwiseAlgorithms;

public class CountSetBitsNew {
	public static int countTotalSetBits(int n) {
		int totalSetBits = 0;
		int i = 0;
		while ((1 << i) <= n) {
			int blockSize = 1 << (i + 1);
			int fullBlocks = n / blockSize;
			totalSetBits += fullBlocks*(1<<i);
			int remainingBits = n%blockSize;
			totalSetBits +=Math.max(0, remainingBits-(1<<i)+1);
			i++;
		}
		return totalSetBits;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 29;
		System.out.println(countTotalSetBits(n));

	}

}
