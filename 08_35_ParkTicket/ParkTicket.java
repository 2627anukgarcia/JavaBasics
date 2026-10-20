import java.util.Scanner;
public class ParkTicket{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double price = 0;
	
		System.out.println("Enter your age:");
		int age = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Is it a weekday? (true/false)");
		String day = scanner.nextLine();
		
		double base = (age<12) ? (day.equalsIgnoreCase("true") ? price = 5 : (price = 9)) : (day.equalsIgnoreCase("true") ? price = 15 : (price = 22)); 
		
		System.out.printf("Ticket price: %.2f €%n",base);
		scanner.close();
	}
	
	
}