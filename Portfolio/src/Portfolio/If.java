package Portfolio;

import java.util.Scanner;

public class If {
		public static void main(String[] args) {
			
			Scanner entrance = new Scanner(System.in);
			System.err.print("Inform the media: ");
			
			double media = entrance.nextDouble();
			
			if(media <= 10 && media >= 7.5 ) {
				System.out.println("Approved!");
				System.out.println("congratulations!");
			}
			
			if(media <= 7 && media >= 4.5) {
				System.out.println("Recovery");
			}
			
			boolean disapproved = media <= 4.0 && media >= 0;
			
			if(disapproved) {
				System.out.println("Disapproved");
			}
		
			entrance.close();
			
		}
}
