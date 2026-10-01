public class PrintFormat {
	public static void main (String[] args) {
		
    String name = "Alice";
	byte age = 25;
	double height = 1.82678;
	double grade = 8.756;
	String subject = "Mathematics";
	
	double NotaMates = Math.round(grade*10)/10.0;
	
    System.out.printf("Name: %s%n",name);
    System.out.printf("Age: %d years old%n",age);
    System.out.printf("Height: %.2f meters%n", height);
    System.out.printf("Grade in %S: %.1f%n",subject, NotaMates);
		
		
	}
	
	
}