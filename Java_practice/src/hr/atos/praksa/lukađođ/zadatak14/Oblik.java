package hr.atos.praksa.lukaðoð.zadatak14;

public class Oblik {
	String ime;
	double opseg, povrsina,dijagonala;
	public Oblik(){
		ime="";
		opseg=0;
		povrsina=0;
		dijagonala=0;
	}
	
	public void svojstva() {
		System.out.println("Ime: "+ime);
		System.out.println("Opseg: "+String.format("%.2f", opseg));
		System.out.println("Povrsina: "+String.format("%.2f", povrsina));
		if(dijagonala!=0) {
			System.out.println("Dijagonala: "+String.format("%.2f", dijagonala));
		}
	}
}
