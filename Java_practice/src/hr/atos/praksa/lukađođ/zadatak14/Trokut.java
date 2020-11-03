package hr.atos.praksa.lukaðoð.zadatak14;

public class Trokut extends Oblik{
	double prvaStranica, drugaStranica, trecaStranica;
	
	 public Trokut() {
		ime="Trokut";
		prvaStranica=0;
		drugaStranica=0;
		trecaStranica=0;
	}
	 
	 public Trokut(double prva_Stranica, double druga_Stranica, double treca_Stranica) {
		 ime="Trokut";
		 prvaStranica=prva_Stranica;
		 drugaStranica=druga_Stranica;
		 trecaStranica=treca_Stranica;
	 }
	
	
	public void izracunajPovrsinu() {
		povrsina=(prvaStranica*drugaStranica)/2;
	}
	
	public void izracunajOpseg() {
		opseg=prvaStranica+drugaStranica+trecaStranica;
	}
}
