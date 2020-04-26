package entities;

public class PessoaFisica extends Pessoa{

	private Double gastoSaude;
	
	public PessoaFisica() {}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}


	@Override
	public Double impostos() {
		if(this.getRendaAnual() < 20000)
			return getRendaAnual() * 0.15 - getGastoSaude() * 0.5;
		else
			return getRendaAnual() * 0.25 - getGastoSaude() * 0.5;
	}

	@Override
	public String toString() {
		return this.getNome() + ": R$" + String.format("%.2f", this.impostos());
	}
	
	public Double getGastoSaude() {return gastoSaude;}
	public void setGastoSaude(Double gastoSaude) {this.gastoSaude = gastoSaude;}
	
}
