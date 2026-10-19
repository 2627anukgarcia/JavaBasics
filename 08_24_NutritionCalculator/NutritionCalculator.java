import java.util.Scanner;
public class NutritionCalculator{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.printf("Nutrition calculator:%n1. Calculate calories%n2. Calories per serving%n3. Daily calories%nChoose an option:%n");
	int choice = scanner.nextInt();
	
	switch (choice){
		case 1:
			System.out.println("Enter protein (g):");
			double protein = scanner.nextDouble();
		
			System.out.println("Enter carbohydrates (g):");
			double carbo = scanner.nextDouble();
			
			System.out.println("Enter fat (g):");
			double fat = scanner.nextDouble();
			
			System.out.printf("Total calories: %.2f kcal%n",(protein*4)+(carbo*4)+(fat*9));
			break;
		
		case 2:
			System.out.println("Enter calories per 100 g:");
			double calories = scanner.nextDouble();
			
			System.out.println("Enter serving size (g):");
			double serving = scanner.nextDouble();
			
			System.out.printf("Calories per serving: %.2f kcal%n",calories*(serving/100));
			break;
		
		default:
			System.out.println("Enter age (years):");
			int A = scanner.nextInt();
			
			System.out.println("Enter height (cm):");
			int H = scanner.nextInt();
			
			System.out.println("Enter weight (kg):");
			double W = scanner.nextDouble();
			scanner.nextLine();
			
			System.out.println("Enter sex (M/F):");
			String sex = scanner.nextLine();
			
			System.out.println("Enter activity factor (1.2 to 1.9):");
			double AF = scanner.nextDouble();
			
			switch (sex.toLowerCase()){
				case "f": 
					double totalWomen = (10*W + 6.25*H - 5*A - 161) * AF;
					System.out.printf("Daily calories: %.2f kcal%n", totalWomen);
					break;
				default:
					double totalMen = (10*W + 6.25*H - 5*A + 5) * AF;
					System.out.printf("Daily calories: %.2f kcal%n", totalMen);
				
				
				
			}
		
		
		
		
		
	}
	
	
	
	scanner.close();
	}
}