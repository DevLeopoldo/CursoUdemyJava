

package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data d1 = new Data();
		d1.ano = 2021;
		
		var d2 = new Data(31, 12, 2020);
		var d3 = new Data();
		d3.dia = 05;
		d3.mes = 11;
		d3.ano = 1982;
		String dataFormatada1 = d1.obterDataFormatada();
		
		System.out.println(dataFormatada1);
		System.out.println(d2.obterDataFormatada());
		System.out.println(d3.obterDataFormatada());
		
		d1.imprimirDataFormatada();
		d2.imprimirDataFormatada();
		d3.imprimirDataFormatada();
	}

}
