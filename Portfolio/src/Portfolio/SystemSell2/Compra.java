package Portfolio.SystemSell2;

import java.util.ArrayList;
import java.util.List;

public class Compra {
	
	String nome;
	double preco;
	
	List<Item> itens = new ArrayList<>();
	
	void adicionarItem(String nome, double preco, int qtd) {
		var produto = new Produto(preco, nome);
		this.itens.add(new Item(nome, produto,qtd));
		
	}
	
	double obterValorTotal() {
		double total = 0;
		
		for(Item item: itens ) {
			total += item.quantidade * item.produto.preco;
		}
		return total;
	}
}
