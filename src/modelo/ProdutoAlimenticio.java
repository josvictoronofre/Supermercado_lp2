package modelo;

public class ProdutoAlimenticio extends Produto {
	private int diasValidade;

	public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int diasValidade) {
		super(nome, codigoBarras, precoBase, fornecedor);
		this.diasValidade = diasValidade;
	}

	public int getDiasValidade() {
		return diasValidade;
	}

	public void setDiasValidade(int diasValidade) {
		this.diasValidade = diasValidade;
	}
	
	@Override
	public double calcularPrecoFinal() {
		if (diasValidade <= 5) {
			return (precoBase * 1.2) * 0.7;
		} else {
			return precoBase * 1.2;
		}
	}
	
}
