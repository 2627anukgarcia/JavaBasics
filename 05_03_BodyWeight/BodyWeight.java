import java.util.Scanner;
public class BodyWeight{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);	
	
	final byte K_MEN = 4;
	final float K_WOMEN = 2.5f;
	
	System.out.println("Enter your height in cm:");
	double H = scanner.nextInt();
	
	System.out.println("Enter your age:");
	double age = scanner.nextByte();
	
	double perfectMen = (double) H - 100 - (H - 150) / 4 + (age -20) / K_MEN;
	System.out.println("Ideal Body Weight for Men = "+perfectMen+"kg");
	
	double perfectWomen = (double)H - 100 - (H - 150) / 4 + (age -20) / K_WOMEN;
	System.out.println("Ideal Body Weight for Women = " +perfectWomen+"kg");
	
	
	
	
		
	scanner.close();	
	}
	
}