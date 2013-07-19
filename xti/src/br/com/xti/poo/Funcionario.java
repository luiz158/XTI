package br.com.xti.poo;

@SuppressWarnings("unused")
/* Teste dentro da Classe Funcionário */
public class Funcionario {
	
	private String nome;
	private boolean ativo;

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}	
	
	public static void main(String[] args) {
		
		Funcionario f = new Funcionario();
		f.nome = "Ricardo";
	}

}
