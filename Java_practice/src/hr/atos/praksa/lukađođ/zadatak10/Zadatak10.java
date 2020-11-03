package hr.atos.praksa.lukaðoð.zadatak10;
import java.io.*;
import java.util.Scanner;

public class Zadatak10 {

    
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner unosPutanje = new Scanner(System.in);
		Scanner unosFraze = new Scanner(System.in);
		
		System.out.print("Unesite putanju: ");
		String putanja=unosPutanje.nextLine();
		
		System.out.print("Unesite frazu: ");
		String fraza=unosFraze.nextLine();
		
		
	    File direktorij = new File(putanja);
	    FilenameFilter filter = new FilenameFilter() {
	       public boolean accept (File dir, String name) { 
	          return name.endsWith(".txt");
	       } 
	    }; 
	    String[] privremena = direktorij.list(filter);
	    if (privremena == null) {
	    	System.out.println("Greska"); 
	    } else {
	    	System.out.println("Datoteke koje zavrsavaju s .txt: ");
	    	for (int i = 0; i< privremena.length; i++) {
	    		System.out.println(privremena[i]);
	    	}
	    }
	    System.out.println();
	    
	    for(int i=0;i<privremena.length;i++) {
	    	//System.out.println("Polje privremena["+i+"] = "+privremena[i]);
	        File myObj = new File(putanja+"\\"+privremena[i]);
	        Scanner myReader = new Scanner(myObj);
	        while (myReader.hasNextLine()) {
	        	String data = myReader.nextLine();
        		//System.out.println(data);
	        	if(data.contentEquals(fraza)) {
	        		System.out.println("Fraza se nalazi u datoteci: "+privremena[i]);
	        		System.out.println(data);
	        	}
	        }
	        myReader.close();
	    }
	    unosFraze.close();
	    unosPutanje.close();
	}

}
