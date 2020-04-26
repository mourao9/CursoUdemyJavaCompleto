package entities;

import entities.enums.Cor;

public class Circulo extends Forma{
	
	private Double raio;
	
	public Circulo(Double raio, Cor cor) {
		super(cor);
		this.raio = raio;
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double area() {
		return Math.PI * Math.pow(this.raio, 2);
	}
	
	@Override
	public String toString() {
		return String.format("Área: %.2f", area());
	}
}
