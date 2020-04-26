package entities;

public class FuncionarioTercerizado extends Funcionario {

	Double despesaAdicional;

	public FuncionarioTercerizado() {
	}

	public FuncionarioTercerizado(String nome, Integer horas, Double volarPorHora, Double despesa) {
		super(nome, horas, volarPorHora);
		this.despesaAdicional = despesa;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + getDespesaAdicional() * 1.1;
	}

	public Double getDespesaAdicional() {
		return despesaAdicional;
	}
}
