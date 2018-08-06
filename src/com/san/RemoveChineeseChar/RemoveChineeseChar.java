package com.san.RemoveChineeseChar;

public class RemoveChineeseChar {

	/*
	 * use regular expression in String class
	 * s.replaceAll(^a-zA-Z0-9)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="汉字  is Chineese String";
		String clearText=s.replaceAll("[^a-zA-Z0-9]"," ");
		System.out.println(clearText);
	}
}
