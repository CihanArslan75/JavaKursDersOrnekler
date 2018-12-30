package cihan.obj.kalitim.kinterface;

public class Runner {

	public static void main(String[] args) {
		Isci temp = new Isci("aaaaa");
		System.out.println(temp);
		temp.Calis();
		temp.Dinlen();
		temp.MolaVer(10);
		temp.YemekYe();
		Robot r = new Robot();
		r.Calis();
		r.Dinlen();
		
		//Calisabilir calis = temp; //calisabilir tipinde olduðu için insandaki metotlar gelmeyecek.
		Calisabilir[] calis= {new Isci("aaa"),new Robot()};  //0 da iþci 1 de robot var
		System.out.println(calis);
		calis[0].Calis();//Isci
		calis[0].Dinlen();
		calis[1].Calis();//robot
		Isci deneme =(Isci)calis[0];
		deneme.YemekYe();
		
		((Isci)calis[0]).YemekYe();

	}

}
