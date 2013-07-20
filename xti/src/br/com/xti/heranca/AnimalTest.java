package br.com.xti.heranca;

public class AnimalTest {
	
	/**
	 * @method seleção por Polimorfismo
	 */
	public static void fazerBarulho(Animal animal) {
		animal.fazerBarulho();
	}
	
	/**
	 * 
	 * @method seleção por bloco Condicional
	 */
	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au!");
		} else if (animal.equals("Galinha")) {
			System.out.println("Có, Có!");
		}
	}
	
	public static void main(String[] args) {
		
		// Animal generico = new Animal(0, null);
		Animal toto = new Cachorro();
		Animal merilu = new Galinha();
		
		fazerBarulho(toto);
		fazerBarulho(merilu);
/*
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
*/		
		
	}

}
