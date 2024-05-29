package task3;
public class NaivePatternSearch {
	public static void Search(String text, String pattern) {
		int n = text.length();
		int m = pattern.length();
		for(int i=0; i<=n-m; i++) {
			int j;
			for(j=0; j<m; j++) {
				if(text.charAt(i+j)!=pattern.charAt(j)) {
					break;
				}
			}
			if(j==m) System.out.println("Pattern found at index = "+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "ABABAB";
		String pattern = "AB";
		Search(text, pattern);
	}

}
