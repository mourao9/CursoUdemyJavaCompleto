package entities;

public final class ContaPoupanca extends Conta {

	private Double taxaJuros;

	public ContaPoupanca() {
		super();
	}

	public ContaPoupanca(String nConta, String titular, double saldo, Double taxaJuros) {
		super(nConta, titular, saldo);
		this.taxaJuros = taxaJuros;
	}
	
	@Override
	public final void saque(double valor) {
		this.saldo -= valor;
	}

	public Double getTaxaJuros() {
		return taxaJuros;
	}

	public void setTaxaJuros(Double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public void atualizarSaldo() {
		this.saldo += this.saldo * this.taxaJuros;
	}
	
	@Override
	public String toString() {
		return "Dados da Poupança: \n Conta: " + this.getnConta() + ", " + "Titular: " + this.getTitular() + ", " + "Saldo: $"
				+ String.format("%.2f", this.getSaldo());
	}

}
