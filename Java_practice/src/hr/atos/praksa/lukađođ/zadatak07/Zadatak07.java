package hr.atos.praksa.lukaðoð.zadatak07;
import java.util.Scanner;
	
public class Zadatak07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		System.out.print("Unesite prvi prirodni broj: ");
		int prviPrirodni=unos.nextInt();
		
		System.out.print("Unesite drugi prirodni broj: ");
		int drugiPrirodni=unos.nextInt();
		
		int brojac=0;
		
		for(int i=prviPrirodni;i<=drugiPrirodni;i++) {
			if(i%7==0) {
				brojac++;
			}
		}
		System.out.println("Ovoliko je brojeva djeljivo s sedam: "+brojac);
		
		unos.close();
	}

}