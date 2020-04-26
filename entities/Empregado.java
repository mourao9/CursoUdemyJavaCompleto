package entities;

public class Empregado {
	private int id;
	private String nome;
	private Double salario;
	
	public Empregado(int id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void incrementar(double per) {
		setSalario(getSalario() * (1 + per/100));
	}

	@Override
	public String toString() {
		String s = String.format("%.2f", this.salario);
		return id + 
				", " + nome + 
				", " + s;
	}

	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public Double getSalario() {return salario;}
	public void setSalario(Double salario) {this.salario = salario;}
}
