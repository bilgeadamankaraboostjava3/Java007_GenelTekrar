package com.muhammet;

public class Runner_Diziler {

	public static void main(String[] args) {
	
		/**
		 * ilk index -> 0
		 * son index -> (boyut/eleman sayýsý-1)
		 */
		int[] sayi_dizisi = new int[5]; // {0,0,0,0,0} // boyutu 5 ->
		int[] sayi_dizisi4 = {1,2,3};// boyutu 3
		int sayi_dizisi2[];
		int [] sayi_dizisi3;
		// 		  index			önce  -> {0,0,0,0,0}
		sayi_dizisi[3] = 123;// sonra -> {0,0,0,123,0} 
		
		// dizinin sýnýrlarý dýþýnda deðer atamanýn syntax olarak sakýncasý yoktur. 
		// sayi_dizisi[10] = 12; istisna fýrlatýr.
		System.out.print("{");
		System.out.print(sayi_dizisi[0]+", ");
		System.out.print(sayi_dizisi[1]+", ");
		System.out.print(sayi_dizisi[2]+", ");
		System.out.print(sayi_dizisi[3]+", ");
		System.out.print(sayi_dizisi[4]);
		// System.out.print(sayi_dizisi[5]); dizinin sýnýrlarý dýþýnda bir deðere ulaþmak istersek istisna fýrlatýr.
		
		System.out.println(" }");
		

	}

}
