import java.util.Scanner;
public class SumToX{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
	
	int X = 0;
	int total = 0;	
	int digit = 0;
	
	while (X<=10){
		System.out.println("Enter number > 10:");
		X = scanner.nextInt();
	
		}while(digit<=X){
			total = total + digit;
			digit++;
			}
		System.out.println("Total = "+total);
			
	
		
		
		
	scanner.close();
	}
}