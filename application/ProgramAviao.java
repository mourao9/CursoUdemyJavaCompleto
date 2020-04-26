package application;

import entities.Aviao;

public class ProgramAviao {

	public static void main(String[] args) {
		agendarAssento("1A");
		agendarAssento("1A");

	}
	public static void agendarAssento(String assento) {
		Aviao a = new Aviao();
		System.out.println(a.bookAssentos(assento));
	}
}
