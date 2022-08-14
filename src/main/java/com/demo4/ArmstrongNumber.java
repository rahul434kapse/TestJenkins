package com.demo4;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int number=153,findnumber,result=0,n;
		
		findnumber=number;
		while(findnumber!=0)
		{
			n=findnumber%10;
			result +=Math.pow(n, 3);
			findnumber/=10;
		}
		if(result==number)
		{
			System.out.println("Given number is Armstrong number");
		}
		else
		{
			System.out.println("Given number is not a Armstrong number");
		}

	}

}
