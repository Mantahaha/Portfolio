package Portfolio;

import javax.swing.JOptionPane;

public class ifElse {
	public static void main(String[] args) {
		
		String value = JOptionPane.showInputDialog("Inform the number: ");
		
		int number = Integer.parseInt(value);
		
		if(number % 2 == 0) {
			System.out.println("number is even");
		} else {
			System.out.println("number is odd");
		}
	
	}
}
