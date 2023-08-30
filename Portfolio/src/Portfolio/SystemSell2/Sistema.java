package Portfolio.SystemSell2;

public class Sistema {
	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		
		compra1.adicionarItem("Notebook", 2000, 1);
		compra1.adicionarItem("PS5", 1000, 1);
		
	
		Compra compra2 = new Compra();
		
		compra2.adicionarItem("Ipod", 1, 200 );
		compra2.adicionarItem("Samsung Galaxy 22", 2500, 1);


		Cliente cliente1 = new Cliente("Renan");
		cliente1.compras.add(compra2);
		cliente1.compras.add(compra1);
		
		System.out.println(cliente1.obterValorTotal());
	}
	
}
