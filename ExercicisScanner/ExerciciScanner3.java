import java.util.Scanner;
public class ExerciciScanner3{
	public static void main (String[] args){
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter street number: ");
	int StreetNum = scanner.nextInt();
	
	String s = scanner.nextLine();
	
	System.out.println("Enter street name: ");
	String StreetName = scanner.next();
	
	System.out.println("Enter city: ");
	String city = scanner.next();
	
	 System.out.println("Enter country: ");
	 String country = scanner.next();
	
	System.out.println("Enter postal code: ");
	String postalcode = scanner.next();
	
	System.out.printf("Your address is: %n %d %s %n %s %n %s %n %s %n",StreetNum,StreetName,city,postalcode,country);
		
		
	scanner.close();	
	}
	
}