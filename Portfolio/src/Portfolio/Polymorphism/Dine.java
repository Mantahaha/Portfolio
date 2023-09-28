package Portfolio.Polymorphism;

public class Dine {
 public static void main(String[] args) {
	
	 Person guest = new Person(99.65);
	 
	 Rice ingredient1 = new Rice(0.2);
	 Bean ingredient2 = new Bean(0.1);
	 
	 guest.eat(ingredient2);
	 guest.eat(ingredient1);
 
	 System.out.println(guest.getWeight());
	 
	 Icecream dessert = new Icecream(0.2);
	 
	 guest.eat(dessert);
	 
	 System.out.println(guest.getWeight());
 
 }
}
