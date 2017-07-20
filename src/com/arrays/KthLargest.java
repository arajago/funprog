package com.arrays;

public class KthLargest{
	
	public static int kthLargest(int[] a, int k){
		int kth = Integer.MAX_VALUE;
		int left = 0, right = a.length-1;
		while(true){
			int pIndex = partition(a, left, right);
			if(pIndex == k-1){
				kth = a[pIndex];
				break;
			}else if(pIndex > k-1){
				right = pIndex -1;
			}else{
				left = pIndex+1;
			}
		}
		return kth;
	
	}
	
	//Partition on decreasing order
	public static int partition(int[] a, int left, int right){
		int pivot = a[right], pIndex=0;
		for(int i=0; i< right; i++){
			if(a[i] > pivot){
				swap(a, i, pIndex++);
			}
		}
		swap(a, pIndex, right);
		return pIndex;
	}
	
	private static void swap(int[] a ,int i, int j){
		int t = a[i];
		a[i]=a[j];
		a[j]=t;
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
	}
	
	public static void main(String[] args){
		int a[] = {4, 5, 1, 3,8, 9, 2, 6, 7, 10 };
		printArr(a);
		System.out.println("kthLargest(a, 1) "+kthLargest(a, 1));
		System.out.println("kthLargest(a, 2) "+kthLargest(a, 2));
		System.out.println("kthLargest(a, 6) "+kthLargest(a, 6));
		System.out.println("kthLargest(a, 9) "+kthLargest(a, 9));
		System.out.println("kthLargest(a, 10) "+kthLargest(a, 10));
	}


}