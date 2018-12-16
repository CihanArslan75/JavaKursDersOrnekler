package cihan.base.dizi;

public class Diziler2 {

	public Diziler2() {
		diziTers();
	}

	private void diziTers() {

		int[] dizi1 = new int[10];
		int[] dizi2 = new int[10];
		int boyut = dizi1.length - 1;

		for (int i = 0; i < dizi1.length; i++) {
			dizi1[i] = i;
		}
		System.out.println("**************************************");
		for (int j = dizi2.length - 1; j >= 0; j--) {
			dizi2[j] = dizi1[(dizi1.length - 1) - j];
			System.out.println(j + " " + dizi2[j]);
		}
		System.out.println("**************************************");
		for (int i = 0; i < dizi2.length; i++) {
			dizi2[i] = dizi1[boyut];
			System.out.println(i + " " + dizi2[i]);
			boyut--;
		}
		
		

	}

}
