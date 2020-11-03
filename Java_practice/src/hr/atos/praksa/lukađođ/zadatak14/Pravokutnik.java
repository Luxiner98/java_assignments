package hr.atos.praksa.lukaðoð.zadatak14;

public class Pravokutnik extends Oblik{
	double prvaStranica, drugaStranica;
	
	public Pravokutnik() {
		ime="Pravokutnik";
		prvaStranica=0;
		drugaStranica=0;
	}
	
	public Pravokutnik(double prva_Stranica, double druga_Stranica) {
		ime="Pravokutnik";
		prvaStranica=prva_Stranica;
		drugaStranica=druga_Stranica;
	}
	
	public void izracunajPovrsinu() {
		povrsina=prvaStranica*drugaStranica;
	}
	
	public void izracunajOpseg() {
		opseg=2*(prvaStranica+drugaStranica);
	}
	
	public void izracunajDijagonalu() {
		dijagonala=Math.sqrt((prvaStranica*prvaStranica)+(drugaStranica*drugaStranica));
	}
}
