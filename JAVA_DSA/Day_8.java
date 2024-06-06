package cat_DSA.JAVA_DSA;

import java.util.Arrays;

public class Day_8 {
	public static void main(String[] args) {
		int[] arr = {2,6,8,2,3,9,1,4,9};
		mergeSort(arr);
		System.out.println(Arrays.toString(arr));
	}	
	
	
	static void	mergeSort(int[] arr) {
		if(arr.length <= 1) {
			return;
		}
		int mid = arr.length / 2;
		int a[] = new int[mid];
		int b[] = new int[arr.length - mid];
		for(int x = 0; x < mid; x++) {
			a[x] = arr[x];
		}
		for(int x = mid; x < arr.length; x++) {
			b[x - mid] = arr[x];
		}
		mergeSort(a);
		mergeSort(b);
		merge(a,b,arr);
	}
	
	static void merge(int a[],int b[], int arr[]) {
		int i = 0, j = 0, k = 0;
		while(i < a.length && j < b.length) {
			if(a[i] <= b[j]) {
				arr[k++] = a[i++];
			}else {
				arr[k++] = b[j++];
			}
		}
		while(i < a.length) {
			arr[k++] = a[i++];
		}
		while(j < b.length) {
			arr[k++] = b[j++];
		}
	}

}
