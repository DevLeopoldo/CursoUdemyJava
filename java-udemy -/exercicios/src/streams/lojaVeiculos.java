package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class lojaVeiculos {

	public static void main(String[] args) {

		Carro a1 = new Carro("Fusca", 5.000, false);
		Carro a2 = new Carro("Ferrari", 500.000, true);
		Carro a3 = new Carro("Uno", 23.000, false);
		Carro a4 = new Carro("BMW", 115.000, true);
		Carro a5 = new Carro("Golf", 85.000, true);

		List<Carro> carros = Arrays.asList(a1, a2, a3, a4, a5);
		
		Predicate<Carro> bomPreco = a -> a.valor <= 100.000;
		Predicate<Carro> carroNovo = a -> a.zeroKM;
		Function<Carro, String> comprouUmCarro =
				a -> "Voçê comprou " + a.nome + " Parabens ele é novo!";
				
		carros.stream()
				.filter(bomPreco)
				.filter(carroNovo)
				.map(comprouUmCarro)
				.forEach(System.out::println);
	}

}
