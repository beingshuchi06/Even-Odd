/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//number=33492
		//sum=3+3+4+9+2=21
		int num,sum,remainder;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num =in.nextInt();
		
		for(sum=0;num>0;num=num/10){
			remainder=num%10;
			sum=sum+remainder;
		}
		System.out.println("Sum of digits: "+sum);
	}
}