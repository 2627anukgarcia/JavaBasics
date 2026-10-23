import java.util.Scanner;
public class CountText{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
	int count = 1;
	int total = 0;
		
	System.out.println("Enter text to find:");
	String input = scanner.nextLine();

	while(count<=10){
		System.out.printf("Enter text (%d):%n",count);	
		count++;
		String search = scanner.nextLine();
		if(search.equalsIgnoreCase(input)){
			total++;
		}	
	}
		System.out.println("Count: "+total);
		scanner.close();
	}
	
	
}