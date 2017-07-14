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
		int num = in.nextInt(),reverse=0;
		while(num>0){
			reverse=reverse*10+num%10;
			num=num/10;
		}
		System.out.println(reverse);
	}
}