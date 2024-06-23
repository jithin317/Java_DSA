package cat_DSA.JAVA_DSA;

import java.util.Scanner;

public class Day_11 {
	public static void main(String[] args) {
		Node<Integer> head = createList();
		System.out.print("Elements in the list: ");
		Day_10.printLLR(head);
		System.out.println();
//		System.out.print("Elements in the list after adding: ");
//		Node<Integer> head2 = addNode(head,50,200);
//		Day_10.printLLR(head2);
//		System.out.print("Elements in the list after deleting: ");
//		Node<Integer> head2 = deleteNode(head,5);
//		Day_10.printLLR(head2);		
	}
	
	static Node<Integer> getNode(Node<Integer> head,int index){
		return index == 0 ? head : getNode(head.next,index-1);
	}
	
	static Node<Integer> createList(){
		System.out.println("Enter the elements in the list:");
		Scanner sc = new Scanner(System.in);
		int data;
		Node<Integer> head = null;
		Node<Integer> tail = null;
		data = sc.nextInt();
		while(data != -1) {			
			Node<Integer> newNode = new Node<Integer>(data);
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
		
	static Node<Integer> addNode(Node<Integer> head, int data, int index){
		Node<Integer> newNode = new Node<>(data);
		Node<Integer> temp = head;
		if(index == 0) {
			newNode.next = head;
			head = newNode;
			return head;
		}
		int i = 0;
		while(i < index - 1) {
			temp = temp.next;
			i++;
			if(temp.next == null) {
				temp.next = newNode;
				return head;
			}
		}
		newNode.next = temp.next;
		temp.next = newNode;
		return head;
	}
	
	static Node<Integer> deleteNode(Node<Integer> head,int index){
		if(index == 0) {
			head = head.next;
			return head;
		}
		int i = 0;
		Node<Integer> temp = head;
		while(i < index - 1) {
			temp = temp.next;
			i++;
			if(temp.next == null) {
				return head;
			}
		}
		temp.next = temp.next.next;
		return head;
	}
	
}
