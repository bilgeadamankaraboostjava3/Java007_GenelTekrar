package com.muhammet;

public class Runner_Diziler {

	public static void main(String[] args) {
	
		/**
		 * ilk index -> 0
		 * son index -> (boyut/eleman say�s�-1)
		 */
		int[] sayi_dizisi = new int[5]; // {0,0,0,0,0} // boyutu 5 ->
		int[] sayi_dizisi4 = {1,2,3};// boyutu 3
		int sayi_dizisi2[];
		int [] sayi_dizisi3;
		// 		  index			�nce  -> {0,0,0,0,0}
		sayi_dizisi[3] = 123;// sonra -> {0,0,0,123,0} 
		
		// dizinin s�n�rlar� d���nda de�er ataman�n syntax olarak sak�ncas� yoktur. 
		// sayi_dizisi[10] = 12; istisna f�rlat�r.
		System.out.print("{");
		System.out.print(sayi_dizisi[0]+", ");
		System.out.print(sayi_dizisi[1]+", ");
		System.out.print(sayi_dizisi[2]+", ");
		System.out.print(sayi_dizisi[3]+", ");
		System.out.print(sayi_dizisi[4]);
		// System.out.print(sayi_dizisi[5]); dizinin s�n�rlar� d���nda bir de�ere ula�mak istersek istisna f�rlat�r.
		
		System.out.println(" }");
		

	}

}
