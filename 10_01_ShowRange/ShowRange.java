import java.util.Scanner;
public class ShowRange{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
	
	int firstNum = 0;
	int secondNum = 0;
	
	System.out.println("Enter the starting number:");
		firstNum = scanner.nextInt();
		secondNum = firstNum;

	while(firstNum>=secondNum){
		System.out.println("Enter the ending number:");
		secondNum = scanner.nextInt();
	}
		
	for(int i = firstNum; i<=secondNum;i++){
		System.out.print(i+" ");
	}
		
		scanner.close();
	}
}
