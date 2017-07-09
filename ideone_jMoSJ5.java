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
        System.out.println("Enter number a: ");
        int a=in.nextInt();
        System.out.println("Enter number b: ");
        int b=in.nextInt();
        System.out.println("Enter number c: ");
        int c=in.nextInt();
    
       if(a>b && a>c){
         System.out.println("a is the largest number");
          }
     else if(b>a && b>c){
       System.out.println("b is the largest number");
      }
     else{
      System.out.println("c is the largest number");
          }
	}
}