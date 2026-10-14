import java.util.Scanner;
public class exemple{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Introdueix la nota:");
	double grade = scanner.nextDouble();
	
	if (grade <= 5){
	System.out.println("necessita millorar.");
	}else{
		System.out.println("Estem molt contents.");
	}
scanner.close();
	}
	
}