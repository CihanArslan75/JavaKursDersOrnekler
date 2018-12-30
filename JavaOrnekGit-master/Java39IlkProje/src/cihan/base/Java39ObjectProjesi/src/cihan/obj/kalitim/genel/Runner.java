package cihan.obj.kalitim.genel;

public class Runner {

	public static void main(String[] args) {
		
		
		//Arac temp = new  Arac();
		Araba araba = new  Araba();//static blok bir kere çalýþtý. 
		Araba araba1 = new  Araba(5); //araba ikinci kez çalýþtýðýnda static bloðu üstte çalýþtýðý için tekrar çalýþmýyor.
	
		/*Arac temp = new  Arac();
		temp.hiz=100;
		temp.model="2018";
		temp.marka="BMW";
		
		Arac ford = new  Arac();
		ford.model="2019";
		ford.marka="FORD";
		
		System.out.println("ford hiz :"+ford.hiz);
		System.out.println("ford model :"+ford.model);
		System.out.println("ford marka :"+ford.marka);
		
		System.out.println("temp hiz :"+temp.hiz);
		System.out.println("temp model :"+temp.model);
		System.out.println("temp marka :"+temp.marka);
		
		
		ford.hiz=200;
		System.out.println("ford hiz :"+ford.hiz);
		System.out.println("temp hiz :"+temp.hiz);*/

	}

}
