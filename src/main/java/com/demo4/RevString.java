package com.demo4;

public class RevString {

	public static void main(String[] args) {
		
		
		String str="dad",rev="";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			rev=ch+rev;
		}
		System.out.println(rev);
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Strring is palindrome");
		}
		else
		{
			System.out.println("String is noit palindrome");
		}
	}

}
