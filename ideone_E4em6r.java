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
		int num=in.nextInt(),t0=0,t1=1,sum;
		while(t0<num){
			System.out.print(t0 + " , ");
			sum=t0+t1;
			t0=t1;
			t1=sum;
		}
	}
}