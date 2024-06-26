package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_16 {
	public static void main(String[] args) {
		Node<Integer> head = createList();
		printList(head);
		System.out.println();
		Node<Integer> newHead = removeDuplicates(head);
		printList(newHead);
	}
	
	static int findSquareRoot(int num) {
		int low = 0, high = num, mid = 0;
		while(low <= high) {
			mid = (low + high) / 2;
			if(mid * mid == num) {
				return mid;
			}
			else if(mid * mid < num) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		return (int)Math.floor(Math.sqrt(num));
	}
	
	static Node<Integer> createList(){
		Node<Integer> head = null;
		Node<Integer> tail = null;
		int data;
		System.out.println("Enter List Elements: ");
		Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		sc.close();
		return head;
	}
	
	static void printList(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printList(head.next);
	}
	
	static Node<Integer> removeDuplicates(Node<Integer> head) {
		if(head == null || head.next == null) {
			return null;
		}		
		Node<Integer> temp = head, curr = head.next;
		while(curr != null) {
			if(temp.data == curr.data) {
				curr = curr.next;
			}else {
				temp.next = curr;
				temp = temp.next;
				curr = curr.next;
			}
		}
		temp.next = null;
		return head;
	}
}
