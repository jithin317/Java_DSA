package cat_DSA.JAVA_DSA;

import java.util.Arrays;

public class Day_4 {
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,6};
		reverseArray(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
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
	
	

}
