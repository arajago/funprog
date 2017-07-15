package com.arrays;

public class DutchPartition{
	
	/*
		Given an array a and index p, mutate the array in to three partions
			partition1: All elements less than a[p]
			partition2: All elements with same value as a[p]
			partition3: All elements greater than a[p]
	*/
	public static void dutchPartition(int[] a, int p){
		//To make the partition easier, first swap the last element and element at p
		int x = a[p];
		int len = a.length;
		int t = a[len - 1];
		a[len -1] = a[p];
		a[p] = t;
		
		//Now do the actual partition.
		int pI=0; 
		//The last element is the pivot element, so we can ignore the last element.
		for(int i = 0; i< len -1; i++){
			if(a[i] <= x){
				//swap element at Pivot Index (pI) and i
				t = a[i];
				a[i] = a[pI];
				a[pI] = t;
				pI++;
			}
		}
		//Now swap element at Pivot Index and the last element.
		a[len -1] = a[pI];
		a[pI] = x;
		
		
		//At this point, element x is at its right index, 
		//However the left partition of x may contain same some x that are are not grouped together
		int hi = pI-1;
		int lo = 0;
		while(lo < hi){
			if(a[lo] == x && a[hi] != x){
				a[lo] = a[hi];
				a[hi] = x;
				hi --;
				lo++;
			}else{
				if(a[lo]!= x){
					lo++;
				}
				if(a[hi] == x){
					hi--;
				}
			}
		}
		for(int i =0; i< pI; i++){
			if(a[i] == x){
						}
		}
		
	}
	
	
	public static void dutchPartitionEfficient(int[] a, int p){
		int smaller = 0, equal = 0, larger = a.length -1;
		int pivot = a[p];
		while(equal <= larger){
			if(a[equal] > pivot){
				int t = a[equal];
				a[equal] = a[larger];
				a[larger] = t;
				larger --;
			}else if(a[equal] == pivot){
				equal++;
			}else{
				int t = a[equal];
				a[equal]=a[smaller];
				a[smaller]= t;
				smaller++;
				equal++;
			}
		}
	}
	
	public static void printArr(int[] a){
		System.out.println(" ");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i] + " ");
		}		
	}
	
	
	public static void main(String[] args){
		int[] a = new int[]{6, 4, 5, 4, 3, 17, 2, 1, 5, 4, 3, 4, 2, 1, 6, 2, 5, 8, 9, 2, 4};
		printArr(a);
		dutchPartition(a, 1);
		printArr(a);
		dutchPartitionEfficient(a, 1);
		printArr(a);
	
	
	}
}