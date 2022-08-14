package com.demo4;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int no1=0,no2=1,no3,count=10;
		
		for(int i=2;i<=count;i++)
		{
			no3=no1+no2;
			
			System.out.println(""+no3);
			no1=no2;
			no2=no3;
		}

	}

}
