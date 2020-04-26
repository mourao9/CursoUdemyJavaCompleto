package entities;

public class ContaEmpresa extends Conta {
	private Double limiteEmprestimo;

	public ContaEmpresa() {
		super();
	}

	public ContaEmpresa(String nConta, String titular, double depInicial, Double limiteEmprestimo) {
		super(nConta, titular, depInicial);
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}

	public void emprestimo(double montante) {
		if (montante <= limiteEmprestimo) {
			saldo += montante - 10.00;
		}
	}

	@Override
	public void saque(double valor) {
		super.saque(valor);
		this.saldo -= 2.0;
	}
	
	@Override
	public String toString() {
		return "Dados Empresarial: \n Conta: " + this.getnConta() + ", " + "Titular: " + 
				this.getTitular() + ", " + "Saldo: $"
				+ String.format("%.2f", this.getSaldo());
	}

}
