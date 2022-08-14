package com.demo4;

public class PalindromeNo {

	public static void main(String[] args) {
		
		
		int num=12,flag=0;
		int n = num/2;
		if(num==1||num==2)
		{
			System.out.println("number is not prime because 2 and 1");
		}
		else
		{
			for(int i=2;i<=n;i++)
		{
		if(num%i==0)
		{
			System.out.println("number is not prime");
			flag=1;
			break;
		}
		}
		if(flag==0)
		{
			System.out.println("number is prime");
		}
		}
	}
	
}
