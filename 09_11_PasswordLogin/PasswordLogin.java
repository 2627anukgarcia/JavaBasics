import java.util.Scanner;
public class PasswordLogin{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int count = 1; 
		String Pswd = "Qwert?9876";
		
		System.out.println("Enter the password:");
		String input = scanner.nextLine();
		
		
		while (!input.equals(Pswd)){
			count++;
			System.out.println("Incorrect, try again:");
			input = scanner.nextLine();
		}
		
		System.out.println("Access granted!");
		System.out.println("Attempts: "+count);
		
		
		
		
		
		
		
		
		scanner.close();
	}
}
