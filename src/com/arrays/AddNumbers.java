package com.arrays;

public class AddNumbers{

	/*
		Function to add two numbers which are represented as binary value in an array
		(eg) 5 - Array of size 3 ( 101)
	*/
	public static int[] addNumbers(int[] a, int[] b){
		int max = a.length;
		if( b.length > a.length){
			max = b.length;
		}
		
		//Allocate +1 to accomodate the carry bit.
		int[] c = new int[max+1];
		
		int i = max;
		int carryBit = 0;
		int aI = a.length - 1;
		int bI = b.length - 1;
		while(i >= 1){
			int aBit = (aI >= 0) ?  a[aI] : 0;
			int bBit = (bI >= 0) ?  b[bI] : 0;
			c[i--] = carryBit ^ aBit ^ bBit;
			carryBit = (carryBit & aBit) | (carryBit & bBit) | (aBit & bBit);
			aI--;
			bI--;
		}
		c[0] = carryBit;
		return c;
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+"	");
		}
	}
	
	public static void main(String[] args){
		int a[] = new int[]{1, 0, 1, 1};
		int b[] = new int[]{1, 0, 1, 0, 1, 1};
		
		int c[] = addNumbers(a, b);
		printArr(c);
	
	}
}