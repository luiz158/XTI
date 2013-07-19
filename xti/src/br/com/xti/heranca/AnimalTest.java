package br.com.xti.heranca;

public class AnimalTest {
	
	public static void barulho(Animal animal) {
		animal.fazerBarulho();
	}

	public static void barulhoSemPolimorfismo(String animal) {
		if(animal.equals("Cachorro")) {
			System.out.println("Au, Au!");
		} else if (animal.equals("Galinha")) {
			System.out.println("Có, Có!");
		}
	}
	
	public static void main(String[] args) {
		
		Animal generico = new Animal(0, null);
		Animal toto = new Cachorro();
		Animal merilu = new Galinha();
/*		
		barulho(toto);
		barulho(merilu);
*/
		barulhoSemPolimorfismo("Cachorro");
		barulhoSemPolimorfismo("Galinha");
	}

}
