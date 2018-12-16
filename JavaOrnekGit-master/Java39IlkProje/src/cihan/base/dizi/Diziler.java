package cihan.base.dizi;

public class Diziler {

	public Diziler() {
		diziIslem();
	}
	
	private void diziIslem(){
		int[] dizi = new int[20];
		int[] dizi1 = {1,2,3,4,5};
		
		dizi[0]=4;
		for(int i=0 ;i<dizi.length;i++ ){
			dizi[i]=i+2;
		}

		for(int i=0 ; i<dizi.length;i++) {
			System.out.println(dizi[i]);
		}
		System.out.println("*****************************************");
		for(int i=dizi.length-1 ; i>=0;i--) {
			System.out.println(dizi[i]);
		}
	}
	

}
