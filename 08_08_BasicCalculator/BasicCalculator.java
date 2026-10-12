import java.util.Scanner;
public class BasicCalculator{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
	System.out.println("Enter the first integer:");
	int first = scanner.nextInt();
	
	System.out.println("Enter an operator (+, -, *, /, %):");
	String operator = scanner.next();
	
	System.out.println("Enter the second integer:");
	int second = scanner.nextInt();
	
	String add = "+";
	String remains = "-";
	String mult = "*";
	String div = "/";
	String rest = "%";
	
	if ((operator.equals(div) || operator.equals(rest)) && second==0){
		System.out.println("Error: Division by zero is not allowed");
	
	}else if (operator.equals(add)){
	System.out.println(first+" + "+second+" = " + (first+second));
	
	}else if (operator.equals(remains)){
		System.out.println(first+" - "+second+" = "+(first-second));
	}else if (operator.equals(mult)){
		System.out.println(first+" * "+second+" = "+(first*second));
	}else if (operator.equals(div)){
		System.out.println(first+" / "+second+" = "+(first/second));
	}else if (operator.equals(rest)){
		System.out.println(first+" % "+second+" = "+(first%second));
	}else{
		System.out.println("Invalid operator!");
	}
	
	
		

		scanner.close();
	}
	
}