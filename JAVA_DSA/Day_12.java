package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_12 {
	public static void main(String[] args) {
		Node<Integer> head = createList();
//		Day_10.printLL(head);
//		Node<Integer> head2 = createList();
//		boolean isPresent = findNode(head,100);
//		Node<Integer> head1 = reverseList(head);
//		Day_10.printLL(head1);
//		Node<Integer> res = findMidPoint(head);
//		System.out.println(res.data);
		Node<Integer> res = deleteNodeMethod(head, 3);
		Day_10.printLL(res);
	}
	
	static Node<Integer> createList(){
		Scanner sc = new Scanner(System.in);
		int data;
		data = sc.nextInt();
		Node<Integer> head = null;
		Node<Integer> tail = null;
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
	
	static boolean findNode(Node<Integer> head,int element){
		if(head == null) {
			return false;
		}
		else if(head.data == element) {
			return true;
		}
		return findNode(head.next,element);
	}
	
	static Node<Integer> reverseList(Node<Integer> head){
		Node<Integer> p = head, q = null, r= null;
		while(p != null) {
			q = p;
			p = p.next;
			q.next = r;
			r = q;
		}
		return q;
	}
	
	static Node<Integer> findMidPoint(Node<Integer> head){
		if(head == null || head.next == null) {
			return head;
		}
		Node<Integer> slow = head;
		Node<Integer> fast = head.next;
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	static Node<Integer> deleteNode(Node<Integer> head, int index){
		if(index == 0) {
			head = head.next;
			return head;
		}
		
		if(head.next == null) {
			return head;
		}
		
		if(index == 1) {
			head.next = head.next.next;
			return head;
		}
		deleteNode(head.next,index-1);
		return head;
	}
	
	static Node<Integer> deleteNodeMethod(Node<Integer> head,int index){
		if(head == null)
			return head;
		if(index == 0) 
			return head.next;
		head.next = deleteNodeMethod(head.next, index - 1);
		return head;
	}
	
	
}
