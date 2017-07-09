/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int i,num,sum=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter number to find the sum of n nmbers: ");
		num = in.nextInt();
		for(i=1;i<=num;i++){
			sum=sum+i;
		}
		System.out.println("Sum of "+num+" numbers are: "+sum);
	}
}