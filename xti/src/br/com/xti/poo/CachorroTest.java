package br.com.xti.poo;

public class CachorroTest {

	public static void main(String[] args) {
		
		Cachorro pitbull = new Cachorro();
		pitbull.raca = "Pit Bull";
		pitbull.tamanho = 40;
		pitbull.latir();
		
		Cachorro viralata = new Cachorro();
		viralata.raca = "viralata";
		viralata.tamanho = 30;
		viralata.latir();

	}

}
