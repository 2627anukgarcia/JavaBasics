import java.util.Scanner;
public class CoffeeMachine{
	public static void main (String[] args){
	 
    Scanner scanner = new Scanner(System.in);
	
	System.out.println("Monthly electricity cost:");
	double elec = scanner.nextDouble();
	
	System.out.println("Monthly coffee machine rental cost:");
	double rent = scanner.nextDouble();
	
	System.out.println("Number of coffees:");
	double coffee = scanner.nextDouble();
	
	System.out.println("Average coffee price:");
	double price = scanner.nextDouble();
	
	System.out.println("Coffee price per kilo:");
	double kiloPrice = scanner.nextDouble();
	
	System.out.println("Kilograms of coffee:");
	double kiloCoffee = scanner.nextDouble();
	
	System.out.println("Milk price per litre:");
	double milkPrice = scanner.nextDouble();
	
	System.out.println("Liters of milk:");
	double literMilk = scanner.nextDouble();
	
	double despeses = elec+rent+kiloCoffee*price+milkPrice*literMilk;
	double ingresos = coffee*price;
	
	boolean inversio = ingresos>despeses;
	
	System.out.println("Should we buy the coffee machine? "+inversio);
		
	scanner.close();	
	
	}
	
}