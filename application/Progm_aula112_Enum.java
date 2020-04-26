package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.StatusPedidos;

public class Progm_aula112_Enum {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(123, new Date(), StatusPedidos.PROCESSANDO);
		
		System.out.println(pedido);
		
		StatusPedidos os1 = StatusPedidos.ENTREGUE;
		StatusPedidos os2 = StatusPedidos.valueOf("ENVIADO");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
