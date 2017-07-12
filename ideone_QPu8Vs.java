/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
		int num=in.nextInt();
		
		isPalindrome(num);
	}
	
	public static int Reverse(int number){
		int r,sum=0;
		
		while(number !=0){
			r=number%10;
			sum=(sum*10)+r;
			number=number/10;
		}
	
		return sum;
	}
	
	public static void isPalindrome(int number){
		if(number== Reverse(number)){
			System.out.println("Palindrome");
		}
		else{
			System.out.println("Not a palindrome");
		}
	}
}