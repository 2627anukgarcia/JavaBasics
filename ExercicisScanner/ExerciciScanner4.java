import java.util.Scanner;
public class ExerciciScanner4{
	public static void main (String[] args){
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.println("Enter 5 cities separated by spaces: ");
	String city1 = scanner.next();
	String city2 = scanner.next();
	String city3 = scanner.next();
	String city4 = scanner.next();
	String city5 = scanner.next();
	
	System.out.printf("Cities: %n %s %n %s %n %s %n %s %n %s %n",city1,city2,city3,city4,city5);
	
	scanner.close();	
	}
	
}