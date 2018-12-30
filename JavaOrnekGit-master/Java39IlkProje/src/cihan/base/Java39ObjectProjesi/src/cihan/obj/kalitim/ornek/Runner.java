package cihan.obj.kalitim.ornek;

public class Runner {

	public static void main(String[] args) {
		Arac[] araclar = {new UstuAcýkAraba(), //late binding
				          new BinekAraba(),//late binding
				          new SporAraba(),//late binding
				          new  Araba(),//late binding
				          new Arac() };  //late binding yok
		
		for (Arac arac : araclar) {
			arac.YakitAl();
			arac.Calis();
		}
	}
}
