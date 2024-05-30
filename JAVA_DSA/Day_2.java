package cat_DSA.JAVA_DSA;

// Searching & Sorting, Recursion problems
import java.util.*;
public class Day_2 {
	public static void main(String[] args) {
		int arr[] = {5,1,4,2,8};
		int[] sortedArr = bubbleSortR(arr,0,0);
		System.out.println(Arrays.toString(sortedArr));
	}
	
	public static int[] bubbleSort(int[] arr,int n){
		int temp;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - 1 - i; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return arr;
	}
	
	public static int linearSearch(int[] arr, int ele)	{
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				return i;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int[] arr,int low, int high,int ele) {
		int mid;
		while(high >= low) {
			mid = high+low/2;
			if(arr[mid] == ele) {
				return mid;
			}
			else if(arr[mid] < ele) {
				low = mid + 1;
			}
			else if(arr[mid] > ele) {
				high = mid - 1;
			}
		}
		return -1;
	}
	
	public static boolean isSorted(int[] arr,int s) {
		if(s == arr.length - 1) {
			return true;
		}
		if(arr[s] > arr[s+1]) {
			return false;
		}
		return isSorted(arr,s+1);
	}
	
	public static int returnIndex(int[] arr,int s,int ele){
		if(s == arr.length) {
			return -1;
		}
		if(arr[s] == ele) {
			return s;
		}
		return returnIndex(arr,s + 1,ele);
	}
	
	public static int[] bubbleSortR(int[] arr, int s, int i) {
		int temp;
		if(i == arr.length - 1) {
			return arr;
		}
		if(s == arr.length - 1 - i) {
			i++;
			s = 0;
		}
		if(arr[s] > arr[s+1]) {
			temp = arr[s];
			arr[s] = arr[s+1];
			arr[s+1] = temp;
		}
		return bubbleSortR(arr,s+1,i);
	}
}
