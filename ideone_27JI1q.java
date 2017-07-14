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
		int a=in.nextInt(),b=in.nextInt(),c=in.nextInt();
		if(a>b && a>c){
			System.out.println("a is greatest");
		}
		else if(b>c && b>a){
			System.out.println("b is greatest");
		}
		else{
			System.out.println("c is greatest");
		}
	}
}