package entities;

public class PessoaJuridica extends Pessoa{
	private int funcionarios;
	
	public PessoaJuridica() {}
		
	public PessoaJuridica(String nome, Double rendaAnual, int funcionarios) {
		super(nome, rendaAnual);
		this.funcionarios = funcionarios;
	}
	
	@Override
	public Double impostos() {
		if(funcionarios > 10)
			return this.getRendaAnual() * 0.14;
		else
			return this.getRendaAnual() * 0.16;
	}
	
	@Override
	public String toString() {
		return this.getNome() + ": R$" + String.format("%.2f", this.impostos());
	}

	public int getFuncionarios() {return funcionarios;}
	public void setFuncionarios(int funcionarios) {this.funcionarios = funcionarios;}
}
