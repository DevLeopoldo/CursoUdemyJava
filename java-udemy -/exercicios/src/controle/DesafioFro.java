package controle;

public class DesafioFro {

	public static void main(String[] args) {
		
		
		String valor = "#";
		for(int i = 0; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar valor numerico pra controlar o laço!
		
		for(String v ="#"; !v.equals("#####"); v += "#") {
			System.out.println(v);
		}
	}

}
