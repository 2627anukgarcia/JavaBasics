import java.util.Scanner;
public class SquareTable{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int input = 0;
		
		while(input<=2||input>=100){
			System.out.println("Enter maximum value (2-100):");
			input = scanner.nextInt();
		}
		
		for(int count = 1;count<=input;count++){
			if(count<input){
				System.out.printf("%d^2=%.0f, ",count,Math.pow(count, 2));
			}else{
			System.out.printf("%d^2=%.0f%n",count,Math.pow(count, 2));
			}
		}
		
		scanner.close();
	}
}