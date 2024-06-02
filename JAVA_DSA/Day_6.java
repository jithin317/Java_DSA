package cat_DSA.JAVA_DSA;

public class Day_6 {
	public static void main(String[] args) {
		System.out.println(countZeros(0));
	}
	
	public static String replaceChar(String s) {
		if(s.length() == 0) {
			return s;
		}
		return s.startsWith("pi") ? "3.14" + replaceChar(s.substring(2)) : s.charAt(0)+replaceChar(s.substring(1));
	}
	
	public static int countZeros(int n) {
		if(n < 10) {
			return n == 0 ? 1 : 0;
		}
		return n % 10 == 0 ? 1 + countZeros(n/10) : countZeros(n/10);
	}
	
	public static int countDigits(int n) {
		return n < 10 ? 1 : 1 + countDigits(n/10);	        
	}
}
