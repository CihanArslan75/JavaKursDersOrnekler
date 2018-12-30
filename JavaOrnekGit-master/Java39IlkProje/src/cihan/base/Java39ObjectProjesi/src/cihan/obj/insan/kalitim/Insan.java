package cihan.obj.insan.kalitim;

public class Insan {
	public String adi;
	public String soyadi;
	public String tcKNO;
	private String gozRengi;
	protected String dna;
	
	@Override
	public String toString() {   //objectin toStringini ezdi. 
	
		return "Adi :" +adi +" Soyadi :"+soyadi +"Tc Kimlik No "+ tcKNO;
	}
	

}
