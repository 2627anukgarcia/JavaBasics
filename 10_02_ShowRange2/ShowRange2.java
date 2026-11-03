import java.util.Scanner;
public class ShowRange2{
	public static void main (String[] args){
		Scanner scanner = new Scanner(System.in);
		
		int startNum = 0;
		int finalNum = 0;
		
		System.out.println("Enter the starting number:");
		startNum = scanner.nextInt();
		finalNum = startNum;
		
		while(startNum==finalNum){
			System.out.println("Enter the ending number:");
			finalNum = scanner.nextInt();
		}
		
		
		if(startNum>finalNum){
		
			for(int count=startNum; count>=finalNum;count--){
				System.out.print(count+" ");
			}
		}else{
			for(int count=startNum; count<=finalNum;count++){
				System.out.print(count+" ");
			}
		}
		
		
		
		
		scanner.close();
	}
}