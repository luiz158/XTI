package br.com.xti.heranca;

public abstract class Animal {
	
	double peso;
	String comida;
	
	void dormir() {
		System.out.println("Dormiu");
	}
	
	abstract void fazerBarulho();

}
