import java.util.Scanner;
public class AreaRectangle{
	public static void main (String[] args){
		
 Scanner scanner = new Scanner(System.in);
 
 System.out.println("Enter side A:");
 double A = scanner.nextDouble();
 
 System.out.println("Enter side B:");
 double B = scanner.nextDouble();
 
 System.out.println("Enter units:");
 String units = scanner.next();
 
 double area = A*B ;
 
 System.out.println("Area = "+area+" "+units+"^2");
 
 scanner.close();
 
 
		
		
	}
	
}