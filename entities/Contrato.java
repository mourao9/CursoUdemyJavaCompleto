package entities;

import java.util.Date;

public class Contrato {
	private Date data;
	private double valorPorHora;
	private Integer horas;
	
	public Contrato() {
		// TODO Auto-generated constructor stub
	}

	public Contrato(Date data, double valorPorHora, Integer horas) {
		super();
		this.data = data;
		this.valorPorHora = valorPorHora;
		this.horas = horas;
	}

	public double valorTotal() {
		return getHoras() * getValorPorHora();
	}
	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getValorPorHora() {
		return valorPorHora;
	}

	public void setValorPorHora(double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}
	
}
