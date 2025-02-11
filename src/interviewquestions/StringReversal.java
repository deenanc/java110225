package interviewquestions;

import java.util.Scanner;

public class StringReversal {
	
	public static String reverseString(String input) {
		
		String rev="";
		
		for(int i=input.length()-1;i>=0;i--) {
			rev=rev+input.charAt(i);
		}
		
		return rev;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter input");
		String input=sc.next();
		
		System.out.println(reverseString(input));
		
		sc.close();

	}

}
