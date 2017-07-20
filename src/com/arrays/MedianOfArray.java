package com.arrays;

public class MedianOfArray{
	public static int median(int[] a){
		int mIndex = a.length/2;
		int hi=a.length-1, lo=0;
		int median = -1;
		while(true){
			int pIndex = partition(a,lo, hi);
			if(mIndex == pIndex){
				median = a[pIndex];
				break;
			}else if(pIndex < mIndex){
				lo = pIndex+1;
			}else if (pIndex > mIndex){
				hi = pIndex -1;
			}
		}
		return median;
	}
	
	//Standard QuickSort partition, that will find place the hi element in to its correct Index
	public static int partition(int[] a, int lo, int hi){
		int pivot=a[hi], pIndex =0;
		for(int i=0; i<hi; i++){
			if(a[i] < pivot){
				int t = a[i];
				a[i] = a[pIndex];
				a[pIndex]=t;
				pIndex++;
			}
		}
		a[hi]=a[pIndex];
		a[pIndex]=pivot;
		return pIndex;
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i]+" ");
		}
	}

	public static void main(String[] args){
		int a[] = {4, 5, 1, 3,8, 9, 2, 6, 7, 10 };
		System.out.println("Median of Array: "+median(a));
		
	}
}