import java.util.Scanner;
public class BiggestNumber{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
	int input = 0;
	int max = 0;
	int count = 0;
	
	boolean isValid = false;
		
	
	
	System.out.println("Enter positive numbers. Enter a negative number to finish:");
	
	
	
		while(!isValid){
			input = scanner.nextInt();
			
			if (input>max){
				max = input;	
			}



			if (input<0 && count==0){
				System.out.println("No positive numbers were entered");	
				isValid = true;
			} 
			
			if (input<0 && count>0){
				isValid = true;
				System.out.println("The biggest number is: "+max);
			}
			
			
			count++;
		}
	

		

	
	
	scanner.close();
	}
	
}