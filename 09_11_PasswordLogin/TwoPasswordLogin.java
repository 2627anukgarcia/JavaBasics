import java.util.Scanner;
public class TwoPasswordLogin{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int count = 1; 
		String input = " ";
		String Pswd = args[0];
		
		
		System.out.println("Enter the password:");
		
		do{
			input = scanner.nextLine();
			if(!input.equals(Pswd)){
			System.out.println("Incorrect, try again:");
			count++; 
			}
		}while (!input.equals(Pswd));
			
		System.out.println("Access granted!");
		System.out.println("Attempts: "+count);
		
		
		scanner.close();
	}
}
