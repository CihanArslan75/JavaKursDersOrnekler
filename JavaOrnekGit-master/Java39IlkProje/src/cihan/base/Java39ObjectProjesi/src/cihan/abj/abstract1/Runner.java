package cihan.abj.abstract1;

public class Runner {

	public static void main(String[] args) {
		Cizim temp = new Ucgen();   //late baðlama cizim tipinde olduðu için derleyici runtime sýrasýnda override varmý diye bakýyor. Nesne oluþturmadan bilemiyor. 
		temp.ciz();  // ücgenin cizi çalýþýr. Cisim eriþilebilirlikle ilgili

	}

}
