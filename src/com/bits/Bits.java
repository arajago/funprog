package com.bits;

public class Bits{
	
	//Given an integer counts the number of bits set to 1 in the int
	public static int countBits(int n){
		int oneBits = 0;
		while(n != 0){
			oneBits += n & 1;
			n = n >>> 1;
		}
		return oneBits;
	}
	
	public static boolean numIsEven(int n){
		if( (n & 1) == 0){
			return true;
		}
		return false;
	}
	
	// Given a positive number, returns the negative number
	public static int toNegative(int n){
		return ~n + 1;
	}
	
	//Given a integer, returns the binary String representation
	public static String intToBinaryString(int n){
		if(n == 1){
			return String.valueOf(n);
		}
		return intToBinaryString(n >>> 1) + (n & 1);
	}
	
	//Check if number is negative
	public static boolean isNegative(int n){
		if(((n >>> 31) & 1) == 1){
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){

	}
	
}