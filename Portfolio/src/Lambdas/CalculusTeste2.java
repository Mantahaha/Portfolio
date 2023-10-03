package Lambdas;

public class CalculusTeste2 {
	
public static void main(String[] args) {
	
	Calculus calc =(x , y) -> {return x + y;};
	System.out.println(calc.calculus(2, 8));
	
	calc = (x , y) -> x * y;
	System.out.println(calc.calculus(2, 5));
	

}
	

}
