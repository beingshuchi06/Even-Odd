/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int arr[]=new int[10];
		Scanner in = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			arr[i]=in.nextInt();
		}
		
		int largest = arr[0];
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>largest){
				largest=arr[i];
			}
		}
		System.out.println(largest);
	}
}