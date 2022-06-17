package com.muhammet;

public class Runner_Deigikenler {

	public static void main(String[] args) {
		// primitive Data Type
		byte b = 1;
		short s=1;
		int i= 1;
		long l = 1394857349934875L;
		// önemli
		l = b; // 
		s = (short)i; // cast -> eğer int değeri atandığı değerin sınırlarını aşıyor ise ilgili datatype sınırlarına daraltılır.
		// dilin default değerleri -> tamsayı için (int) ondalıklı için (double)
		double d=1221.12121212;
		float f = 1122.2112f;
		
		char karakter = 'A';
		karakter = 64;
		System.out.println(karakter);
		System.out.println((int)karakter);
	    
		String ifade = "günaydın herkese"; // References Data Type
		
		boolean durum = true; //  false
		
	}
}
