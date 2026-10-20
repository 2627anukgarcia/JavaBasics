import java.util.Scanner;
public class EscapeRoom{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of keys:");
		int keys = scanner.nextInt();
		
		scanner.nextLine();
		
		System.out.println("Final riddle solved? (true/false)");
		String solved = scanner.nextLine();
		
		String solution = (keys<3) ? "Not enough keys! Still trapped!" : (keys>=3 && solved.equalsIgnoreCase("false")) ? "Door unlocked! Still trapped!" : "Door unlocked! Escape successful!";
		
		System.out.printf("%s%n",solution);
		scanner.close();
	}
	
	
	
}