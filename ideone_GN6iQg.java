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
		
		System.out.println("Enter base value and exponent value: ");
		int base =in.nextInt(), exponent =in.nextInt();
		
		if(exponent>0){
			long result=1;
			for(;exponent !=0;exponent--){
				result=result*base;
			}
			System.out.println("Result: "+result);
		}
		else if(exponent<0){
			double result= Math.pow(base,exponent);
			System.out.println("Result: "+result);
		}
	    else{
	    	int result=1;
	    	System.out.println("Result: "+result);
	    }
	}
}