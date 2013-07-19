package br.com.xti.poo;

public class Matematica {
	
	/** @return a raiz quadrada do númerosegunda equação de Pell	 */
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
	double soma(double um, double dois) {
		double s = um + dois;
		return s;
	}

}
