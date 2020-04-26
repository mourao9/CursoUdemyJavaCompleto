package entities;

public class Departamento {
	private String nome;
	
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public Departamento(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "Departamento: " + getNome();
	}
	
	
}
