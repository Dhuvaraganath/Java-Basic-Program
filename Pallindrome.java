package com.String;

import java.util.Scanner;

public class Pallindrome {
		public static boolean ispallindrome(String s) {
		s=s.toLowerCase();
		int len=s.length();
		for(int i=0 ;i<len/2;i++)
		{
			if(s.charAt(i) != s.charAt(len-1-i) )
				return false;
		}
				return true;
		
			}

	public static void main(String[] args) {
		boolean n=true;
		
		while(n) {
			System.out.print("Enter the String:");
		@SuppressWarnings("resource")
		Scanner scn = new Scanner(System.in);
		String s=scn.next();
		
		if(ispallindrome(s))
			System.out.println("String is Pallindrome");
		else 
			System.out.println("String is not a Pallindrome");
			
		}
		
		
	}

}
