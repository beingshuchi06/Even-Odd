/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		String str ="Hello I am ";
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		str= new StringBuilder().append(str).append(name).toString();
		System.out.println(str);
	}
}