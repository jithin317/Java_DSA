package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_15 {

	public static void main(String[] args) {
		Node<Integer> head1 = new Node<>(-9);
		head1.next = new Node<>(3);
//		head1.next.next = new Node<>(8);
		Node<Integer> head2 = new Node<>(5);
		head2.next = new Node<>(7);
//		head2.next.next = new Node<>(6);
//		head2.next.next.next = new Node<>(9);
		Node<Integer> newHead = mergeSortedLL(head1,head2);
		Day_10.printLL(newHead);
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

	static Node<Integer> mergeSortedLL(Node<Integer> head1,Node<Integer> head2){
		Node<Integer> newHead = null, t1 = head1, t2 = head2, temp = null;
		while(t1 != null && t2 != null) {
			if(newHead == null) {
				if(t1.data <= t2.data) {
					newHead = t1;
					t1 = t1.next;
				}else {
					newHead = t2;
					t2 = t2.next;
				}
				temp = newHead;
			}else {
				if(t1.data <= t2.data) {
					temp.next = t1;
					temp = t1;
					t1 = t1.next;
				}else {
					temp.next = t2;
					temp = t2;
					t2 = t2.next;
				}
			}
		}
		while(t1 != null) {
			temp.next = t1;
			temp = t1;
			t1 = t1.next;
		}
		while(t2 != null) {
			temp.next = t2;
			temp = t2;
			t2 = t2.next;
		}
		return newHead;
	}
}
