package stockmangement;

import java.util.Scanner;
import java.util.Stack;

public class CheckRedendant {
	static boolean checkRedundancy(String string) {
		Stack<Character> stack=new Stack<>();
		char []str= string.toCharArray();
		for(int i=0;i<str.length;i++) {
			char ch=str[i];
			
			if(ch!=')')
				stack.push(ch);
			else {
				char top=stack.peek();//peek will display the topmost element in the array or it copies to top element 
				stack.pop();
				
				boolean flg=true;
				while(top!='(') {
					if(top == '+' || top == '-' || top == '/' || top == '*') {
						flg=false;
					}
					top=stack.peek();
					stack.pop();
				}
				if(flg == true)
					return true;
			}
		}
		return false;
	}
	// Function to check redundant brackets
	static void findRedundant(String str) {
		boolean ans = checkRedundancy(str);
		if(ans==true)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
	public static void main(String args[]) {
		String str;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the element ");
		str=sc.next();
		findRedundant(str);
	}
}