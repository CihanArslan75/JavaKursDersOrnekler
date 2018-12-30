package cihan.obj.kalitim.genel;

public class Araba {
	// mainden önce static bloklar çalýþýr. 
	//static int hiz ;
	static{
		System.out.println("Buraya Geldi");
		int hiz = 1;  // static deðere atama 
	}

	 public Araba() {
		 System.out.println("Araba Çalýþtý.");
	 }
	 
	 public Araba(int hiz1) {
		 System.out.println("Araba Çalýþtý 2");
		 System.out.println(hiz1);
		 
	 }
}
