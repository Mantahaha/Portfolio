package Portfolio;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		Scanner entrance = new Scanner(System.in);
		
		String text = "";
		
		do {
			System.out.println("Speking thing "  
		    + " or go way " 
			+ "to exit writen the works magic..." );
			
			text = entrance.nextLine();
			
		} while(!text.equalsIgnoreCase("exit"));
		System.out.println("Goodbye");
		
		entrance.close();
	}
	
}
