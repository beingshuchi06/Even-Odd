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
		int A=in.nextInt(),B=in.nextInt(),R;
		int lcm=A*B;
		while(A%B!=0){
			R=A%B;
			A=B;
			B=R;
		}
		int GCD=B;
		lcm=lcm/GCD;
		System.out.println("LCM: "+lcm);
	}
}