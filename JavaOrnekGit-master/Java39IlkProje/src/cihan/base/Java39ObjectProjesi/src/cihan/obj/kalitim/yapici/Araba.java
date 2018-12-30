package cihan.obj.kalitim.yapici;

public class Araba extends BinekArac {
	
	
	public Araba(){
		super(4); // super ile parametreliyi çaðýrýyoruz. Bu olmazsa üst klasstaki parametresiz olaný çalýþtýrýrdý
		System.out.println("5");
	}
	
	public Araba (int hiz){
		this();  //6.satýrdaki kendi classýndaki arabayý çaðýrýr.
		System.out.println("6");
	}

}
