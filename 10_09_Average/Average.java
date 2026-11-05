import java.util.Scanner;
public class Average{
	public static void main (String [] args){
		Scanner scanner = new Scanner(System.in);
		
		double input = 0;
		double total = 0;
		
		System.out.println("How many numbers do you want to enter?");
		int	times = scanner.nextInt();
		
		while(times<=0){
	
			System.out.println("Invalid amount. Please enter a positive number.");
			times = scanner.nextInt();	
		}
			
		for(int count = 1;count<=times;count++){
			System.out.println("Enter number "+count+":");
			input = scanner.nextDouble();
			total = total+input;
		}
		
		double Avg = total/times;
		
		System.out.printf("The average is: %.2f %n",Avg);
		
		
		scanner.close();
	}
}