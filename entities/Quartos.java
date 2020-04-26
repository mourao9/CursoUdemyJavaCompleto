package entities;

public class Quartos {
	private Ocupante ocupante;
	private int nquarto;
	
	public Quartos(Ocupante ocupante) {
		this.ocupante = ocupante;
	}

		
	public Ocupante getOcupante() {return ocupante;}
	public void setOcupante(Ocupante ocupante) {this.ocupante = ocupante;}
	public int getNquarto() {return nquarto;}
	public void setNquarto(int nquarto) {this.nquarto = nquarto;}
}
