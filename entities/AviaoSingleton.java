package entities;

import java.util.HashSet;
import java.util.Set;

public class AviaoSingleton {
	private static final AviaoSingleton INSTANCE = new AviaoSingleton();
	private Set<String> assentosDisponiveis;
	
	public static AviaoSingleton getINSTANCE() {
		return INSTANCE;
	}
	private AviaoSingleton() {
		this.assentosDisponiveis = new HashSet<>();
		this.assentosDisponiveis.add("1A");
		this.assentosDisponiveis.add("1B");
		this.assentosDisponiveis.add("2A");
		this.assentosDisponiveis.add("2B");
	}
	public boolean bookAssento(String assento) {
		return assentosDisponiveis.remove(assento);
	}
}
