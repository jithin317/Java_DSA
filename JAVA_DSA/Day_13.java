package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_13 {

	public static void main(String[] args) {
		Node<Integer> head = createList();
		Day_10.printLL(head);
	}
	static Node<Integer> createList(){
		int data;
		Scanner sc = new Scanner(System.in);
		Node<Integer> head = null;
		Node<Integer> tail = null;
		data = sc.nextInt();
		while(data != -1) {
			Node<Integer> newNode = new Node<>(data);
			if(head == null) {
				head = newNode;
				tail = newNode;
			}
			else {
				tail.next = newNode;
				tail = newNode;
			}
			data = sc.nextInt();
		}
		sc.close();		
		return head;
	}
}
