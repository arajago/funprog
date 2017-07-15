package com.arrays;
import static java.lang.Math.*;

public class StockMaxProfit{

	public static int maxProfit(int[] a){
		int maxProfit = 0;
		int minPrice = a[0];
		for(int i=1; i< a.length; i++){
			maxProfit = max(maxProfit, a[i] - minPrice);
			minPrice = min(minPrice, a[i]);
		}
		return maxProfit;
		
	}
	
	public static void main(String[] args){
		int[] a = new int[]{310, 315, 275, 295, 260, 270, 290, 230, 255, 250};
		System.out.println(maxProfit(a));
	}



}