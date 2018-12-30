package cihan.abj.insan;

public class Runner {

	public static void main(String[] args) {
		
		Insan ben =new Insan();
		
		System.out.println(ben.adi);
		ben.adi="Cihan";
		System.out.println(ben.adi);
		ben.soyadi="Arslan";
		System.out.println(ben.anne = new Insan());
		ben.anne.adi="Medine";
		
		System.out.println(ben.anne.anne = new Insan()) ; // adres gösterir. 
		//ben.baba.adi= "Teyfik";
		//ben.baba.baba.adi = "aaa";
		//ben.baba.anne.adi="bbb";
//		System.out.println(ben.adi);
//		System.out.println(ben.baba.adi);
//		System.out.println(ben.anne.adi);
//		System.out.println(ben.anne.anne.adi);

	}

}
