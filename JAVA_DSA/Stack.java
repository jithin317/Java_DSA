package cat_DSA.JAVA_DSA;

public class Stack {
	char data[];
	int topIndex;
	
	public Stack() {
		data = new char[10];
		topIndex = -1;
	}
	
	public void push(char val) {
		if(topIndex == data.length - 1) {
			System.out.println("Stack Overflow");
			return;
		}
		topIndex += 1;
		data[topIndex] = val;
	}
	
	public char pop() {
		if(topIndex == -1) {
//			System.out.println("Stack Underflow");
			return '-';
		}
		char res = data[topIndex];
		topIndex -= 1;
		return res;
	}
	
	public int peek() {
		if(topIndex == -1) {
			return -1;
		}
		return data[topIndex];
	}
	
	public int size() {
		return topIndex + 1;
	}
	
	public boolean isEmpty() {
		return topIndex == -1;
	}
	
	public boolean isFull() {
		return topIndex == data.length - 1;
	}
}
