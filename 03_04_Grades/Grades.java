

public class Grades {
  public static void main(String[] args) {
	
	float grade1 = 7.7f;
	float grade2 = 6.4f;
	float grade3 = 7.2f;

	
	float highest1and2 = Math.max(grade1, grade2);
	float highestgrade = Math.max(highest1and2, grade3);
	
	int finalGrade = Math.round(highestgrade);
	
	System.out.println("Highest grade: "+highestgrade);
	System.out.println("Final grade: "+finalGrade);
	  
	  
  }
	
}
 