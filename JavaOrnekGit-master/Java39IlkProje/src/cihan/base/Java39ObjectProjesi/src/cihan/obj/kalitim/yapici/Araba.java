package cihan.obj.kalitim.yapici;

public class Araba extends BinekArac {
	
	
	public Araba(){
		super(4); // super ile parametreliyi çaðýrýyoruz. Bu olmazsa üst klasstaki parametresiz olaný çalýþtýrýrdý
		//this(1) ; // yazarsak 12. satýrda ki parametreli araba constructor çaðýrýr.
		System.out.println("5");
	}
	
	public Araba (int hiz){
		this();  //6.satýrdaki kendi classýndaki arabayý çaðýrýr.
		//this(1); // yazarsak kendi kendini çaðýrýr ve sonsuz döngüye girer.
		System.out.println("6");
	}

}
