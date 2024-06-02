package cat_DSA.JAVA_DSA;

import java.util.Arrays;

public class Day_7 {
	public static void main(String[] args) {
		int[] arr = {10,20,10,5,15};
		System.out.println(Arrays.toString(prefixSum(arr)));
	}
	
	static double findGeometricSum(int n) {
		return n == 0 ? 1 : 1/(Math.pow(2, n)) + findGeometricSum(n-1);
	}
	
	static int[] prefixSum(int[] arr) {
		int[] prefixArr = new int[arr.length];
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			prefixArr[i] = sum;
		}
		return prefixArr;
	}
}
