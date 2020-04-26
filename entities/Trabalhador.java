package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.NivelTrabalhador;

public class Trabalhador {
	private String nome;
	private NivelTrabalhador nivel;
	private double salariBase;
	
	private Departamento dep;
	private List<Contrato> contratos = new ArrayList<>();;
	
	public Trabalhador() {}

	public Trabalhador(String nome, NivelTrabalhador nivel, double salariBase, Departamento dep) {
		this.nome = nome;
		this.nivel = nivel;
		this.salariBase = salariBase;
		this.dep = dep;
	}
	
	public Departamento getDep() {return dep;}

	public void setDep(Departamento dep) {this.dep = dep;}

	public void addContrato(Contrato novo) {this.contratos.add(novo);}
	
	public boolean removeContrato(Contrato c) {
		return this.contratos.remove(c);
	}
	
	public double renda(int y, int m) {
		double r = getSalariBase();
		Calendar cal = Calendar.getInstance();
		for (Contrato contrato : contratos) {
			cal.setTime(contrato.getData());
			int y_c = cal.get(Calendar.YEAR);
			int m_c = 1 + cal.get(Calendar.MONTH);
			if(y_c == y && m_c == m) {
				r += contrato.valorTotal();
			}
		}
		return r;
	}
	
	public List<Contrato> getContratos() {return contratos;}

	public String getNome() {return nome;}

	public void setNome(String nome) {this.nome = nome;}

	public NivelTrabalhador getNivel() {return nivel;}

	public void setNivel(NivelTrabalhador nivel) {this.nivel = nivel;}

	public double getSalariBase() {return salariBase;}

	public void setSalariBase(double salariBase) {this.salariBase = salariBase;}

	@Override
	public String toString() {
		return getNome() + ", " + getNivel() + ", R$ " + getSalariBase();
	}

}
