package hr.atos.praksa.lukaðoð.zadatak06;
import java.util.Scanner;

public class Zadatak06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Unesi ime: ");
		Scanner unos = new Scanner(System.in);
		String ime = unos.next();
		
		//prvi red crtica
		for(int dash=0;dash<31;dash++){
		    System.out.printf("-");
		}
		System.out.println();
		
		//drugi red crtica
		System.out.println(": : :  TABLICA  MNOZENJA  : : :");
		for(int dash=0;dash<31;dash++){
			System.out.printf("-");
		}
		System.out.println();
		
		
		System.out.print(" * |");
		for(int j=1;j<=9;j++){
			System.out.printf("%3d",j);
		}
		System.out.println();
		
		//treci red crtica
		for(int dash=0;dash<31;dash++){
			System.out.printf("-");
		}
		System.out.println();
		
		
		for(int i=1;i<=9;i++){
			System.out.printf("%2d |",i);
			for(int j=1;j<=9;j++){
				System.out.printf("%3d",i*j);
			}
			System.out.println();
		}
		
		//cetvrti red crtica
		for(int dash=0;dash<31;dash++){
			System.out.printf("-");
		}
		System.out.println();
		
		
		
		for(int k=0;k<8;k++){
			System.out.printf(":  ");
		}
		System.out.print(":by "+ime);
		System.out.println();
		
		//peti red crtica
		for(int dash=0;dash<31;dash++){
			System.out.printf("-");
		}
		System.out.println();
		unos.close();
	}

}
