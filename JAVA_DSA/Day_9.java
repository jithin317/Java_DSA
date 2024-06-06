package cat_DSA.JAVA_DSA;

import java.util.ArrayList;

public class Day_9 {
	public static void main(String[] args) {
//		patternProgram(5);
		int[] arr = {1,2,2,3,3,4,5,6,7,7,8,8,8};
		removeDuplicates(arr);
	}
	
	public static void patternProgram(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = 0; i <= n; i++) {
			for(int j = i; j <= n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	static void removeDuplicates(int[] arr) {
		ArrayList<Integer> arr2 = new ArrayList<>();
		arr2.add(arr[0]);
		int i = 0, j = 1;
		while(j < arr.length) {
			if(arr2.get(i) != arr[j]) {
				arr2.add(arr[j]);
				i++;
				j++;
			}
			else {
				j++;
			}
		}
		System.out.println(arr2);
	}

}
