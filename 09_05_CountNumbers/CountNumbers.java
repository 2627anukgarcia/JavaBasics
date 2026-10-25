import java.util.Scanner;
public class CountNumbers{
	public static void main (String args[]){
		Scanner scanner = new Scanner(System.in);
		
		int countOne = 0;
		int countTwo = 0;
		int countThree = 0;
		int countFour = 0;
		int countFive = 0;
		int countSix = 0;
		int countSeven = 0;
		int countEight = 0;
		int countNine = 0;
		int countZero = 0;
		
		boolean isValid = false;
		
		System.out.println("Enter a number between 0 and 9. Enter -1 to finish:");
		
		while(!isValid){
		int input = scanner.nextInt();
			switch (input){
				case 0:
				countZero ++;
				break;
				case 1:
				countOne++;
				break;
				case 2:
				countTwo++;
				break;
				case 3:
				countThree++;
				break;
				case 4:
				countFour++;
				break;
				case 5 :
				countFive++;
				break;
				case 6:
				countSix++;
				break;
				case 7:
				countSeven++;
				break;
				case 8:
				countEight++;
				break;
				case 9:
				countNine++;
				break;
				case -1:
				isValid = true;
				break;
				default:
				System.out.println("Invalid number. Enter between 0 and 9. Enter -1 to finish.");
			}
			
		}
		
		System.out.printf("Total 0: %d%nTotal 1: %d%nTotal 2: %d%nTotal 3: %d%nTotal 4: %d%nTotal 5: %d%nTotal 6: %d%nTotal 7: %d%nTotal 8: %d%nTotal 9: %d%n",countZero, countOne,countTwo, countThree, countFour, countFive,countSix,countSeven,countEight,countNine);
		
		
	
		
		
		scanner.close();
	}
	
}