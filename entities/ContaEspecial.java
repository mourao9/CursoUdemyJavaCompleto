package entities;

import entities.exceptions.ContaExcecoes;

public class ContaEspecial extends Conta{
	private double limite;

	public ContaEspecial(String nConta, String titular, double saldo, double limite) {
		super(nConta, titular, saldo);
		this.limite = limite;
	}
	
	@Override
	public void saque(double valor) throws ContaExcecoes{
		if(valor >= getLimite())
			throw new ContaExcecoes("Valor superior ao limite disponível.");
		if(valor > getSaldo())
			throw new ContaExcecoes("Valor excede seu saldo.");
		super.saque(valor);
	}
	
	public double getLimite() {
		return limite;
	}
}
