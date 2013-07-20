package br.com.xti.heranca;

public class Galinha extends Animal implements AreaCalculavel {

	@Override
	public void fazerBarulho() {
		System.out.println("Có, Có!");
		
	}

	@Override
	public double calculaArea() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
