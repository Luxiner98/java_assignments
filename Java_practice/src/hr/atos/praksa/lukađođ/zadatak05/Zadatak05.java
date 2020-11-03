package hr.atos.praksa.lukaðoð.zadatak05;
import java.util.Scanner;

public class Zadatak05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    Scanner unos = new Scanner(System.in);
	    System.out.print("Pocetak intervala: ");
	    int pocetakIntervala = unos.nextInt();
	    
	    System.out.print("Kraj intervala: ");
	    int krajIntervala = unos.nextInt();
	    
	    int brojac=0;
	    
		if(pocetakIntervala>10 && krajIntervala<100 ){
			System.out.println("Pogreska! Pocetak intervala mora biti manji od 10. Kraj intervala mora biti veci od 100.");
		}else {
			for(int i=pocetakIntervala;i<=krajIntervala;i++){
				if(i<=15){
					brojac+=5;
					System.out.println(brojac);
				}
				if(i>15 && i<20){
					brojac--;
					System.out.println(brojac);
				}
				if(i%20==0){
					continue;
				}
				if(i==75){
					System.out.println("Vrijednost brojaca: "+brojac);
					break;
				}
			}
		}
		unos.close();
	}

}
