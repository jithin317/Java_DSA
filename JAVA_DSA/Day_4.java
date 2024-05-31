package cat_DSA.JAVA_DSA;

import java.util.Arrays;

public class Day_4 {
	public static void main(String[] args) {
		int arr[] = {2,4,4,2,6,7,7};
		int uniqueEl = findUniqueElement(arr);
		System.out.println(uniqueEl);
	}
	
	public static void insertionSort(int[] arr,int n) {
		int i = 0, key;
		for(int j = 1; j < n; j++) {
			key = arr[j];
			while(i >= 0 && key < arr[i]) {
				arr[i+1] = arr[i];
				i--;
			}
			arr[i+1] = key;
			i = j;
		}
	}
	
	public static void reverseArray(int[] arr,int firstIndex,int lastIndex) {
		if(firstIndex < lastIndex) {
			int temp = arr[firstIndex];
			arr[firstIndex] = arr[lastIndex];
			arr[lastIndex] = temp;
		}
	}
	
	public static int findUniqueElement(int[] arr) {
		int s = 0;
		for(int i : arr) {
			s ^= i;
		}
		return s;
	}

}
