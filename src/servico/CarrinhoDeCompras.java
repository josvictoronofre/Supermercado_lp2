package servico;
import java.util.ArrayList;

import modelo.Produto;

public class CarrinhoDeCompras {

	private ArrayList<Produto> carrinho = new ArrayList<>();
	
	public void adicionarItem(Produto produto) {
		carrinho.add(produto);
	}
	
	public double processarCompra() {
		double compra = 0;
		
		for (Produto produto : carrinho) {
			compra += produto.calcularPrecoFinal();
		}
		return compra;
	}
}
