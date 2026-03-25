package main;

import modelo.Produto;
import modelo.ProdutoAlimenticio;
import modelo.ProdutoEletronico;
import modelo.Fornecedor;
import servico.CarrinhoDeCompras;

public class Main {

	public static void main(String[] args) {
		Fornecedor fazendaLocal = new Fornecedor("Fazenda Local", "0001" , "Brasil");
		Fornecedor techGlobal = new Fornecedor("Tech Global", "0002", "Estados Unidos");
		
		Produto banana = new ProdutoAlimenticio("Banana", 2341, 7, fazendaLocal, 6);
		Produto fone = new ProdutoEletronico("Fone de Ouvido", 3323, 150, techGlobal, 12);
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem(banana);
		carrinho.adicionarItem(fone);
		
		System.out.printf("Valor total: %.2f\n", carrinho.processarCompra());
	}

}
