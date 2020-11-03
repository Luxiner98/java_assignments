package hr.atos.praksa.lukaðoð.zadatak08;
import java.util.Scanner;

public class Zadatak08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		char[] dan= {'P','U','S','È','P','S','N'};
		
		System.out.print("Unesite redni broj mjeseca: ");
		int mjesec=unos.nextInt();
		
		if(mjesec>12 || mjesec<=0) {
			System.out.println("Greska!");
		}else if(mjesec==2){
			for(int i=1;i<=7;i++) {
					System.out.printf("%3s", dan[i-1]);
			}
			System.out.println();
			for(int j=1;j<=29;j++) {
				System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(mjesec%2!=0 && mjesec<=7) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", dan[i-1]);
			}
			System.out.println();
			for(int j=1;j<=31;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(mjesec%2==0 && mjesec!=2 && mjesec<=7) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", dan[i-1]);
			}
			System.out.println();
			for(int j=1;j<=30;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(mjesec%2!=0 && mjesec>=8) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", dan[i-1]);
			}
			System.out.println();
			for(int j=1;j<=30;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}else if(mjesec%2==0 && mjesec!=2 && mjesec>=8) {
			for(int i=1;i<=7;i++) {
				System.out.printf("%3s", dan[i-1]);
			}
			System.out.println();
			for(int j=1;j<=31;j++) {
			System.out.printf("%3d",j);
				if(j%7==0) {
					System.out.println();
				}
			}
		}
		unos.close();
	}

}