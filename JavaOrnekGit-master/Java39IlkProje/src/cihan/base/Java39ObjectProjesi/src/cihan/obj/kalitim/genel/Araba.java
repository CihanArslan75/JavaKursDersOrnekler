package cihan.obj.kalitim.genel;

public class Araba {
	// mainden �nce static bloklar �al���r. 
	//static int hiz ;
	static{
		System.out.println("Buraya Geldi");
		int hiz = 1;  // static de�ere atama 
	}

	 public Araba() {
		 System.out.println("Araba �al��t�.");
	 }
	 
	 public Araba(int hiz1) {
		 System.out.println("Araba �al��t� 2");
		 System.out.println(hiz1);
		 
	 }
}
