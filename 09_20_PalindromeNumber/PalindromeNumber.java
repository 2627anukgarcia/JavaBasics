import java.util.Scanner;
public class PalindromeNumber{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int original = 0;
		int input = 0;
		int digit = 0; 
		int count = 0; 
		int number = 0;
		
		System.out.println("Enter a positive number:");
		input = scanner.nextInt();
		original = input;
		
		while (input != 0){
		
			digit = input%10;
			number = (number*10) + digit ;
			input = input/10;
			count++;
				
		}
		
		
			if (original==number&& count>=5 && count<=7){
				System.out.println("Valid code");
			}else{
				System.out.println("Invalid code");
			}
		
		
		
		
		
		
		
		scanner.close();
	}
}