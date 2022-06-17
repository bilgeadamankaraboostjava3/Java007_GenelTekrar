package com.muhammet;

public class Runner_Karayapilari {

	public static void main(String[] args) {
		// parantezin içi doðru ise yap
		if(true) {
			System.out.println("Koþul Doðru");
		}
		
		int s1=10,s2=15;
		// hangi sayý büyük ise onu ekrana yaazdýr.
		if(s1>s2)
			System.out.println("Büyük sayý...: "+ s1);
		else
			System.out.println("Büyük sayý...: "+ s2);
		
		boolean durum = false;
		
		if(durum) {
			System.out.println("Durum true");
		}else {
			System.out.println("Durum false");
		}

		s1=-5;
		s2=-1;
		int s3=-22;
		
		if(s1>s2 && s1>s3)
			System.out.println("Büyük sayý...: "+ s1);
		else if(s2>s1 && s2>s3)
			System.out.println("Büyük sayý...: "+ s2);
		else
			System.out.println("Büyük sayý...: "+ s3);
		
		
		
		
	}

}
