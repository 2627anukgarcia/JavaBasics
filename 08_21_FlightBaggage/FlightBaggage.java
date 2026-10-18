import java.util.Scanner;
public class FlightBaggage{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Enter fare type (Basic/Flex):");	
	String fare = scanner.nextLine();
	
	System.out.println("Enter baggage weight (kg):");
	double weight = scanner.nextDouble();
	
	System.out.println("Enter baggage length (cm):");
	int length = scanner.nextInt();
	
	System.out.println("Enter baggage width (cm):");
	int width = scanner.nextInt();
	
	System.out.println("Enter baggage height (cm):");
	int height = scanner.nextInt();

	int price = 0;
		
	if (fare.equalsIgnoreCase("basic")){
		
		if (weight>32){
			price = (32-20)*10+35;
		}else if (weight>20){
			price =(int)(weight-20)*10;
		}else{
			price = 0;
		}
		
		
	}else if (fare.equalsIgnoreCase("flex")){ 
		if (weight>32){
			price = (32-25)*10+35;
		}else if (weight>25){
			price =(int)(weight-25)*10;
		}else{
			price = 0;
		}
	}else{
		System.out.println("Invalid data");
	}
	
	if (fare.equalsIgnoreCase("basic") || fare.equalsIgnoreCase("flex")){
		int dimensions = length+width+height;
		double priceDimensions = 0;
		if (dimensions<=158){
			priceDimensions = 0;	
		}else{
			priceDimensions = 35;
		}
		
		System.out.printf("Extra baggage cost: %.2f €%n",price+priceDimensions);
	}
	
	scanner.close();
	}
}