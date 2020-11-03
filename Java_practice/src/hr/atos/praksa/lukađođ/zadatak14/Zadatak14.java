package hr.atos.praksa.lukaðoð.zadatak14;

import java.util.Scanner;

public class Zadatak14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos= new Scanner(System.in);
		
		String[] oblici=new String []{"Krug","Kvadrat","Pravokutnik","Trokut"};
		for(int i=0;i<oblici.length;i++) {
			System.out.println((i+1)+". "+oblici[i]);
		}
		
		System.out.print("Odaberite jedan oblik: ");
		String oblik=unos.nextLine();
		
		switch(oblik) {
			case "Krug":
			case "1":{
				System.out.print("Unesi vrijednost radiusa: ");
				double vrijednost=unos.nextDouble();
				Krug rezultat=new Krug(vrijednost);
				rezultat.izracunajOpseg();
				rezultat.izracunajPovrsinu();
				rezultat.svojstva();
				break;
			}
			case "Kvadrat":
			case "2":{
				System.out.print("Unesi vrijednost stranice: ");
				double vrijednost=unos.nextDouble();
				Kvadrat rezultat=new Kvadrat(vrijednost);
				rezultat.izracunajOpseg();
				rezultat.izracunajPovrsinu();
				rezultat.izracunajDijagonalu();
				rezultat.svojstva();
				break;
			}
			case "Pravokutnik":
			case "3":{
				System.out.print("Unesi vrijednost prve stranice: ");
				double vrijednost1=unos.nextDouble();
				System.out.print("Unesi vrijednost druge stranice: ");
				double vrijednost2=unos.nextDouble();
				Pravokutnik rezultat=new Pravokutnik(vrijednost1,vrijednost2);
				rezultat.izracunajOpseg();
				rezultat.izracunajPovrsinu();
				rezultat.izracunajDijagonalu();
				rezultat.svojstva();
				break;
			}
			case "Trokut":
			case "4":{
				System.out.print("Unesi vrijednost prve stranice: ");
				double vrijednost1=unos.nextDouble();
				System.out.print("Unesi vrijednost druge stranice: ");
				double vrijednost2=unos.nextDouble();
				System.out.print("Unesi vrijednost trece stranice: ");
				double vrijednost3=unos.nextDouble();
				Trokut rezultat=new Trokut(vrijednost1,vrijednost2,vrijednost3);
				rezultat.izracunajOpseg();
				rezultat.izracunajPovrsinu();
				rezultat.svojstva();
				break;
			}
			default:
				System.out.println("Greska!");
				break;
		}
		
		
		
		unos.close();
	}

}
