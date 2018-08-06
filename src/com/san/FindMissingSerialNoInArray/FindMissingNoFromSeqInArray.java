package com.san.FindMissingSerialNoInArray;

public class FindMissingNoFromSeqInArray {

	/*be sure the array is sequential
	 * get sum of all elements in array original 1,2,4,5
	 *get sum of all elements in sequence 1,2,3,4,5
	 *now sub sum from 1st sum to get the no
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]={1,2,3,5};
		int len=a.length;
		int sum1=0;
		for(int i=0;i<len;i++){
			sum1=sum1+a[i];
		}
		
		int sum2=0;
		for(int j=1;j<=len+1;j++){
			sum2=sum2+j;
		}
		System.out.println(sum1);
		System.out.println(sum1);
		int missing=sum2-sum1;
		System.out.println("The Missing No " + missing);
	}

}
