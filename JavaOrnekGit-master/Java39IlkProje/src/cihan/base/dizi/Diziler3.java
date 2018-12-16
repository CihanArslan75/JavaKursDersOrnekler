package cihan.base.dizi;

public class Diziler3 {

	public Diziler3() {
		int[] dizi1 = {1,2,3,4,5,6,7,8,9,10};
		int temp;
		int count=dizi1.length-1;
		
		for(int i=0;i<dizi1.length/2;i++) {
			temp=dizi1[i];
			dizi1[i]=dizi1[count];
			dizi1[count]=temp;
			count--;
		 }

		for(int i=0;i<dizi1.length;i++) {
			System.out.println(dizi1[i]);
	 }
}
	
}
