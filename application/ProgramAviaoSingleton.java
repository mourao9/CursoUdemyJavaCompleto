package application;

import entities.AviaoSingleton;

public class ProgramAviaoSingleton {

	public static void main(String[] args) {
		agendarAssento("1A");
		agendarAssento("1A");

	}
	public static void agendarAssento(String assento) {
		AviaoSingleton a = AviaoSingleton.getINSTANCE();
		System.out.println(a.bookAssento(assento));
	}
}
