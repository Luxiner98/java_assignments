package hr.atos.praksa.lukaðoð.zadatak14;

public class Kvadrat extends Oblik {
	double stranica;
	
	public Kvadrat() {
		ime="Kvadrat";
		stranica=0;
	}
	
	public Kvadrat(double _stranica) {
		ime="Kvadrat";
		stranica=_stranica;
	}
	
	public void izracunajPovrsinu() {
		povrsina=stranica*stranica;
	}
	
	public void izracunajOpseg() {
		opseg=4*stranica;
	}
	
	public void izracunajDijagonalu() {
		dijagonala=stranica*Math.sqrt(2);
	}

}
