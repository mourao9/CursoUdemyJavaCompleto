package entities;

public class Empregado_02 implements Comparable<Empregado_02>{
	private String nome;
	private Double salario;
	
	public Empregado_02(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return nome + ", " + salario;
	}

	@Override
	public int compareTo(Empregado_02 e) {
		return getNome().compareTo(e.getNome());
	}
}
