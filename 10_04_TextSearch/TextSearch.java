import java.util.Scanner;
public class TextSearch{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int times = 0;
		int count = 0;
		int matches = 0;
		int exact = 0;
	
		
		while(count<=0){
			System.out.println("How many texts?");
			count = scanner.nextInt();
		}
		scanner.nextLine();
		
		System.out.println("Word to search for:");
		String word = scanner.nextLine();
		
		for(int i = 1; i<=count ;i++){
			
			System.out.println("Enter text "+i+":");
			String search = scanner.nextLine();
			
			if(search.equals(word)){
				exact++;
			}else if(search.equalsIgnoreCase(word)){
				matches++;
			}
		}
		
		System.out.println("Exact matches: "+exact);
		System.out.println("Matches ignoring case: "+matches);
		
		
		scanner.close();
	}
}