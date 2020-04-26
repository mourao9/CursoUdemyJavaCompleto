package entities;

public class Ocupante {
	private String nome;
	private String email;
	
	public Ocupante(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}

	@Override
	public String toString() {
		return "" + getNome() + 
			   ", " + getEmail();
	}	
	
	
	public String getNome() {return nome;}
	public void setNome(String nome) {this.nome = nome;}
	public String getEmail() {return email;}
	public void setEmail(String email) {this.email = email;}
}
