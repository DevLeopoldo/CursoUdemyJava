package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Set<String> listaAprovados = new HashSet<>();
		SortedSet<String> listaAprovados = new TreeSet<String>();
		listaAprovados.add("Ana");
		listaAprovados.add("Leopoldo");
		listaAprovados.add("Crislaine");
		listaAprovados.add("luca");
		listaAprovados.add("Pedro");

		for (String candidato : listaAprovados) {
			System.out.println(candidato);
		}

		Set<Integer> nums = new HashSet<>();

		nums.add(1);
		nums.add(2);
		nums.add(20);
		nums.add(500);
		nums.add(99);

		for (int n : nums) {
			System.out.println(n);
		}

	}
}
