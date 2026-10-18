import java.util.Scanner;
public class Rodalies{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double price = 0;
		
		System.out.println("=== PREU BITLLET DE RODALIES ===");
		System.out.println("Zona d'origen:");
		int start = scanner.nextInt();
		System.out.println("Zona de destí:");
		int finish = scanner.nextInt();
		
		if (start<1 || start>6 || finish<1 || finish>6){
			System.out.println("Error: les zones han d'estar entre 1 i 6");
		}else{
			System.out.println("Tipus de transport:");
			System.out.println("1. Bitllet senzill");
			System.out.println("2. Anada i tornada");
			System.out.println("3. Bonotren de 10 viatges");
			System.out.println("4. Abonament mensual");
			System.out.println("Escull una opció:");
			int plan = scanner.nextInt();
			
			if (plan<1 || plan>4){
				System.out.println("Error: l'opció seleccionada no és vàlida");
			}else{
				int zonas = Math.abs(start-finish)+1;
				System.out.println("Zones del trajecte: "+zonas);
				
				if (zonas==1){
					if (plan==1){
						price = 2.90;
					}else if (plan==2){
						price = 5.80;
					}else if (plan==3){
						price = 11.70;
					}else{
						price = 22.50;
					}
				}else if (zonas==2){
					if (plan==1){
						price = 3.35;
					}else if (plan==2){
						price = 6.70;
					}else if (plan==3){
						price = 18.60;
					}else{
						price = 35.45;
					}
				}else if (zonas==3){
					if (plan==1){
						price = 4.55;
					}else if (plan==2){
						price = 9.10;
					}else if (plan==3){
						price = 27.60;
					}else{
						price = 52.50;
					}
				}else if (zonas==4){
					if (plan==1){
						price = 5.55;
					}else if (plan==2){
						price = 11.00;
					}else if (plan==3){
						price = 35.80;
					}else{
						price = 67.54;
					}
				}else if (zonas==5){
					if (plan==1){
						price = 6.60;
					}else if (plan==2){
						price = 13.20;
					}else if (plan==3){
						price = 43.45;
					}else{
						price = 79.90;
					}
				}else{
					if (plan==1){
						price = 8.25;
					}else if (plan==2){
						price = 16.50;
					}else if (plan==3){
						price = 54.40;
					}else{
						price = 83.25;
					}
				}
				
				System.out.printf("Preu: %.2f €%n", price);
			}
		}
		
		scanner.close();
	}
}