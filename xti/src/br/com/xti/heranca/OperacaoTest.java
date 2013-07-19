package br.com.xti.heranca;

public class OperacaoTest {
	
	public static void calcula(OperacaoMatematica o, double x, double y) {
		System.out.println(o.calcular(x, y));
	}
	
/*	
	public static void calculaSemPolimorfismo(String o, double x, double y) {
		if(o.equals("Soma")) {
			System.out.println(x + y);
		} else if(o.equals("Multiplicação")) {
			System.out.println(x * y);
		}	
	}
*/
	
	public static void main(String[] args) {
		
		calcula(new Soma(), 5, 5);
		calcula(new Multiplicacao(), 5, 5);
		
	}

}
