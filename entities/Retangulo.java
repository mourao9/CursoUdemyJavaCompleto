package entities;

import entities.enums.Cor;

public class Retangulo extends Forma {

	private Double largura;
	private Double altura;

	public Retangulo() {}

	public Retangulo(Double width, Double height, Cor cor) {
		super(cor);
		this.largura = width;
		this.altura = height;
	}

	public Double getWidth() {
		return largura;
	}

	public void setWidth(Double width) {
		this.largura = width;
	}

	public Double getHeight() {
		return altura;
	}

	public void setHeight(Double height) {
		this.altura = height;
	}

	@Override
	public Double area() {
		return this.getWidth() * this.getHeight();
	}
	
	@Override
	public String toString() {
		return String.format("Área: %.2f", area());
	}
}
