package entities;

public class ProdutoImportado extends Produto{
	private Double taxa;
	
	public ProdutoImportado() {}

	public ProdutoImportado(String nome, double price, Double taxa) {
		super(nome, price);
		this.taxa = taxa;
	}

	private Double precoTotal() {
		return this.getPrice() + this.getTaxa();
	}
	
	@Override
	public String etiquetaDePreco() {
		return this.getNome() + " - R$" + String.format("%.2f", this.precoTotal()) + 
				" (Custo da taxa: R$" + String.format("%.2f", this.getTaxa()) + ")";
	}
	
	public Double getTaxa() {return taxa;}
	public void setTaxa(Double taxa) {this.taxa = taxa;}
}
