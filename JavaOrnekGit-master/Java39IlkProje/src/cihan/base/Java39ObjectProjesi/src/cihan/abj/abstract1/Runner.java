package cihan.abj.abstract1;

public class Runner {

	public static void main(String[] args) {
		Cizim temp = new Ucgen();   //late ba�lama cizim tipinde oldu�u i�in derleyici runtime s�ras�nda override varm� diye bak�yor. Nesne olu�turmadan bilemiyor. 
		temp.ciz();  // �cgenin cizi �al���r. Cisim eri�ilebilirlikle ilgili

	}

}
