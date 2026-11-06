import java.util.Scanner;
public class ClosestTo21{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int total1 = 0;
		int total2 = 0;
		
		
		System.out.println("PLAYER 1");
		for(int count = 1; count <= 3; count++){
			System.out.println("Enter the value of card "+count+" (1-12):");
			int input = scanner.nextInt();
			
			
			while(input>12||input<=0){
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				input = scanner.nextInt();
			}
			
			if(input<=12 && input>=0){
				total1 = total1 + input;
			}
			
		}
		System.out.println("Total for Player 1: "+total1);
		if(total1>21){
			System.out.println("Player 1 went over 21 and is eliminated!");
		}	
		
		System.out.println("");
		
		System.out.println("PLAYER 2");
		for(int count = 1; count <= 3; count++){
			System.out.println("Enter the value of card "+count+" (1-12):");
			int input = scanner.nextInt();
		
			
			while(input>12||input<=0){
				System.out.println("Invalid card. Please enter a number between 1 and 12:");
				input = scanner.nextInt();
			}
			
			if(input>=0 && input<=12){
				total2 = total2 + input;
			}
		}
		
		System.out.println("Total for Player 2: "+total2);
		if(total2>21){
			System.out.println("Player 2 went over 21 and is eliminated!");
		}
		
		System.out.println("");
		System.out.println("FINAL RESULT");
		
		if (total1>21&&total2>21){
			System.out.println("Both players went over 21. No winner!");
		}else if(total1>21){
			System.out.println("Player 2 wins");
		}else if(total2>21){
			System.out.println("Player 1 wins");
		}else if(total1<total2){
			System.out.println("Player 2 wins with "+total2+" points!");
		}else if(total1>total2){
			System.out.println("Player 1 wins with "+total1+" points!");
		}else if (total1==total2){
			System.out.println("It's a draw! Both have "+total1+" points");
		}
		
		
		
		scanner.close();
	}
}