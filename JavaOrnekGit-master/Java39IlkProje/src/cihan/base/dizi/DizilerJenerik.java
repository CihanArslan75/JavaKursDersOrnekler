package cihan.base.dizi;

public class DizilerJenerik {

	public DizilerJenerik() {
		 dizilerJenerik1() ;
		 dizilerJenerik2(); 
	
	}
	
	public void dizilerJenerik1() {
		String [][] isimler = new String[10][];
		isimler[0] = new String[5];
		isimler[1] = new String[10];
		isimler[0][3]="hüseyin";
		isimler[1][2]="";
		isimler[1][2]="durmuþ";
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);
		System.out.println(isimler[2][2]);
		System.out.println(isimler[2]);
	}
	
	
	public void dizilerJenerik2() {
		String [][][] isimler = new String[10][][];
		isimler[0] = new String[5][];
		System.out.println(isimler[0]);
		System.out.println(isimler[1]);
		System.out.println(isimler[2][2]);
		System.out.println(isimler[2]);
	}
	
	

}
