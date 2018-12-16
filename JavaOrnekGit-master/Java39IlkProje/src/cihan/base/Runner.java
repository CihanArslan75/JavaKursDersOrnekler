package cihan.base;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		int creditCardNumber = 1234_5676;
		long socialSecurityNumber = 999_99_9999L;
		int sayi=3/4;
		float sayi1=10/3f;
		double sayi2=10/3d;
		double sayi3=15.54444d;
		char a='a';
		String a1=null;
		float pi =  3.14_15f;

		System.out.println("creditCardNumber: " +creditCardNumber);
		System.out.println("socialSecurityNumber: "+socialSecurityNumber);
		System.out.println("sayi: "+sayi);
		System.out.println("sayi1: "+sayi1);
		System.out.println("sayi2: "+sayi2);
		System.out.println("sayi3: "+sayi3);
		System.out.println("pi: "+pi);
		System.out.println("a1: "+a1);
		System.out.println("a: "+a); 
		topla();
		System.out.println("a1: "+a1);
		
	}
	  
	public static void topla() {
		int a=20;
		int b=a; 
		a=5;
		int c= a+b;
		System.out.println("Toplam = " + c);
	}
}
