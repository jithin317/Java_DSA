package cat_DSA.JAVA_DSA;

import java.util.*;

public class Day_5 {
	public static void main(String[] args) {
		int[] arr = fillArray();
		System.out.println(Arrays.toString(arr));
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
}
