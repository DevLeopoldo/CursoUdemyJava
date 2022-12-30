package lambdas;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class Consumidor {

	public static void main(String[] args) {

		Consumer<Produto> imprimirNome = p -> System.out.println(p.nome + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.99);
		imprimirNome.accept(p1);

		Produto p2 = new Produto("NoteBook", 2987.00, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);

		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

		produtos.forEach(imprimirNome);
		produtos.forEach(p -> System.out.println(p.preco));
		produtos.forEach(System.out::println);
	}

}
