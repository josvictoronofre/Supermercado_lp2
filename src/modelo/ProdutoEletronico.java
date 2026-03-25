package modelo;

public class ProdutoEletronico extends Produto {	
	private int mesesGarantia;

	public ProdutoEletronico(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
		super(nome, codigoBarras, precoBase, fornecedor);
		this.mesesGarantia = mesesGarantia;
	}
	
	public int getMesesGarantia() {
		return mesesGarantia;
	}

	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}

	@Override
	public double calcularPrecoFinal() {
		double precoSemGarantiaEstendida = precoBase * 1.5;
		
		if (mesesGarantia > 12) {
			return precoSemGarantiaEstendida * 1.15;
		} else {
			return precoSemGarantiaEstendida;
		}
	}

}
