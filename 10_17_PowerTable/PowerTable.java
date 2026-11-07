import java.util.Scanner;
public class PowerTable{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int base = 0;
		int exp = 0;
		
		while (base<2||base>100){
			System.out.println("Enter the base (2-100):");
			base = scanner.nextInt();
		}
		
		while (exp<2||exp>9){
			System.out.println("Enter maximum exponent (2-9):");
			exp = scanner.nextInt();
		}
		
		for(int count = 1; count<=exp;count++){
			if (count<exp){
				System.out.printf("%d^%d=%.0f, ",base,count,Math.pow(base,count));
			}else{
				System.out.printf("%d^%d=%.0f%n ",base,count,Math.pow(base,count));
			}
			
		}
		
		scanner.close();
	}
}