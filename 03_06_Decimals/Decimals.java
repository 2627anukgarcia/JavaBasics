public class Decimals {
       public static void main (String [] args){
	
	double nombre = 12.3456789;
	
	int resultat0 = (int)Math.round(nombre);
	double resultat2 = Math.round(nombre * 100) / 100.0;
	double resultat4 = Math.round(nombre*10000) / 10000.0;
	double resultat6 = Math.round(nombre*1000000) / 1000000.0;
	
	System.out.println("Rounded to 0 decimals: "+resultat0);
	System.out.println("Rounded to 2 decimals: "+resultat2);
	System.out.println("Rounded to 4 decimals: "+resultat4);
	System.out.println("Rounded to 6 decimals: "+resultat6);
     
	 }
	   
  }