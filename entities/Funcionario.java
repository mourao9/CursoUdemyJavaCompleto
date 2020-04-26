package entities;

public class Funcionario {
	private String nome;
	private Integer horas;
	private Double volarPorHora;
	
	public Funcionario() {}
	
	public Funcionario(String nome, Integer horas, Double volarPorHora) {
		this.nome = nome;
		this.horas = horas;
		this.volarPorHora = volarPorHora;
	}

	public Double pagamento() {
		return this.getHoras() * this.getVolarPorHora();
	}
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getVolarPorHora() {
		return volarPorHora;
	}

	public void setVolarPorHora(Double volarPorHora) {
		this.volarPorHora = volarPorHora;
	}

	@Override
	public String toString() {
		return nome + " - R$" + String.format("%.2f", this.pagamento());
	}
}
