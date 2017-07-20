package com.arrays;

public class Redistribution{
	
	//Distributes array in such a way that a[0] <= a[1] >= a[2] <= a[3] >= a[4]....
	// 
	public static int[] distributeArray(int[] a){
		int[] b = new int[a.length];
		//Array A is mutated and partioned on the median element.
		int median = median(a);
		int smallIndex =0;
		int largeIndex = 1;
		int medianIndex = a.length/2;
		for(int i=0; i< a.length; i++){
			if(i <= medianIndex){
				b[smallIndex] = a[i];
				smallIndex +=2;
			}else{
				b[largeIndex] = a[i];
				largeIndex +=2;
			}
		}
		return b;
	}
	
	
	//Find the median element of the array
	public static int median(int[] a){
		int median = Integer.MAX_VALUE;
		int left = 0, right = a.length-1;
		int mIndex = a.length/2;
		while(true){
			int pos = partition(a, left, right);
			if(pos == mIndex){
				median = a[pos];
				break;
			}else if(pos > mIndex){
				right = pos -1;
			}else{
				left = pos+1;
			}
		}
		return mIndex;
	
	}
	
	
	//Partition the array,using the right most element as the pivot
	public static int partition(int[] a, int left, int right){
		int pIndex = 0;
		int pivot = a[right];
		
		for(int i=0; i< right; i++){
			if(a[i] <= pivot){
				swap(a, i, pIndex++);
			}
		}
		swap(a, pIndex, right);
		return pIndex;
	}
	
	public static void swap(int[] a, int i, int j){
		int t = a[i];
		a[i] = a[j];
		a[j] = t;
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args){
		int[] a = new int[]{2, 4, 1, 3, 5};
		printArr(a);
		int[] b = distributeArray(a);
		printArr(b);
		a= new int[]{4, 4, 4, 4, 4, 4, 4};
		printArr(a);
		b = distributeArray(a);
		printArr(b);
	}
}