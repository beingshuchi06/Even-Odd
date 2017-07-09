/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new  Scanner(System.in);
		System.out.println("Enter a year: ");
		int year=in.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}
}