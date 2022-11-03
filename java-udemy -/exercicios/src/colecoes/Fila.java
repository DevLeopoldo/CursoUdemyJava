package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// offer e Add  -> adicionam elementos na fila
		// Diferença é o comportamento quando a fila esta cheia!
		fila.add("Ana"); // retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.offer("Carlos");
		fila.offer("Daniel");
		fila.offer("Rafaela");
		fila.offer("Gui");
		
		// Diferença é o comportamento ocorre 
		// quando a fila esta vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek());
		System.out.println(fila.element()); // Lança uma exceção
		System.out.println(fila.element());
	}

}
