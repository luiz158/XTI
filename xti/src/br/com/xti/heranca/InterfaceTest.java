package br.com.xti.heranca;

public class InterfaceTest {
	
	public static void area(AreaCalculavel obj) {
		System.out.println(obj.calculaArea());
	}
	
	public static void volume(VolumeCalculavel obj) {
		System.out.println(obj.calculaVolume());
	}

	public static void main(String[] args) {
		
		area(new Quadrado(2));
		volume(new Cubo(2));		

	}

}
