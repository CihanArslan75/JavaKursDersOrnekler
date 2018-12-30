package cihan.obj;

public class Arac {
	private  int tekerlekSayisi;
	private String surucuAdi;
	private boolean koltuk;
	
	public Arac() {
	
	}
	
	public Arac(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
	
	
	
	public void setSurucuAdi(String surucuAdi) {
		this.surucuAdi=surucuAdi;
	}
	
	public String getSurucuAdi(){
		return surucuAdi;
	}
	
	public void setTekerlekSayisi(int tekerlekSayisi) {
		this.tekerlekSayisi=tekerlekSayisi;
	}
	
	public int getTekerlekSayisi() {
		return this.tekerlekSayisi; // this yazsak ta olur yazmasakta olur.
	}
	
	public void setKoltuk(boolean koltuk) {
		this.koltuk=koltuk;
	}
	
	public boolean getKoltuk() {
		return koltuk;
	}
	
	public String toString() {
		return super.toString() ;
		
	}
	
}
