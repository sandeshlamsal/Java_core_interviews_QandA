package com.san.ReverseInteger;

public class ReverseInteger {
/*Reverse Integer ALGO 2 ways
 * 1. Using  reminder and div operation
 * while num !=0;
 * multiply num*10 + num/10  to get right digit
 * get the remaining left most digits
 * perform until 0
 * 
 * 2. using StringBuffer as it has reverse class
 *   first convert the number to string in StringBuffer
 *   use the reverse method
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=123456789;
		long rev=0;
		while(num!=0){
			rev=rev*10+num%10;// 5,4,3,2,1
			num=num/10; //1234,123,12,1
		}
		System.out.println("Reverse no is " + rev);
		
		//method 2
		int num1=123456789;
		StringBuffer revString=new StringBuffer(String.valueOf(num1)).reverse();
		System.out.println(revString);
	}
}
