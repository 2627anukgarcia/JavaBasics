import java.util.Scanner;
public class SumUntilZero{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		int totalNum = 0;
		
		
		System.out.println("Enter number:");
		int number = scanner.nextInt();
		
		while (number!=0){
			totalNum = totalNum+number;
			
			System.out.println("Enter number:");
			number = scanner.nextInt();
	
			count++;
		
		}
		
		System.out.println("Sum: "+totalNum);
		System.out.println("Count: "+count);
		
		
		scanner.close();
	}
}