package cihan.obj;

public class Runner {

	public static void main(String[] args) {
		Arac  temp = new Arac(); // ramde temp adres tutuyor.
		//temp.koltuk = true;
		temp.setKoltuk(true);
		temp.setTekerlekSayisi(4);
		
		Arac  temp1 = new Arac(); // ramde temp1 yeni bir adres tutuyor.
		temp1.setKoltuk(true);
		//temp1.koltuk = true;
		temp1.setTekerlekSayisi(10);
		
		temp = temp1;   //clonlama  (temp1 adresi tempin adresi ne atýlýyor. temp adresi bitti.  )
		temp.toString();
		temp.setTekerlekSayisi(5);
		
		System.out.println(temp.getTekerlekSayisi());
		System.out.println(temp1.getTekerlekSayisi()); 
		// 5  5 çýkar. 
	}

}
