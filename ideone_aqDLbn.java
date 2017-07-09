/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num,a=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number: ");
		num=in.nextInt();
		if(num<0){
			num=num*-1;
		}
		else if(num==0){
			num=1;
		}
		while(num>0){
			num=num/10;
			a++;
		}
		System.out.println("Number of digits in the number are: "+a);
	}
}