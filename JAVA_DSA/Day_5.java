package cat_DSA.JAVA_DSA;

import java.util.*;

public class Day_5 {
	public static void main(String[] args) {
		int[] arr = {3,1,2,2,2};
		int index = findEquilibriumIndex(arr);
		System.out.println(index == -1 ? "There is no Equilibrium index" : "The Equilibrium position is at index : "+index);
	}
	
	public static int[] getIntersection(int[] a,int[] b) {
		HashSet<Integer> arr = new HashSet<Integer>();
		if(a.length > b.length) {
			int[] temp = a;
			a = b;
			b = temp;
		}
		for(int i = 0; i < a.length; i++) {
			int high = b.length - 1, low = 0, mid = 0;
			while(high >= low) {
				mid = high + low / 2;
				if(a[i] == b[mid]) {
					arr.add(a[i]);
					break;
				}
				else if(a[i] > b[mid]) {
					low = mid + 1;
				}
				else if(a[i] < b[mid]) {
					high = mid - 1;
				}
			}
		}
		ArrayList<Integer> al = new ArrayList<>(arr);
		int[] nums = new int[al.size()];
		for(int i = 0; i < nums.length; i++) {
			nums[i] = al.get(i);
		}
		return nums;
	}
	
	public static int[] fillArray() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size: ");
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i = 0, j = arr.length - 1, x = 0;
		System.out.print("Enter array elements: ");
		while(x < n) {
			if(x % 2 == 0) {
				arr[i++] = sc.nextInt();
				x++;
			}
			else {
				arr[j--] = sc.nextInt();
				x++;
			}
		}
		return arr;
	}
	
	public static int findEquilibriumIndex(int[] arr) {
		int total = 0, sum = 0, lSum, rSum;
		for(int i : arr) {
			total += i;
		}
		for(int i = 0; i < arr.length; i++) {
			rSum = total - (sum + arr[i]);
			lSum = sum;
			if(rSum == lSum) {
				return i;
			}
			sum += arr[i];
		}
		return -1;
	}
}
