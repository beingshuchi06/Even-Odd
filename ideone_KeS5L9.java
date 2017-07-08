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
		System.out.println("Enter a number: ");
        int num;
      if(in.hasNextInt()){
		num=in.nextInt();
		
		if (num!=0){
			if(num>0){
				System.out.println("Positive");
			}
			else{
				System.out.println("Negative");
			}
		}
		else{
			System.out.println("Zero");
		}
      }
	}

}