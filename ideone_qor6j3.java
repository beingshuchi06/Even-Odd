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
		int number=in.nextInt(),count=0;
		for(int i=2;i<=number;i++){
			if(number%i==0){
				count++;
				break;
			}
		}
		
		if(count==0){
			System.out.println("Prime");
		}
		else{
				System.out.println("Not a prime");
			}
	}
}