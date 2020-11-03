package hr.atos.praksa.lukaðoð.zadatak14;

public class Krug extends Oblik {
	double radius;
	
	public Krug() {
		ime="Krug";
		radius=0;
	}
	
	public Krug(double _radius) {
		ime="Krug";
		radius=_radius;
	}
	
	public void izracunajPovrsinu() {
		povrsina=radius*radius*Math.PI;
	}
	
	public void izracunajOpseg() {
		opseg=2*radius*Math.PI;
	}
}
