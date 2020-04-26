package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import entities.enums.StatusPedidos;

public class Pedido {
	private Integer id;
	private Date momento;
	private StatusPedidos status;
	
	public Pedido() {
		// TODO Auto-generated constructor stub
	}

	public Pedido(Integer id, Date momento, StatusPedidos status) {
		super();
		this.id = id;
		this.momento = momento;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public StatusPedidos getStatus() {
		return status;
	}

	public void setStatus(StatusPedidos status) {
		this.status = status;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		return getId() + ", " + sdf.format(getMomento()) + ", " + getStatus();
	}
	
	
	
	
}
