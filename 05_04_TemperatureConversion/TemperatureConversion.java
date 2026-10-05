import java.util.Scanner;
public class TemperatureConversion{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
    System.out.println("Enter temperature in celsius:");
	double celsius = scanner.nextDouble();
	
	double far = celsius*9/5+32;
	
	System.out.printf("Fahrenheits = %.2f%n", far);
	
	
	scanner.close();	
	}
	
}
	
