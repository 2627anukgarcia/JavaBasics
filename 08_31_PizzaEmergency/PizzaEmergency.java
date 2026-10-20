import java.util.Scanner;
public class PizzaEmergency{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter pizza diameter:");
		int diameter = scanner.nextInt();
		
		String emergency = (diameter<30) ? "You might need another pizza!" : "Pizza for everyone!";		
		System.out.printf("%s%n",emergency);
		scanner.close();
	}
	
	
}