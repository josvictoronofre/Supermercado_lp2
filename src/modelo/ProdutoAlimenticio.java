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
		double precoComLucro = precoBase * 1.2;
		
		if (diasValidade <= 5) {
			return precoComLucro * 0.7;
		} else {
			return precoComLucro;
		}
	}
	
}
