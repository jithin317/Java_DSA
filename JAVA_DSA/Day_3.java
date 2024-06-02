package cat_DSA.JAVA_DSA;

//import java.util.Scanner;

public class Day_3 {
	public static void main(String[] args) {
		String str = deleteDuplicates("aaaxxxxyzzpppt",0);
		System.out.println(str);
	}
	
	public static String replaceStr(String str,char oldChar,char newChar) {
		if(str.length() == 0) {
			return "";
		}
		if(str.charAt(0) == oldChar) {
			return newChar + replaceStr(str.substring(1), oldChar, newChar);
		}
		else {
			return str.charAt(0) + replaceStr(str.substring(1), oldChar, newChar);
		}
	}
	
	public static String deleteDuplicates(String str, int s) {
		if(str.length() == 1) {
			return "" + str.charAt(0);
		}
		if(str.substring(s+1).contains(str.charAt(s)+"r̥")) {
			return deleteDuplicates(str.substring(1), s);
		}
		else {
			return str.charAt(0) + deleteDuplicates(str.substring(1), s);
		}
	}
}
