package br.com.xti.poo;

public class Galinha {
	
	public static int ovosDaGranja;	//Variável Global.
	public int ovos;	//Total de ovos do Objeto Galinha.
	
	public Galinha botar() {
		this.ovos++;
		Galinha.ovosDaGranja++;
		return this;
	}
	
	public static double mediaDeOvos(int galinhas) {
		return Galinha.ovosDaGranja / galinhas;
	}

}
