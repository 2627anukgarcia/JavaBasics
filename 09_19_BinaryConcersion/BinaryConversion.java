import java.util.Scanner;
public class BinaryConversion{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		int quocient=1;
		int input = 0;
		int res = 0;
		String line = "";
		
		System.out.println("Enter a positive number:");
		input = scanner.nextInt();
		
		while(quocient!=0){
			
			
			res = input%2;
			quocient = input/2;
			line = res+line;
			input = quocient;
		
			
		}
		System.out.println("Binary: "+line);
		
		
		
		
		scanner.close();
	}
}