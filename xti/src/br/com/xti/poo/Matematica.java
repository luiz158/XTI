package br.com.xti.poo;

public class Matematica {
	
	/** @return a raiz quadrada do número segunda equação de Pell	 */
	int raiz(int numero) {
		int count = 1;
		for (int i = 1; numero - i > 2; i+=2) {
			numero -= i;
			count++;
		}		
		return count;
	}
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois números
	 */
	int maior(int um, int dois) {
		if (um > dois) {
			return um;
		} else {
			return dois;
		}
	}
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return retorna soma de dois números
	 */
	double soma(double ... numeros) {
		double total = 0;
		for(double n : numeros)
			total+= n;
		return total;
	}

}
