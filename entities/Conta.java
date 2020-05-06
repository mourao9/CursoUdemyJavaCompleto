package entities;

public class Conta {
	private String nConta;
	private String titular;
	protected double saldo;

	public Conta() {
	}

	public Conta(String nConta, String titular) {
		this.nConta = nConta;
		this.titular = titular;
		this.saldo = 0.0;
	}

	public Conta(String nConta, String titular, double saldo) {
		this.nConta = nConta;
		this.titular = titular;
		this.saldo = saldo;
	}

	public void deposito(double valor) {
		if (valor > 0.0)
			this.saldo += valor;
		else
			System.out.println("Valor inválido!");
	}

	public void saque(double valor) {
		this.saldo -= valor + 5.0;
	}

	@Override
	public String toString() {
		return "Dados da conta: \n Conta: " + this.nConta + ", " + "Titular: " + this.titular + ", " + "Saldo: $"
				+ String.format("%.2f", this.saldo);
	}

	// gets and setters
	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public String getnConta() {
		return nConta;
	}

	public double getSaldo() {
		return saldo;
	}

}
