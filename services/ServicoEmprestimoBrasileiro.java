package services;

public class ServicoEmprestimoBrasileiro implements ServicoEmprestimo{
	
	private double juros;

	public ServicoEmprestimoBrasileiro(double juros) {
		this.juros = juros;
	}
	
	@Override
	public double getJuros() {
		return juros;
	}
	
}
