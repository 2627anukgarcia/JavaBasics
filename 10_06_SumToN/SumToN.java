import java.util.Scanner;
public class SumToN{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		int sum = 0;
		
		while(input<=1){
		System.out.println("Enter a number (greater than 1):");
		input = scanner.nextInt();
		}
		
		for(int i = 0;i<=input;i++){
			sum = sum+i;
		}
		
		System.out.println("Sum = "+sum);
		
		
		
		
		scanner.close();
	}
}