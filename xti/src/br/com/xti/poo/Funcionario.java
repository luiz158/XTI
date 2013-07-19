package br.com.xti.poo;

@SuppressWarnings("unused")
/* Teste dentro da Classe Funcionário */
public class Funcionario {
	
	private String nome;
	
	private String getNome() {
		return nome;
	}
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Ricardo";
	}

}
