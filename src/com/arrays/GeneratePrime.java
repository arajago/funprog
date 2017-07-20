package com.arrays;


public class GeneratePrime{

	//Generate prime numbers between 1 and n (inclusive)
	public static int[] generatePrime(int n){
		int[] a = new int[n];
		int pCount = 0;
		for(int i = 2; i < n ; i++){
			if(isPrime(i, a, pCount)){
				a[pCount++] = i;
			}
		}
		return a;
	}
	
	public static boolean isPrime(int num, int[] a, int pCount){
		for(int i = 0; i < pCount ; i++){
			if(num % a[i] == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args){
		printArr(generatePrime(18));
	
	}
}