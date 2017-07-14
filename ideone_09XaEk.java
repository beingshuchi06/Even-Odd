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
		int sum=0;
		for(int i=1;i<=15;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	    sum=0;
	    for(int i=15;i<=45;i++){
	    	
	    	if(i%2!=0){
	    		sum=sum+i;
	    	}
	    }
	    System.out.println(sum);
	}
	  
}