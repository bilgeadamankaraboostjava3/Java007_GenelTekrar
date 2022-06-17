package com.muhammet;

public class Runner_operatorler {

	public static void main(String[] args) {

		/**
		 *  iþlem  + - * / %
		 *  artýrým/eksiltim ++ --
		 *  iþlemsel atama +=, -=, *=, /= , %=
		 *  >, <, >= , <=, ==, !=
		 *  ||, &&
		 */

		int s1=10, s2=4, sonuc;
		sonuc = s1 + s2;
		sonuc = s1 * s2;
		sonuc = s1 / s2;
		sonuc = s1 - s2;
		sonuc = s1 % s2;
		
		// sonuc = s1++; // sonda ise artma iþlemi sonraki kullanýmda
		sonuc = ++s1; // önde ise önce artým sonra atama yapýlýr.
		System.out.println("Sonuç....: "+ sonuc);
		System.out.println("s1.......: "+ s1);
		
		sonuc= 100;
		s1= 15;
		// sonuç deðerine s1 i eklemek istiyuorum
		// sonuc = 100 + 15;
		sonuc = sonuc + s1; // 100 -> 115
		sonuc += s1; // 115 -> 130
		System.out.println(sonuc);
		
		String dbKa = "Admin";
		String girisKa = "Admin";
		boolean durum =  dbKa == girisKa; // true, false
		System.out.println(durum);
		
		String dbSf = "123321";
		String girisSf = "123321";

		durum = dbKa == girisKa &&  dbSf == girisSf; // true,false
		System.out.println(durum);
		
	}

}
