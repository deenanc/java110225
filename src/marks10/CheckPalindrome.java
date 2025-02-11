package marks10;

import java.util.Scanner;

public class CheckPalindrome {
	
	public static void checkPalindrome(int number) {
		int last, reverse=0, number_copy=number;
		
		while(number!=0) {
			last=number%10;
			reverse=reverse*10+last;
			number=number/10;
		}
		
		if(reverse==number_copy) {
			System.out.println("Number is a palindrome");
		}
		else {
			System.out.println("Number is not palindrome");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		
		checkPalindrome(number);
		
		sc.close();
	}

}
