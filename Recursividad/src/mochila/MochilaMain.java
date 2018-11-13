package mochila;

public class MochilaMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Elemento[] elementos = {
				new Elemento(1,1),
				new Elemento(2,2),
				new Elemento(4,10),
				new Elemento(1,2),
				new Elemento(12,4)
		};
		
		Mochila m_base = new Mochila(15, elementos.length);
		Mochila m_otra = new Mochila(15, elementos.length);
		
		System.out.println(m_base.toString());
	}

}
