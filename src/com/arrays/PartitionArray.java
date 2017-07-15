package com.arrays;

public class PartitionArray{
	
	//Arranges false values first and then true values in an array.
	public static void rearrangeArr(boolean[] a){
		int lo = 0;
		int hi = a.length -1;
		
		while(lo < hi){
			if(a[lo] == true && a[hi] == false){
				a[lo++] = false;
				a[hi--] = true;
			}else{
				if(a[lo] == false){
					lo++;
				}
				if(a[hi] == true){
					hi--;
				}	
			}
		}
	}
	
	public static void printArr(boolean[] arr){
		System.out.println("	");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	public static void main(String[] args){
		boolean[] a = new boolean[]{true, false, false, true, false, true, true, true, false, true, false, true, true};
		printArr(a);
		rearrangeArr(a);
		printArr(a);
	}
}