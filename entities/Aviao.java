package entities;

import java.util.HashSet;
import java.util.Set;

public class Aviao {
	private Set<String> assentosDisponiveis;
	
	public Aviao() {
		// TODO Auto-generated constructor stub
		this.assentosDisponiveis = new HashSet<>();
		this.assentosDisponiveis.add("1A");
		this.assentosDisponiveis.add("1B");
		this.assentosDisponiveis.add("2A");
		this.assentosDisponiveis.add("2B");
	}
	
	public boolean bookAssentos(String assento) {
		return this.assentosDisponiveis.remove(assento);
	}

}
