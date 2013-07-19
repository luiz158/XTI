package br.com.xti.heranca;

public class Cachorro extends Animal {
	
	void fazerBarulho() {
		System.out.println("Au, Au");
	}
	
	public Cachorro() {
		super(30, "Carne");
	}
}
