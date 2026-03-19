package modelo;

public abstract class Produto {
	protected String nome;
	protected int codigoBarras;
	protected double precoBase;
	protected Fornecedor fornecedor;
	
	public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.precoBase = precoBase;
		this.fornecedor = fornecedor;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigoBarras() {
		return codigoBarras;
	}

	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}

	public double getPrecoBase() {
		return precoBase;
	}

	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	public abstract double calcularPrecoFinal();
	
	
	public void exibirResumo() {
		System.out.println("Nome do produto: " + nome + ", preço base: " + precoBase);
	}
	
}
