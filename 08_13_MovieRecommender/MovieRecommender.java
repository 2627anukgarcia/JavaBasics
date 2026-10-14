import java.util.Scanner;
public class MovieRecommender{
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("Welcome to the Movie Recommender!");
	
	System.out.println("Do you like action movies? (yes/no):");
	String one = scanner.next();
	
	if (one.equalsIgnoreCase("yes")){
		System.out.println("Do you prefer superhero or spy movies? (superhero/spy/other):");
		String twoA = scanner.next();
		
	    if (twoA.equalsIgnoreCase("superhero")){
		System.out.println("You should watch 'Avengers: Endgame'.");
		System.out.println("Thanks for using the Movie Recommender!");
	
		}else if (twoA.equalsIgnoreCase("spy")){
			System.out.println("You should watch 'Mission: Impossible Fallout'.");
			System.out.println("Thanks for using the Movie Recommender!");
	
		}else{
				System.out.println("You should watch 'Mad Max: Fury Road'.");
				System.out.println("Thanks for using the Movie Recommender!");	
		}
		
	}else{
		System.out.println("Do you like comedies? (yes/no):");
		String twoB = scanner.next();
		
		 if (twoB.equalsIgnoreCase("yes")){
			System.out.println("Do you prefer smart humor or silly humor? (smart/silly/other):");
			String threeA = scanner.next(); 
			
			if (threeA.equalsIgnoreCase("smart")){
				System.out.println("You should watch 'The Grand Budapest Hotel'.");
				System.out.println("Thanks for using the Movie Recommender!");	
			}else if (threeA.equalsIgnoreCase("silly")){
				System.out.println("You should watch 'The Hangover'.");
				System.out.println("Thanks for using the Movie Recommender!");
			}else{ 
				System.out.println("You should watch 'The Mask'.");
				System.out.println("Thanks for using the Movie Recommender!");
			}				
		 }else{
			System.out.println("Do you like independent films? (yes/no):");
			String threeB = scanner.next();
			if (threeB.equalsIgnoreCase("yes")){
				System.out.println("Do you prefer drama or experimental style? (drama/experimental/other):");
				String fourA = scanner.next();
				if (fourA.equalsIgnoreCase("drama")){	
					System.out.println("You should watch 'Lady Bird'.");
					System.out.println("Thanks for using the Movie Recommender!");	
				}else if (fourA.equalsIgnoreCase("experimental")){
					System.out.println("You should watch 'Everything Is Illuminated'.");
					System.out.println("Thanks for using the Movie Recommender!");
			}else{ 
				System.out.println("You should watch 'Moonlight'.");
				System.out.println("Thanks for using the Movie Recommender!");
			}
			}
			
		 if(threeB.equalsIgnoreCase("no")){
			System.out.println("You should watch 'Home Alone'.");
			System.out.println("Thanks for using the Movie Recommender!");
		
		}
		
	}
	
	
		
	
	}
		scanner.close();
	}	
}