package com.javaprogram;

public class String4 {

	public static void main(String[] args) {
		String s="Java Developer";
		int count=getcount(s,'e');
		//o/p e=3;
		System.out.println("e="+count);
        System.out.println("v="+getcount(s,'v'));
        System.out.println("a="+getcount(s,'a'));
	}
	   
	 public static int getcount(String s,char c) {
return s.length()-s.replace(c+"","").length();
		    
              }
}
