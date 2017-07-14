/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner in = new Scanner(System.in);
	     int num1=in.nextInt(), num2=in.nextInt();
	     int gcd = findGCD(num1,num2);
	     System.out.println("GCD: "+gcd);
	}
 
	public static int findGCD(int num1, int num2){
		if(num2==0){
			return num1;
		}
		return findGCD(num2, num1%num2);
	}
}
 
 

	}
}