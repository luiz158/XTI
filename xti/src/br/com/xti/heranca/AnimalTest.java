package br.com.xti.heranca;

public class AnimalTest {

	public static void main(String[] args) {
		
		Cachorro toto = new Cachorro();
		toto.comida = "Carne";
		toto.dormir();
		
		Galinha merilu = new Galinha();
		merilu.comida = "Milho";
		merilu.dormir();
	}

}
