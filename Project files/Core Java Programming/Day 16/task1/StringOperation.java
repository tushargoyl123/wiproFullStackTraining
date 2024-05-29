package task1;

public class StringOperation {
	
	public static String OutputString(String s1, String s2, int length) {
		String concatenated = concatenateStrings(s1, s2);
		String reversed = reverseString(concatenated);
		int totalLength = reversed.length();
		if(length>totalLength) return reversed;
		int start = (totalLength-length)/2;
		return subString(reversed, start, length);
	}
	
	private static String concatenateStrings(String s1, String s2) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<s1.length(); i++) {
			sb.append(s1.charAt(i));
		}
		for(int i=0; i<s2.length(); i++) {
			sb.append(s2.charAt(i));
		}
		return sb.toString();
	}
	private static String reverseString(String s) {
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for(int i=n-1; i>=0; i--) {
			sb.append(s.charAt(i));
		}
		return sb.toString();
	}
	private static String subString(String s, int start, int length) {
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<length; i++) {
			sb.append(s.charAt(start+i));
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(OutputString("Hello","World",5));

	}

	
}
