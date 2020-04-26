package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import entities.Comentario;
import entities.Postar;

public class Exec_117 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		Date momento = sdf.parse("21/06/2018 13:05:44");
		
		Comentario c1 = new Comentario("Tenha uma boa viagem!");
		Comentario c2 = new Comentario("Uau, isso é incrível!");
		Postar p1 = new Postar(
				"Viajando para o litoral!!!", momento, 
				"Eu estou indo visitar o litoral.", 12);
		p1.adicionarComentario(c1);
		p1.adicionarComentario(c2);
		
	
		Postar p2 = new Postar(
				"Boa noite galera!", sdf.parse("28/07/2018 23:14:19"), 
				"Vejo vcs amanhã.", 5);
		Comentario c3 = new Comentario("Boa noite.");
		Comentario c4 = new Comentario("Que a força esteja com você.");
		
		p2.adicionarComentario(c3);
		p2.adicionarComentario(c4);
		
		System.out.println(p1);
		System.out.println(p2);
		
	}

}
