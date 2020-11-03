package hr.atos.praksa.lukaðoð.zadatak12;
import java.io.*;
import java.util.*;

public class Zadatak12 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub		
		
	    File direktorij = new File("C:\\Users\\Luka\\eclipse-workspace\\PripremaPrakse_LukaÐoð\\src\\hr\\atos\\praksa\\lukaðoð\\zadatak12\\OdaberiDatoteku");
	    FilenameFilter filter = new FilenameFilter() {
	       public boolean accept (File dir, String name) { 
	          return name.endsWith(".txt");
	       } 
	    }; 
	    String[] privremena = direktorij.list(filter);
	    if (privremena == null) {
	    	System.out.println("Greska"); 
	    } else {
	    	//System.out.println("Ponuðene datoteke: ");
	    	for (int i = 0; i< privremena.length; i++) {
	    		System.out.println((i+1)+". "+privremena[i]);
	    	}
	    }
	    System.out.println();
		
		
		Scanner datoteka = new Scanner(System.in);
		System.out.print("Odaberi broj datoteke: ");
		int broj=datoteka.nextInt();
		
		
		System.out.println("U datoteci "+privremena[broj-1]+" nalaze se sljedeæe rijeci: ");
		
		for(int i=0;i<24;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		System.out.println("Rijec (broj ponavljanja)");
		for(int i=0;i<24;i++) {
			System.out.print("-");
		}
		
		
		ArrayList<String> rijeci= new ArrayList<String>();
		ArrayList<Integer> brojac= new ArrayList<Integer>();
		
		FileInputStream bitnaDatoteka=new FileInputStream(direktorij+"\\"+privremena[broj-1]);
		Scanner zaDatoteku=new Scanner(bitnaDatoteka);
		while(zaDatoteku.hasNext()) {
			String sljedecaRijec = zaDatoteku.next().toLowerCase();
			if(rijeci.contains(sljedecaRijec)) {
				int index= rijeci.indexOf(sljedecaRijec);
				brojac.set(index, brojac.get(index)+1);
			}else {
				rijeci.add(sljedecaRijec);
				brojac.add(1);
			}
		}
		zaDatoteku.close();
		bitnaDatoteka.close();
		datoteka.close();
		
		Collections.sort(rijeci);
		
		System.out.println();
		for(int i=0;i<rijeci.size();i++) {
			System.out.println(rijeci.get(i)+" ("+brojac.get(i)+")");
		}
		
		
		for(int i=0;i<24;i++) {
			System.out.print("-");
		}
		
	}

}
