package services;

import java.security.InvalidParameterException;

public interface ServicoEmprestimo {
	public double getJuros();
	
	default double pagamento(double valor, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("O n�mero de meses n�o pode ser menor do que zero.");
		}
		return valor * Math.pow((1 + getJuros() / 100), meses);
	}
}
