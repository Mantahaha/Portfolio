package Portfolio;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class conversationChallenge {
	public static void main(String[] args) {
		
	Scanner entrance = new Scanner(System.in);
		
	String salary1 = JOptionPane.showInputDialog("Enter your first salary:");
	String salary2 = JOptionPane.showInputDialog("Enter your segund salary:");
	String salary3 = JOptionPane.showInputDialog("Enter your thirt salary:");
	
	System.out.println("total sum of wages \n" + " salary1\n" + salary1 + "\nsalary2\n" + salary2 + "\nsalary3\n" + salary3 );
	
	double number1 = Double.parseDouble(salary1);
	double number2 = Double.parseDouble(salary2);
	double number3 = Double.parseDouble(salary3);
	
	double total = number1 + number2 + number3;
	
	System.out.println("total sum of wages\n" + total);
	
	System.out.println("media is \n" + total/3);
	entrance.close();
	}
}
