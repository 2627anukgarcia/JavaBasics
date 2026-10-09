import java.util.Scanner;
public class GradeClassification{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the numeric grade (0-100):");
		byte numero = scanner.nextByte();
		
		if (numero>=0&&numero<=49){
			System.out.println("F = Fail");
		}else if (numero>=50&&numero<=59){
			System.out.println("D = Pass");
		}else if (numero>=60&&numero<=69){
			System.out.println("C = Satisfactory");
		}else if (numero>=70&&numero<=89){
			System.out.println("B = Good");
		}else if (numero>=90&&numero<=100){
			System.out.println("A = Excellent");
		}else{
			System.out.println("Invalid grade");
	}
		scanner.close();
	}
	
}