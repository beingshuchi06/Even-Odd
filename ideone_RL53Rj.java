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
		String str=in.nextLine();
		StringBuilder str1 = new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		for(int i=0;i<str1.length();i++){
			System.out.print(str1.charAt(i));
		}
	}
}