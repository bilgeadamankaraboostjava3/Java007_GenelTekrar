package com.muhammet;

import java.util.Scanner;

public class Runner_Donguler {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++) {
			System.out.println("Durmasak m�?");
		}
		int sayac = 0;
		while(sayac<10) {
			System.out.println("While loop");
			sayac++;
		}
		Scanner scanner = new Scanner(System.in);
		int secim = 0;
		// se�im de�eri e�er 0 de�il ise d�nmeye devam et
		// secim != 0 
		// secim = 0  => 0 != 0 -> s�f�r, s�f�r a e�it de�ilmidir? false
		while(secim != 0) { 
			System.out.print("While ��kmak i�in 0 se�iniz.....: ");
			secim = scanner.nextInt();
		}
		secim = 0;
		do {
			System.out.print("Do..While ��kmak i�in 0 se�iniz.....: ");
			secim = scanner.nextInt();
		}while(secim !=0);
		
		
		System.out.println("PROGRAM B�TT�");

	}

}
