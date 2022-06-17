package com.muhammet;

import java.util.Scanner;

public class Runner_Donguler {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Durmasak mý?");
		}
		int sayac = 0;
		while(sayac<10) {
			System.out.println("While loop");
			sayac++;
		}
		Scanner scanner = new Scanner(System.in);
		int secim = 0;
		// seçim deðeri eðer 0 deðil ise dönmeye devam et
		// secim != 0 
		// secim = 0  => 0 != 0 -> sýfýr, sýfýr a eþit deðilmidir? false
		while(secim != 0) { 
			System.out.print("While Çýkmak için 0 seçiniz.....: ");
			secim = scanner.nextInt();
		}
		secim = 0;
		do {
			System.out.print("Do..While Çýkmak için 0 seçiniz.....: ");
			secim = scanner.nextInt();
		}while(secim !=0);
		
		
		System.out.println("PROGRAM BÝTTÝ");

	}

}
