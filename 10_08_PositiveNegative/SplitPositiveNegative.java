import java.util.Scanner;
public class SplitPositiveNegative{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String positive = "";
		String negative = "";

		
		for(int i = 1; i<=10;i++){
			System.out.println("Enter a number ["+i+"]:");
			int entrada = scanner.nextInt();			
			if(entrada>=0){
				positive = positive + " "+entrada;
			}else{
				negative = negative + " "+entrada;
			}
		
		}
		
		System.out.println("Positive or zero:"+positive);
		System.out.println("Negative:"+negative);
		
		scanner.close();
	}
}