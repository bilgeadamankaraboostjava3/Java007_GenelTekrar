package com.muhammet;

public class Runner_Deigikenler {

	public static void main(String[] args) {
		// primitive Data Type
		byte b = 1;
		short s=1;
		int i= 1;
		long l = 1394857349934875L;
		// �nemli
		l = b; // 
		s = (short)i; // cast -> e�er int de�eri atand��� de�erin s�n�rlar�n� a��yor ise ilgili datatype s�n�rlar�na daralt�l�r.
		// dilin default de�erleri -> tamsay� i�in (int) ondal�kl� i�in (double)
		double d=1221.12121212;
		float f = 1122.2112f;
		
		char karakter = 'A';
		karakter = 64;
		System.out.println(karakter);
		System.out.println((int)karakter);
	    
		String ifade = "g�nayd�n herkese"; // References Data Type
		
		boolean durum = true; //  false
		
	}
}
