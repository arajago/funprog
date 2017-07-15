package com.arrays;


public class DutchPartitionColors{
	
	private enum Color{
		WHITE, RED, BLACK;
	}
	
	public static void partition(Color[] colors, Color pivot){
		int equals=0, smaller = 0, larger = colors.length;
		int pColor = pivot.ordinal();
		while(equals < larger){
			
			if(colors[equals].ordinal() > pColor){
				larger --;
				Color temp = colors[equals];
				colors[equals] = colors[larger];
				colors[larger] = temp;
			}else if(colors[equals].ordinal() == pColor){
				equals++;
			}else{
				Color temp = colors[equals];
				colors[equals] = colors[smaller];
				colors[smaller] = temp;
				equals++;
				smaller ++;
			}
		}
	}

	public static void printColorArr(Color[] colors){
		System.out.println("	");
		for(int i=0; i< colors.length; i++){
			System.out.print(colors[i].toString() + " ");
		}
		
	}
	
	public static void main(String[] args){
		Color[] colors = {Color.RED, Color.BLACK,Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK, Color.RED, Color.WHITE, 
		Color.RED, Color.BLACK,Color.WHITE, Color.BLACK, Color.WHITE, Color.BLACK, Color.RED, Color.WHITE}; 
		printColorArr(colors);
		partition(colors, Color.RED);
		printColorArr(colors);
	}
}