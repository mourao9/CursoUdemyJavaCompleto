package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Postar {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
	private String titulo;
	private Date momento;
	private String conteudo;
	private int like;
	
	//associação
	private List<Comentario> comentarios = new ArrayList<Comentario>();
	
	public Postar() {}

	public Postar(String titulo, Date momento, String conteudo, int like) {
		this.titulo = titulo;
		this.momento = momento;
		this.conteudo = conteudo;
		this.like = like;
	}
	
	public boolean adicionarComentario(Comentario comentario) {
		if(this.comentarios.add(comentario)) {
			return true;
		}else {
			mensagem("Não foi possível enviar comentário.");
		}
		return false;
	}
	
	public boolean removeComentario(Comentario comentario) {
		if(this.comentarios.remove(comentario)) {
			return true;
		}else {
			mensagem("Não foi possível enviar comentário.");
		}
		return false;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}

	public String getConteudo() {
		return conteudo;
	}

	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLike() {
		return like;
	}

	public void setLike(int like) {
		this.like = like;
	}

	public void mensagem(String msg) {
		System.out.println(msg);
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder();	
		sb.append(getTitulo() + "\n");
		sb.append(getLike() + " Likes - ");
		sb.append(sdf.format(getMomento()) + "\n");
		sb.append(getConteudo());
		sb.append("\nComentários: \n");
		
		for (Comentario comentario : comentarios) {
			sb.append(comentario.getTexto() + "\n");
		}
		
		return sb.toString();
	}
	
}
