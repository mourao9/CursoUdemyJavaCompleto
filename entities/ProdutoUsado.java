package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
	private Date dataDeFabricacao;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public ProdutoUsado() {}

	public ProdutoUsado(String nome, double price, String dataDeFabricacao) throws ParseException {
		super(nome, price);
		this.dataDeFabricacao = sdf.parse(dataDeFabricacao);
	}

	public Date getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(Date dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}
	
	@Override
	public String etiquetaDePreco(){
		return this.getNome() + " (usado) R$" + String.format("%.2f", this.getPrice()) + 
				" (Fabricado em: " + sdf.format(getDataDeFabricacao()) + ")";
	}
}
