package oo.composicao.desafio;

public class ClienteTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.adicionarItem("Caneta", 1, 100);
		compra1.adicionarItem(new Produto("Notebook", 2000), 2);
		
		
		Compra compra2 = new Compra();
		compra2.adicionarItem("Caderno", 10, 10);
		compra2.adicionarItem(new Produto("Impressora", 1000), 1);
		
		Compra compra3 = new Compra();
		compra3.adicionarItem("TV", 2500, 2);
		compra3.adicionarItem(new Produto("DVD", 500), 1);
		
		Cliente cliente = new Cliente("Leopoldo dos Passos");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);
		cliente.adicionarCompra(compra3);
		
		System.out.println(cliente.obterValorTotal());
	}

}
