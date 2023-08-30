package Portfolio.SystemSell2;

public class Item {

	final Produto produto;
	final int quantidade;
	
	Item(String nome, Produto produto, int quantidade){
		this.produto = produto;
		this.quantidade = quantidade;
	}
}
