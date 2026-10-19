import java.util.Scanner;
public class FoodTruck{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		boolean esError = false;
		
		double priceComp=0;
		double priceFood=0;
		double priceDrink=0;
		
		
		System.out.println("Enter your choice (burger/tacos/pizza):");
		String choice = scanner.nextLine();
		
		switch (choice.toUpperCase()){
			case "BURGER" -> {
				priceFood=10.50;
				System.out.println("Fries size? (large/small):");
				String fries = scanner.nextLine();
				
				switch (fries.toUpperCase()){
					case "LARGE"-> priceComp = 4.50;
					
					case"SMALL"-> priceComp = 3.75;
					
					default-> esError = true;
				
				}
			}
			case "TACOS"->{
			
				priceFood=8.50;
				System.out.println("Sauce? (cheese/guacamole):");
				String sauce = scanner.nextLine();
			
				switch (sauce.toUpperCase()){
					case "CHEESE"-> priceComp = 2.50;
						
					case "GUACAMOLE"-> priceComp = 2.60;
					
					default-> esError = true;
					}
			}
			case "PIZZA"->{ 
				priceFood=12.50;
				System.out.println("Topping? (pepperoni/carbonara):");
				String topping = scanner.nextLine();
			
			switch(topping.toUpperCase()){
					case "PEPPERONI"-> priceComp = 3.50;
						
					case "CARBONARA" -> priceComp = 3.30;
						
					default-> esError = true;	
				}	
			}
		default-> esError = true; 
		
		}
		if(!esError){
		System.out.println("Choose your drink (soft/beer/water):");
		String drink = scanner.nextLine();
		
		switch (drink.toUpperCase()){
			case "SOFT"-> {
				priceDrink = 3.50;
			}
			case "BEER" -> {
				priceDrink = 5.50;
			}
			case "WATER" -> {
				priceDrink = 2.20;
			}
			default-> esError = true;	
		}
		}
		if (esError == true){		
			System.out.println("Invalid choice");
		
		}else{ System.out.printf("Total: %.2f €%n",priceFood+priceComp+priceDrink);
		}
		scanner.close();
	}
	
}