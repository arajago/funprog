package com.arrays;

//Delete duplicate elements of a sorted array
public class DeleteDup{
	public static int deleteDup(int[] a){
		int uI = 0;
		for(int i=1; i< a.length; i++){
			if(a[uI] != a[i]){
				if(uI+1 != i){
					int t= a[uI+1];
					a[uI+1] = a[i];
					a[i] = t;
				}
				uI++;
			}
		}
		return uI+1;
	}
	
	public static int deleteDupClean(int[] a){
		int wIndex = 1;
		for(int i = 1; i< a.length; i++){
			if(a[wIndex-1] != a[i]){				
				a[wIndex++] = a[i];				
			}
		}	
		return wIndex;
	}
	
	public static void printArr(int[] a, int n){
		System.out.println("	");
		for(int i=0; i< n ;i++){
			System.out.print(a[i] + " ");
		}
	}
	
	public static void main(String[] args){
		int[] a = {2, 3, 5, 5, 7, 11, 11, 11, 13, 13, 15};
		printArr(a, a.length);
		//printArr(a, deleteDup(a));
		printArr(a, deleteDupClean(a));
	}
}