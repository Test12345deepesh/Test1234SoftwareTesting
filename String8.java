package com.javaprogram;

public class String8 {

	public static void main(String[] args) {
		String s="MAdam";//Pallindrome or not
         System.out.println(IsPallindrome(s));
         System.out.println(IsPallindrome("fsvgfdfsgd"));
	}
	
	
	public static boolean IsPallindrome(String s)
	{
		s=s.toLowerCase();//madam
		for(int i=0;i<s.length()/2;i++)
		{ 
			if(s.charAt(i)!=s.charAt(s.length()-i-1))
			{
				return false;
			}
		}
		return true;
	}

}
