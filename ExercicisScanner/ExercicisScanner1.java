import java.util.Scanner;
public class ExercicisScanner1 {
	public static void main (String[] args){
	
	Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first price: ");
		int price1 = scanner.nextInt();
		
		System.out.println("Enter second price: ");
		int price2 = scanner.nextInt();
		
		System.out.println("Enter third price: ");
		int price3 = scanner.nextInt();
		
		System.out.println("Enter fourth price: ");
		int price4 = scanner.nextInt();
		
		System.out.println("Enter fifth price: ");
		int price5 = scanner.nextInt();
		
		int totalprice = price1+price2+price3+price4+price5;
		System.out.println("Total price: "+totalprice);
		
		double average = totalprice/5.0;
		System.out.println("Average: "+average);
		
		scanner.close();
		
	}
	
}