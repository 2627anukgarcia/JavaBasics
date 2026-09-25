public class OperacionsMath {
	public static void main (String[] args) {
	
	double variable = 9.0 ; 
	double resultat = Math.pow(variable, 10);
	double resulta2 = Math.sqrt(121) ;
	 
	 System.out.println("resultat" + " " + "="+" " + resultat);
	 System.out.println("Resultat2 =" + resulta2) ; 
	 
	 long res1 = Math.round(5.5);
	 int res2 = (int)Math.round(5.1);
	 int res3 = (int)Math.round(4.9);
	 
	 System.out.println("(Math.round) nota final? 5.5 = "+ res1 + " " +" 5.1 = " +res2 +" " + " 4.9 = "+ res3);
	
	 int res1F = (int)Math.floor(5.5);
	 int res2F = (int)Math.floor(5.1);
	 int res3F = (int)Math.floor(4.9);
	 
	 System.out.println("(Math.floor) nota final? 5.5 = "+ res1F + " " +" 5.1 = " +res2F +" " + " 4.9 = " + res3F);
	
	 int res1C = (int)Math.ceil(5.5);
	 int res2C = (int)Math.ceil(5.1);
	 int res3C = (int)Math.ceil(4.9);
	 
	  System.out.println("(Math.ceil) nota final? 5.5 = "+ res1C + " " +" 5.1 = " +res2C +" " + " 4.9 = " + res3C);
	 
	System.out.println("Exemple Math.random : ");
	
	double aleatori = Math.random();
	System.out.println("aleatori = " + aleatori);
	}
}