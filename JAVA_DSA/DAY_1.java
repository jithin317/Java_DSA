package cat_DSA.JAVA_DSA;

// Recursion
public class DAY_1 {
	public static void main(String[] args) {
//		System.out.println(calculatePower(2,4));
	}
	
	public static void print1tonNumbers(int n) {
		if(n == 0) {
			return;
		}
		System.out.println(n);
		print1tonNumbers(n - 1);
	}
	
	public static int sumofNaturalNumbers(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sumofNaturalNumbers(n - 1);
	}
	
	public static int sumOfDigits(int n) {
		if(n % 10 == 0) {
			return 0;
		}
		return n % 10 + sumOfDigits(n / 10);
	}
	
	public static int calculatePower(int num,int pow) {
		if(pow == 0) {
			return 1;
		}
		return num * calculatePower(num,pow - 1);
	}
}
