import java.util.Scanner;
	public class Podium{
		public static void main(String[] args){
			
		Scanner scanner = new Scanner(System.in);
	
		System.out.println("Enter the score of the first athlete:");
		int first = scanner.nextInt();
		
		System.out.println("Enter the score of the second athlete:");
		int second = scanner.nextInt();
		
		System.out.println("Enter the score of the third athlete:");
		int third = scanner.nextInt();
		
		System.out.println("Enter \"asc\" or \"desc\":");
		String orden = scanner.next().toLowerCase();
		
		
		int mayor = 0;
		if (first>=second && first>=third){
			mayor = first;
		}
		if (second>=first && second>=third){
			mayor=second;
		}
		if (third>=first && third>=second){
			mayor = third;
		}
		
		int menor = 0;
		if (first<=second && first<=third){
			menor = first;
		}
		if (second<=first && second<=third){
			menor = second;
		}
		if (third<=first&&third<=second){
			menor = third;
		}
	
		int medio = first+second+third-mayor-menor;
		
		if (orden.equals("asc")){
			System.out.println("Podium: "+menor+" "+medio+" "+mayor);
		}else if (orden.equals("desc")){
			System.out.println("Podium: "+mayor+" "+medio+" "+menor);
		}
	
	
		scanner.close();
		}
		
		
	}