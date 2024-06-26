package cat_DSA.JAVA_DSA;


public class Day_17 {
	public static void main(String[] args) {
		String str = "){";
		System.out.println(isValidParanthesis(str));
	}
	
	static boolean isValidParanthesis(String str) {
		Stack st = new Stack();
		for(int i = 0; i < str.length();i++) {
			if((char)str.charAt(i) == '(' || (char)str.charAt(i) == '[' || (char)str.charAt(i) == '{' || (char)str.charAt(i) == '<') {
				st.push((char)str.charAt(i));
			}
			else {
				if((char)str.charAt(i) == ')' && (char)st.peek() == '(') 	
					st.pop();
				else if((char)str.charAt(i) == ']' && (char)st.peek() == '[') 
					st.pop();
				else if((char)str.charAt(i) == '}' && (char)st.peek() == '{')
					st.pop();
				else if((char)str.charAt(i) == '>' && (char)st.peek() == '<') 
					st.pop();
				else
					break;
			}
		}
		return st.isEmpty() ? true : false;
	}
}
