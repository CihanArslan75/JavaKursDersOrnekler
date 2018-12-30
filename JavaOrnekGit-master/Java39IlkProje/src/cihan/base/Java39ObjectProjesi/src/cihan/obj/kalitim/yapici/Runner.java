package cihan.obj.kalitim.yapici;

public class Runner {

	public static void main(String[] args) {
		new Araba(2); //2 4 5 6
		System.out.println("------------------------");
		new Araba(); //2 4 5 
		System.out.println("------------------------");
		new BinekArac();  // 1 3 
		System.out.println("------------------------");
		new BinekArac(6); // 2 4 

	}

}


// en tepeden baþlayarak yapýcý metotlarý çalýþtýrý.