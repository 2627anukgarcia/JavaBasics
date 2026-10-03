import java.util.Scanner;
public class AreaCircle{
	public static void main(String[] args){
	 Scanner scanner = new Scanner(System.in);	
	 
	System.out.println("Enter radius:");
	double radius = scanner.nextDouble();
	
	System.out.println("Enter units:");
	String units = scanner.next();
	
	double area = Math.PI*Math.pow(radius,2.0);
	
	System.out.println("Area = "+area+" "+units+"^2");
	
	scanner.close(); 	
	}

}