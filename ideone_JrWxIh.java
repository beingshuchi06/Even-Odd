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
		int num=in.nextInt(),temp,digits=0,r,sum=0;
		temp=num;
		while(temp!=0){
			digits++;
			temp=temp/10;
		}
		
		temp=num;
		
		while(temp!=0){
			r=temp%10;
			sum=sum+power(r,digits);
			temp=temp/10;
		}
		
		if(num==sum){
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not Armstrong");
		}
	}
	
	
	
	
	public static int power(int n,int r){
		int c,p=1;
		for(c=1;c<=r;c++){
			p=p*n;
		}
		return p;
	}
}