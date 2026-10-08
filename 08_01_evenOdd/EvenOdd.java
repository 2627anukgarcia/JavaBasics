import java.util.Scanner;
public class EvenOdd{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter a number:");
	 int nombre = scanner.nextInt();
	 
	 if (nombre%2==0){
	 System.out.println("The number "+nombre+" is even");
		}else{
			System.out.println("The number "+nombre+" is odd");
	}
	
	scanner.close();
	}
}