package hr.atos.praksa.lukaðoð.zadatak09;
import java.util.Scanner;


public class Zadatak09 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner unos = new Scanner(System.in);
		
		String [][] matrica=new String[8][13];
		int[] mjeseci=new int[13];
		
		int placa=0;
		int mjesec2=1;
		int privremena=5000;
		
		for(int i=1;i<mjeseci.length;i++) {
			System.out.print("Unesi placu za "+i+". mjesec: ");
			placa=unos.nextInt();
			mjeseci[i]=placa;
		}
		System.out.println();
		/*for(int i=1;i<mjeseci.length;i++) {
			System.out.print("mjeseci["+i+"] = "+mjeseci[i]+" ");
			System.out.println();
		}*/
		
		for(int i=0;i<matrica.length;i++) {
			for(int j=0;j<matrica[i].length;j++) {
				matrica[i][j]="";
				
				if(j==0 && i<=6 || j!=0 && i<=6 || i<=7) {
					//lijeva
					if(j==0 && i<6) {
						if(privremena!=0) {
							matrica[i][0]=Integer.toString(privremena);
							System.out.print(matrica[i][0]+"kn - |");
							privremena-=1000;
						}else if(privremena==0) {
							matrica[i][j]="0";
							System.out.printf("%4skn - |",matrica[i][j]);
							//System.out.println();
						}
					}
					//dodavanje X
					if(mjeseci[j]<5001 && mjeseci[j]>4500 ) {
						//placa=5000;
						matrica[0][j]="x";
						//5000 iliti 0
					}
					if(mjeseci[j]<4501 && mjeseci[j]>3500) {
						matrica[1][j]="x";
						//4000 iliti 1
					} 
					if(mjeseci[j]<3501 && mjeseci[j]>2500) {
						matrica[2][j]="x";
						//3000 iliti 2
					}
					if(mjeseci[j]<2501 && mjeseci[j]>1500) {
						matrica[3][j]="x";
						//2000 iliti 3
					}
					if(mjeseci[j]<1501 && mjeseci[j]>500) {
						matrica[4][j]="x";
						//1000 iliti 4
					}
					if(mjeseci[j]<501 && mjeseci[j]>0) {
						matrica[5][j]="x";
						//0    iliti 5
					}
					//sredina
					if(j!=0 && i<6) {
						System.out.printf("%2s ",matrica[i][j]);
						if(i<5 && j==12) {
							System.out.println();
							System.out.println("         |");
						}
					}
					//lijevo dolje
					if(j==0 && i==6) {
						matrica[i][j]="";
						System.out.printf("\n%10s",matrica[i][j]);
					}
					//dolje od sredine
					if(j!=0 && i==6 || i==7) {
						if(j!=0 && i==6) {
							matrica[i][j]="-- ";
							System.out.print(matrica[i][j]);
							if(j==12) {
								System.out.println();
								matrica[i][j]="";
								System.out.printf("%10s",matrica[i][j]);
							}
						}else if(j!=0 && i==7) {
							matrica[i][j]=Integer.toString(mjesec2);
							System.out.printf("%2s ",matrica[i][j]);
							mjesec2++;
						}
					}
				}
			}
		}
		/*System.out.println();
		
		for(int i=0;i<matrica.length;i++) {
			for(int j=0;j<matrica[i].length;j++) {
				if(j==0 && i>=7){	
					matrica[i][j]="66";
				}
				System.out.print(matrica[i][j]+" ");
			}
			System.out.println();
		}*/
		unos.close();
	}
}
