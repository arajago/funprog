package com.arrays;

public class IncrementNumberArr{
	
	public static int[] incrementNumberArr(int[] a){
		int hi = a.length-1;
		if(a[hi] < 9){
			a[hi]++;
			return a;
		}
		//We wont require an additional size for sure, if a[0] is not nine.
		while (hi >= 0 && a[hi] == 9){
			a[hi] = 0;
			hi--;
		}	
		if(hi < 0){
			int[] b = new int[a.length+1];
			b[0]= 1;
			return b;
		}else{
			a[hi]++;
			return a;
		}
	}
	
	public static void printArr(int[] a){
		System.out.println("	");
		for(int i=0; i< a.length; i++){
			System.out.print(a[i]);
		}
	}
	
	public static void main(String[] args){
		int[] a = new int[] {1, 2, 3, 4};
		printArr(a);
		int[] b = incrementNumberArr(a);
		printArr(b);
		
		System.out.println("	");
		a=new int[] {1, 2, 3, 9};
		printArr(a);
		b = incrementNumberArr(a);
		printArr(b);
		
		System.out.println("	");
		a=new int[] {8, 9, 9, 9};
		printArr(a);
		b = incrementNumberArr(a);
		printArr(b);
		
		System.out.println("	");
		a=new int[] {9, 9, 9, 9};
		printArr(a);
		b = incrementNumberArr(a);
		printArr(b);
	}
}