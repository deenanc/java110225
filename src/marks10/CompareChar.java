package marks10;

import java.util.Scanner;

public class CompareChar {
	
	public static void compareChar(String input) {
		
		char first=input.charAt(0);
		char last=input.charAt(input.length()-1);
		
		if(first==last) {
			System.out.println("Valid");
		}
		else {
			System.out.println("Invalid");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Input");
		String input=sc.nextLine();
		
		compareChar(input);
		
		sc.close();
	}

}
