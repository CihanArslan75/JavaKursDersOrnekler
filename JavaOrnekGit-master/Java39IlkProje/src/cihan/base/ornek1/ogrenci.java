package cihan.base.ornek1;

public class ogrenci {
	
	public ogrenci() {
//	      toplam();
//	      cikartma();
//	      
		sart();
		sart2();
	}
	
	private void sart() {
		int sayi=3;
		if(sayi==5) {
			sayi=sayi+1;
		}
		else if(sayi==3) {
			sayi=sayi-1;
		}
		else {
			sayi=sayi+4;
		}
		System.out.println(sayi);	}
	
	
	private void sart2() {
		int sayi=3;
		if(sayi==5) {
			sayi=sayi+1;
		}

        if(sayi==3) {
			sayi=sayi-1;
		}
		System.out.println(sayi);	}

	
	private void toplam() {
		System.out.println(4+5);
		
	}

	private void cikartma() {
		System.out.println(45-4);
		
	}
	

	
}
