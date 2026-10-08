import java.util.Scanner;
	public class HighestScore{
		public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);		
			
	System.out.println("Enter the score of the first player:");
	int punt1 = scanner.nextInt();
	
	System.out.println("Enter the score of the second player:");
	int punt2 = scanner.nextInt();
	
	System.out.println("Enter the score of the third player:");
	int punt3 = scanner.nextInt();
	
	System.out.println("Enter the score of the fourth player:");
	int punt4 = scanner.nextInt();
		int max = 0;
	
	
	if (punt1>punt2&&punt1>punt3&&punt1>punt4){
	  max = punt1;	
	 }else if (punt2>punt1&&punt2>punt3&&punt2>punt4){
		max = punt2;
		}else if (punt3>punt1&&punt3>punt2&&punt3>punt4){
		max = punt3;
		}else {
			max = punt4;
		}
		System.out.println("The highest score is: "+max);	
			
	
	scanner.close();		
		
		}
		
	}