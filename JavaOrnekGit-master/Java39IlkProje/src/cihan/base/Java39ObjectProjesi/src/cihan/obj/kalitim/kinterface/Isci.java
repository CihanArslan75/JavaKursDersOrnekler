package cihan.obj.kalitim.kinterface;

public class Isci implements Calisabilir,Insan{

	private String isciAdi;
	public Isci(String isciAdi){
		this.isciAdi=isciAdi;
	}
	@Override
	public void Calis() {
		System.out.println(isciAdi+ " ���i �al���yor");
		
	}

	@Override
	public void Dinlen() {
		
		System.out.println(isciAdi+ " ���i Dinleniyor");
	}

	@Override
	public void YemekYe() {
		
		System.out.println("���i Yemek Yiyor");
	}

	@Override
	public void MolaVer(int zaman) {
		
		System.out.println(zaman+ " Dakika mola verdi .");
	}

}
