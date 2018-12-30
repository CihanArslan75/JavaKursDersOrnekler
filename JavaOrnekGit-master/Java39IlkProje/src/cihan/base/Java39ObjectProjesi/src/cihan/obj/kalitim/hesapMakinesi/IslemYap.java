package cihan.obj.kalitim.hesapMakinesi;

public class IslemYap implements Islem{
	
	private int sayi1;
	private int sayi2;
	private String operator;
	public  IslemYap(int sayi1, int sayi2,String operator) {
		this.sayi1=sayi1;
		this.sayi2=sayi2;
		this.operator=operator;
	}
			
		@Override
		public int islem() {
			int islemSonucu=0;
			if(operator.equals("+"))       islemSonucu=sayi1+sayi2;
			else if(operator.equals("-"))  islemSonucu=sayi1-sayi2;
			else if(operator.equals("*"))  islemSonucu=sayi1*sayi2;
			else if(operator.equals("/"))  islemSonucu=sayi1/sayi2;
			else islemSonucu=0;
			
			return islemSonucu;
	
		}

}
