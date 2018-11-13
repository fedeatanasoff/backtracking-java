package mochila;

public class Elemento {

	private int peso, beneficio;

	public Elemento(int peso, int beneficio) {
		super();
		this.peso = peso;
		this.beneficio = beneficio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public int getBeneficio() {
		return beneficio;
	}

	public void setBeneficio(int beneficio) {
		this.beneficio = beneficio;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) return true;
		if(obj == null) return false;
		if( getClass() != obj.getClass()) return false;
		
		final Elemento otro = (Elemento) obj;
		if(this.peso != otro.peso) return false;
		if(this.beneficio != otro.beneficio) return false;
		
		return true;
	}
	
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 23*hash + this.peso;
		hash = 23*hash + this.beneficio;
		return hash;
	}

	@Override
	public String toString() {
		return "Elemento [peso=" + peso + ", beneficio=" + beneficio + "]";
	}
	
	
	
}
