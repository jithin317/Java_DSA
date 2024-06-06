package cat_DSA.JAVA_DSA;

public class Day_10 {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<>(10);
		Node<Integer> n2 = new Node<>(20);
		Node<Integer> n3 = new Node<>(30);
		Node<Integer> n4 = new Node<>(40);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
//		addFive(n1);
//		printLL(n1);
		getNode(n1,3);
	}
	
	public static void printLL(Node<Integer> head) {
		while(head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
	}
	
	public static void printLLR(Node<Integer> head) {
		if(head == null) {
			return;
		}
		System.out.print(head.data + " ");
		printLLR(head.next);				
	}
	
	static void addFive(Node<Integer> head) {
		if(head == null) {
			return;
		}
		head.data += 5;
		addFive(head.next);
	}
	
	static int getLength(Node<Integer> head){
		if(head == null) {
			return 0;
		}
		return 1 + getLength(head.next);
	}
	
	static void getNode(Node<Integer> head,int index){
		int length = getLength(head);
		int i = 0;
		if(index >= length) {
			System.out.println("No such Index");
			return;
		}
		while(i < index) {
			head = head.next;
			i++;
		}
		System.out.println(head.data);
	}
}
