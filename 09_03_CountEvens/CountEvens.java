import java.util.Scanner;
public class CountEvens{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
	int num = 0;
	int count = 0;
	String str ="";
	
	while (!(num==-1)){
		System.out.println("Enter number:");
		num = scanner.nextInt();
		if(num%2==0){
			count++;
		str += " "+ num;
		}
	}
			System.out.println("Even numbers: "+count);
			System.out.print("Numbers:"+str+" ");	
		
		
		
		
		scanner.close();
	}
	
}