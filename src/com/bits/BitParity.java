package com.bits;

public class BitParity{

	//Brute force approach to get the bit parity
	public static boolean parityBruteForce(int n){
		int oneBits = countBits(n);
		if((oneBits & 1) == 1){
			return false;
		}
		return true;
	}
	
	
	//XOR the last bit with 1, since we care only if the 1s match and not the count
	public static boolean parityBruteForce2(int n){
		int result = 0;
		while (n > 0){
			result = result ^ (n & 1);
			n = n >>> 1;
		}
		return ((result == 1 )? false: true);
	}
	
	/*
		Based on the idea, x & (x-1) is equals to x with it lowest 1 bit removed.
		(eg) 10010 & 10001 = 10000
		So, the number of steps required to compute parity will be number of 1 bits.
	*/
	public static boolean parityBitFiddling(int n){
		int result = 0;
		while(n > 0){
			n = n & (n-1);
			// Each iteration of the loop removes the least significant 1 bit of n. 
			//So, result is basically XOR of its previous value.
			result = result ^ 1;
		}
		return ((result == 1 )? false: true);
	}
	

	//using lookup table with 2^8 entries
	public static boolean parityByLookup(int n){
		int BIT_MASK = 255; //1111 1111
		int p1 = n & BIT_MASK;
		int p2 = (n >>> 8) & BIT_MASK;
		int p3 = (n >>> 16) & BIT_MASK;
		int p4 = n >>> 24;
		//todo: using the lookup table, find the parity of p1 - p4 and XOR the results.
		return true;
	}
	
	
	public static boolean parityByXOR(int n){
		n = n ^ n >>> 16;
		n = n ^ n >>> 8;
		n = n ^ n >>> 4;
		n = n ^ n >>> 2;
		n = n ^ n >>> 1;
		
		return (((n & 1) == 1 )? false: true);
	}
	
	
	

	
	
	
	public static int countBits(int n){
		int oneBits = 0;
		while(n != 0){
			oneBits += n & 1;
			n = n >>> 1;
		}
		return oneBits;
	}
	
	public static void main(String[] args){
		System.out.println("parityBruteForce(5) "+parityBitFiddling(5));
		System.out.println("parityBruteForce(4) "+parityBitFiddling(4));
		System.out.println("parityBruteForce(9) "+parityBitFiddling(9));		
	}
}