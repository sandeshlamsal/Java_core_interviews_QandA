package com.san.ReverseString;

public class ReverseString {
	//to reverse reverse the array using for loop
	/*
	 * for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Selenium";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--){
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}
}
