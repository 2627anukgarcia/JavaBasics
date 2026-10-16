import java.util.Scanner;
public class CovidTest{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);	
		
	System.out.println("Tens febre? (sí/no):");
	String febre = scanner.nextLine();
	if (febre.equalsIgnoreCase("si")||febre.equalsIgnoreCase("sí")){
		System.out.println("També tens tos? (sí/no):");
		String tos = scanner.nextLine();
		if (tos.equalsIgnoreCase("si")||tos.equalsIgnoreCase("sí")){
			System.out.println("Et sents cansat o dèbil? (sí/no):");	
			String cansat = scanner.nextLine();
			if (cansat.equalsIgnoreCase("si")||cansat.equalsIgnoreCase("sí")){
				System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
			}else if (cansat.equalsIgnoreCase("no")){
				System.out.println("Tens dificultat per respirar? (sí/no):");
				String respirar = scanner.nextLine();
				if (respirar.equalsIgnoreCase("si")||respirar.equalsIgnoreCase("sí")){
					System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
				}else if (respirar.equalsIgnoreCase("no")){
					System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
				}	
			}
		}else if (tos.equalsIgnoreCase("no")){
			System.out.println("Tens mal de coll o mal de cap? (sí/no):");
			String coll = scanner.nextLine();
			if (coll.equalsIgnoreCase("si")||coll.equalsIgnoreCase("sí")){
				System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");
			}else if (coll.equalsIgnoreCase("no")){
				System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
			}
		}
		
	}else if (febre.equalsIgnoreCase("no")) {
		System.out.println("Has perdut l'olfacte o el gust? (sí/no):");
		String gust = scanner.nextLine();
		if (gust.equalsIgnoreCase("si")||gust.equalsIgnoreCase("sí")){
			System.out.println("Resultat: Possible COVID. Es recomana fer una prova diagnòstica i evitar el contacte amb altres persones.");	
		}else if (gust.equalsIgnoreCase("no")){
			System.out.println("Tens congestió nasal o mocs? (sí/no):");
			String nasal = scanner.nextLine();
			System.out.println("Resultat: Poc probable COVID. Si els símptomes empitjoren o apareixen de nous, consulta un professional sanitari.");
		}
		
	}
		
	scanner.close();
	}
}