package Lambdas;

public class CalculusTeste {
	public static void main(String[] args) {
		
		Calculus plus = new Plus();
		System.out.println(plus.calculus(4, 5));
		
		
		Calculus mult = new Multiplication();
		System.out.println(mult.calculus(2, 6));
	
		
	}

}
