import java.util.Scanner;
public class TriangleChecker{
	public static void main (String[] args){
	Scanner scanner = new Scanner(System.in);	
	
		System.out.println("Enter the length of the first side:");
        double a = scanner.nextDouble();
        System.out.println("Enter the length of the second side:");
        double b = scanner.nextDouble();
        System.out.println("Enter the length of the third side:");
        double c = scanner.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            if (a == b && b == c) {
                System.out.println("Type: Equilateral");
            } else if (a == b || a == c || b == c) {
                System.out.println("Type: Isosceles");
            } else {
                System.out.println("Type: Scalene");
            }
        } else {
            System.out.println("The sides cannot form a triangle");
        }
		
	
	
	
	scanner.close();
	}
}