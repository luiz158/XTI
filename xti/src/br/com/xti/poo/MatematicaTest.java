package br.com.xti.poo;

public class MatematicaTest {

	public static void main(String[] args) {

		Matematica m = new Matematica();
/*		
		int ma = m.maior(10, 20);
		System.out.println(ma);
		
		double so = m.soma(2, 3, 5, 6, 7, 123, 345, 69);
		System.out.println(so);

		double so = m.soma(m.maior(2, 4), m.maior(3, 5));
		System.out.println(so);

		int rz = m.raiz(27);
		System.out.println(rz);
		
		System.out.println(Math.sqrt(27));
*/
		System.out.println(m.media(5));
		System.out.println(m.media(5, 3));
		System.out.println(m.media(5, 3, 34, 56));
		System.out.println(m.media("50", "30"));
	}

}
