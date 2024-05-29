package task3;

public class BoyerMooreAlgorithm {

	private static final int ALPHABET_SIZE = 256;

	private static int[] buildBadCharTable(String pattern) {
		int badCharTable[] = new int[ALPHABET_SIZE];
		int m = pattern.length();
		for (int i = 0; i < ALPHABET_SIZE; i++) {
			badCharTable[i] = -1;
		}
		for (int i = 0; i < m; i++) {
			badCharTable[pattern.charAt(i)] = i;
		}
		return badCharTable;
	}

	public static int findOccurence(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		if (m == 0)
			return n;
		int[] badCharTable = buildBadCharTable(pattern);
		int lastOccurence = -1;
		int shift = 0;
		while (shift <= n - m) {
			int j = m - 1;
			while (j >= 0 && pattern.charAt(j) == text.charAt(shift + j)) {
				j--;
			}
			if (j < 0) {
				lastOccurence = shift;
				shift += (shift + m < n) ? m - badCharTable[text.charAt(shift + m)] : 1;
			}
			else {
				shift+= Math.max(1, j-badCharTable[text.charAt(shift+j)]);
			}
		}
		return lastOccurence;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "ABABDABACDABABCABAB";
		String pat = "ABABCABAB";
		int result = findOccurence(txt, pat);
		if(result!=-1) {
			System.out.println("Pattern found at index "+result);
		}

	}

}
