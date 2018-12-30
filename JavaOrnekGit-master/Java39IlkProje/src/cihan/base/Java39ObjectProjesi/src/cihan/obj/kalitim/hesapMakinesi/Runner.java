package cihan.obj.kalitim.hesapMakinesi;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args)  {
		String islem="";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Hesaplamak için iki sayý ");
		int sayi1 = scanner.nextInt();
		int sayi2=scanner.nextInt();
		
		System.out.println("Hesaplamak için iþlem giriniz !!!  ");
		islem = scanner.next();
		
		IslemYap islemyap= new IslemYap(sayi1,sayi2,islem);
		System.out.println(islemyap.islem());
				
	} 
}
