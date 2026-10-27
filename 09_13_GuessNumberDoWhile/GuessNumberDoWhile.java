import java.util.Scanner;
public class GuessNumberDoWhile{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int secret = 57;
		int count = 0;
		int input = 1;
		
		do{
			count++;
			System.out.println("Enter a number between 1 and 100:");
			input = scanner.nextInt();
			
			if(input<1){
				System.out.println("At least 1!");
				
			}else if(input>100){
				System.out.println("At most 100!");	
			}else if(input<secret){
				System.out.println("It's greater than "+input);
			}else if(input>secret){
				System.out.println("It's smaller than "+input);
			}
			
		}while(input!=secret);
		
		System.out.println("You guessed it!");
		System.out.println("Attempts: "+count);
		

		scanner.close();
	}
}