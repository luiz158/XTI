package br.com.xti.heranca;

public class Animal {
	
	@SuppressWarnings("unused")
	private int serial;
	double peso;
	String comida;
	
	void dormir() {System.out.println("Dormiu");}
	void fazerBarulho() {System.out.println("Fazer Barulho");}

	public Animal(double peso, String comida) {
		this.peso = peso;
		this.comida = comida;		
	}
}
