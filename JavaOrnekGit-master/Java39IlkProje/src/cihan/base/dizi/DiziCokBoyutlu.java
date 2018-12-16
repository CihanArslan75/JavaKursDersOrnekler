package cihan.base.dizi;

public class DiziCokBoyutlu {



	public DiziCokBoyutlu() {
		
		//cokBoyutluDiziler();
		cokBoyutluDizilerFor();
	}
	
	public void cokBoyutluDiziler(){
		String[][] isimler = new String[6][9];
		isimler[0][0]="a";
		isimler[0][4]="b";
		isimler[0][2]="c";
		isimler[0][7]="d";
		isimler[1][0]="e";
		isimler[1][4]="f";
		isimler[1][7]="g";
		System.out.println(isimler[0][0]);
		System.out.println(isimler[0][4]);
		System.out.println(isimler[0][2]);
		System.out.println(isimler[0][7]);
		System.out.println(isimler[1][0]);
		System.out.println(isimler[1][4]);
		System.out.println(isimler[1][2]);
		System.out.println(isimler[1][7]);
		String[][] isimler1 = {{"a","b"},{"c","d"}};
	}
	
	public void cokBoyutluDizilerFor(){
		
		String[][] isimler = new String[6][10];
		
		for(int i=0 ;i<isimler.length;i++){
			for(int j =0;j<isimler[i].length;j++) {
				isimler[i][j]="a";
				System.out.print(isimler[i][j]+" ");
			}
			System.out.println("\n");
		}
	}

}
