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
		System.out.println("Enter the number to print table: ");
		int num=in.nextInt();
		System.out.println("Enter the number to print the table upto: ");
		int maxVal=in.nextInt();
		
		for(int i=1;i<=maxVal;i++){
			System.out.println(num*i);
		}
	}
}