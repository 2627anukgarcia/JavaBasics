import java.util.Scanner;
public class ChangeSequence{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int first = 0;
		int second = 0;
		
		System.out.println("Enter the starting number:");
		first = scanner.nextInt();
		
		second = first;
		
		while(second<=first){
			System.out.println("Enter the ending number:");
			second = scanner.nextInt();
		}
	
		for(int count = first; count<=second; count++){
			if((count%2)==0){
				System.out.print((count*2)+" ");
			}else{
				System.out.print(count/2+" ");
			}
		}
		
		
		scanner.close();
	}
}