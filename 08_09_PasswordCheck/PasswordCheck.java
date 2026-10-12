import java.util.Scanner;
public class PasswordCheck{
	
	public static void main (String [] args){
	Scanner scanner = new Scanner(System.in);
		
		String password = "jupiter4321";
		
		System.out.println("Enter your password:");
		String InPassword = scanner.next();
		
		if (InPassword.equals(password)){
			System.out.println("Access granted. Welcome!");
		
			}else if (InPassword!=password){
			System.out.println("Incorrect password. Try again.");	
		
			System.out.println("Enter your password:");
			String InPassword2 = scanner.next();
		
			 if (InPassword2.equals(password)){
				System.out.println("Access granted. Welcome!");	
			
				}else if (InPassword2!=password){
					System.out.println("Incorrect password. Try again.");	
		
					System.out.println("Enter your password:");
					String InPassword3 = scanner.next();
		
					if (InPassword3.equals(password)){
						System.out.println("Access granted. Welcome!");	
					
					
						}else if (InPassword3!=password){
							System.out.println("Your account is locked. Please contact your administrator.");
						}
				
				}	
		
		}
		
		
	
		scanner.close();
	}
}