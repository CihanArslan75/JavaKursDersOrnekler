package cihan.obj.kalitim.lateBinding;

public class Runner {

	public static void main(String[] args) {
		Arac[] araclar ={new Araba(),new Motorsiklet()};
		for(Arac arac : araclar){
			arac.Calis();
			arac.YakitAl();
			System.out.println("----------------------------------------");
		}
	}

}
