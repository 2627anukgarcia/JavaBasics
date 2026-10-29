import java.util.Scanner;
public class CodeDecoder{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		String code = "";
		int input = 0;
		int num = 0;
		
		while(input<=0){
			System.out.println("Enter secret code > 0:");
			input = scanner.nextInt();
		}
		
		while(input!=0){
			num = input%10;
			input /=10;
			switch (num){
				case 1 -> code = "I"+code;
				case 2 -> code = "Z"+code;
				case 3 -> code = "E"+code;
				case 4 -> code = "A"+code;
				case 5 -> code = "S"+code;
				case 6 -> code = "G"+code;
				case 7 -> code = "T"+code;
				case 8 -> code = "B"+code;
				case 9 -> code = "P"+code;
				case 0 -> code = "O"+code;
			}
			
		}
		
		System.out.println("Decoded message: "+code);
		
		scanner.close();
	}
}