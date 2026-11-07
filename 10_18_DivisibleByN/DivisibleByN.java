import java.util.Scanner;
public class DivisibleByN{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int divisor = 0;
		int val = 0;
		
		while(divisor<=1){
			System.out.println("Enter the divisor (greater than 1):");
			divisor = scanner.nextInt();
		}
		
		while(val<=10){
			System.out.println("Enter maximum value (greater than 10):");
			val = scanner.nextInt();
		}
		
		for(int count = divisor; count<=val;count+=divisor){
			if(count==divisor){
				System.out.print(count);
			}else{
				System.out.print(", "+count);
			}
		}
		
		scanner.close();
	}
}