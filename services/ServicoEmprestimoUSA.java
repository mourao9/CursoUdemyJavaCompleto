package services;

public class ServicoEmprestimoUSA implements ServicoEmprestimo{
	private double juros;

	public ServicoEmprestimoUSA(double juros) {
		this.juros = juros;
	}
		
	@Override
	public double getJuros() {
		return juros;
	}

}
