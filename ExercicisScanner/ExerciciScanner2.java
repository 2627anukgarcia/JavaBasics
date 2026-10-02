import java.util.Scanner;
public class ExerciciScanner2{
public static void main (String[] args){
Scanner scanner = new Scanner(System.in);
  System.out.println("Enter first temp: ");
  float temp1 = scanner.nextFloat();
  
  System.out.println("Enter second temp: ");
  float temp2 = scanner.nextFloat();
  
  System.out.println("Enter third temp: ");
  float temp3 = scanner.nextFloat();
  
  System.out.println("Enter fourth temp: ");
  float temp4 = scanner.nextFloat();
  
  System.out.println("Enter fifth temp: ");
  float temp5 = scanner.nextFloat();
  
  double maxtemp1 = Math.max(temp1,temp2);
  double maxtemp2 = Math.max(maxtemp1,temp3);
  double maxtemp3 = Math.max(maxtemp2,temp4);
  double maxtemp4 = Math.max(maxtemp3,temp5);
  double maxtemp0 = Math.round(maxtemp4*100)/100.0;
  System.out.println("Max: "+maxtemp0);
  
  
  double mintemp1 = Math.min(temp1,temp2);
  double mintemp2 = Math.min(maxtemp1,temp3);
  double mintemp3 = Math.min(maxtemp2,temp4);
  double mintemp4 = Math.min(maxtemp3,temp5);
  double mintemp0 = Math.round(mintemp4*100)/100.0;
 System.out.println("Min: "+mintemp0);
  

  scanner.close();	
  }	
	
}