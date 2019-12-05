package com.String;
public class Anagram {

	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		if(isAnaam(s1,s2))
		{
			System.out.println("Given String is Anagram");
		}
		else
		{
			System.out.println("Given String is not a Anagram");
		}
	}

	private static boolean isAnaam(String s1, String s2) {
		
		
		while(s1.length()>0 || s2.length()>0)
		{
			if(s1.length() != s2.length()) 
			{
			return false;
			}
		char c =s1.charAt(0);
		s1 =s1.replace(c+"","" );
		s2 =s2.replace(c+"","" );
		}
		return true;
		
	}

}
