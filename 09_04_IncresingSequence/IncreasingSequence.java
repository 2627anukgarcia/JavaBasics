import java.util.Scanner;
public class IncreasingSequence{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	String str = "";
	int input = 0;
	int num = 0;
	boolean keep = true;
	
	while(keep){
	System.out.println("Enter number:");
	input = scanner.nextInt();
		if(input<=num){
		System.out.println("Sequence:"+str);
		keep = false;
		}else{
			str += " "+input;
			num = input;
		}
	}
		
		
	scanner.close();	
	}
}