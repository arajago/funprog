package com.arrays;


public class EvenFirst{
	
	public static void evenFirst(int[] a){
		int i=0;
		int j=a.length-1;
		
		while (i < j){
			int iRem = a[i]%2;
			int jRem = a[j]%2;
			if(iRem != 0 && jRem == 0){
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}else{
				if(iRem == 0){
					i++;
				}
				if(jRem == 1){
					j--;
				}
			}
		}
		printArr(a);
		
	}
	
	public static void printArr(int[] a){
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(a[i] +" ");
		}
	}
	
	public static void main(String[] args){
		int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		printArr(a);
		evenFirst(a);
		printArr(a);
	}
}