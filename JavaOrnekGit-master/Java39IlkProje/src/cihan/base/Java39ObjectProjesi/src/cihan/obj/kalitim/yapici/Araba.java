package cihan.obj.kalitim.yapici;

public class Araba extends BinekArac {
	
	
	public Araba(){
		super(4); // super ile parametreliyi �a��r�yoruz. Bu olmazsa �st klasstaki parametresiz olan� �al��t�r�rd�
		System.out.println("5");
	}
	
	public Araba (int hiz){
		this();  //6.sat�rdaki kendi class�ndaki arabay� �a��r�r.
		System.out.println("6");
	}

}
