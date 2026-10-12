import java.util.Scanner;
public class PizzaCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the diameter of the first pizza (cm):");	
	int first = scanner.nextInt();
	
	System.out.println("Enter the diameter of the second pizza (cm):");	
	int second = scanner.nextInt();
	
	System.out.println("Enter the diameter of the third pizza (cm):");	
	int third = scanner.nextInt();
		
	if (first==second&&second==third){
		System.out.println("All pizzas have the same size.");
	
	}else if (first != second&&first != third && second != third){
		System.out.println("All pizzas have different sizes.");
	}else{
	System.out.println("Two pizzas have the same size.");
	}	
		scanner.close();
	}
	
}