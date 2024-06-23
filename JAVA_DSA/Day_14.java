package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_14 {
	public static void main(String[] args){
		NodeCopy<Integer> head = createList();
		printList(head);
		System.out.println();
		invertOdd(head);
	}
	
	static NodeCopy<Integer> createList(){
		NodeCopy<Integer> head = null;
		NodeCopy<Integer> tail = null;
		int data;
		System.out.println("Enter List Elements: ");
		Scanner sc = new Scanner(System.in);
		data = sc.nextInt();
		while(data != -1) {
			NodeCopy<Integer> newNode = new NodeCopy<>(data);
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
	
	static void printList(NodeCopy<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printList(head.next);
	}
	
	static NodeCopy<Integer> reverseList(NodeCopy<Integer> head){
		NodeCopy<Integer> p = head,q = null,r = null;
		while(p != null) {
			q = p;
			p = p.next;
			q.next = r;
			r = q;
		}
		head = q;
		return head;
	}
	
	static void deleteNode(NodeCopy<Integer> head,int index){
		NodeCopy<Integer> temp = head;
		if(index == 0) {
			head = head.next;
			return;
		}
		int i = 0;
		while(i < index - 1) {
			if(temp.next == null) {
				return;
			}
			temp = temp.next;
			i++;
		}
		temp.next = temp.next.next;
	}
	
	static NodeCopy<Integer> midPoint(NodeCopy<Integer> head){
		NodeCopy<Integer> slow = head;
		NodeCopy<Integer> fast = head;
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		return slow;
	}
	
	static boolean isListPalindrome(NodeCopy<Integer> head,NodeCopy<Integer> tail){
		if(head.data != tail.data) {
			return false;
		}
		if(head.next == tail || head == tail) {
			return true;
		}
		NodeCopy<Integer> tempTail = head;
		while(tempTail.next != tail) {
			tempTail = tempTail.next;
		}
		
		return isListPalindrome(head.next,tempTail);
	}
	
	static void invertOdd(NodeCopy<Integer> head){
		NodeCopy<Integer> temp = head;
		NodeCopy<Integer> oddHead = null,evenHead = null,oddTail= null,evenTail= null;
		while(temp != null) {
			if(temp.data % 2 != 0) {
				if(oddHead == null) {
					oddHead = temp;
					oddTail = temp;
				}else {
					oddTail.next = temp;
					oddTail = temp;
				}
			}else {
				if(evenHead == null) {
					evenHead = temp;
					evenTail = temp;
				}
				else {
					evenTail.next = temp;
					evenTail = temp;
				}
			}
			temp = temp.next;
		}
		oddTail.next = evenHead;
		evenTail.next = null;
		printList(oddHead);
		
	}
	
	
}
