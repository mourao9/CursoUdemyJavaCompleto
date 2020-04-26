package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Progm_lista_aula93 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();		
		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
				
		System.out.println(list.size() + " elementos.");
		
		mostraLista(list);
		
		System.out.println("===============================");

		//charAt(0) é a primeira letra das Strings. 
		//No caso Maria: x(0) = M, x(1) = a, x(2) = r...
		list.removeIf(x->x.charAt(0) == 'M');
		
		mostraLista(list);
		
		System.out.println("===============================");
		System.out.println("Index Of Bob: " + list.indexOf("Bob"));
		System.out.println("Index Of Marco: " + list.indexOf("Marco"));
	
		System.out.println("===============================");
//		List<String> result = list.stream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
		List<String> result = list.parallelStream().filter(x->x.charAt(0) == 'A').collect(Collectors.toList());
		mostraLista(result);
		
		System.out.println("===============================");
		String name = list.parallelStream().filter(x->x.charAt(0) == 'j').findFirst().orElse(null);
		System.out.println(name);
	}
	public static void mostraLista(List<String> l) {
		for(String e: l) {
			System.out.println(e);
		}
	}
}
