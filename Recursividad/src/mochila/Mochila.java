package mochila;

import java.util.Arrays;

public class Mochila {

	private int pesoMaximo;
	private Elemento[] elementos;
	
	private int peso, beneficio;
	
	public Mochila(int pesoMaximo, int numElementos) {
		this.pesoMaximo  = pesoMaximo;
		this.elementos = new Elemento[numElementos];
		this.beneficio = 0;
		this.peso = 0;
	}

	public int getPesoMaximo() {
		return pesoMaximo;
	}

	public void setPesoMaximo(int pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public Elemento[] getElementos() {
		return elementos;
	}

	public void setElementos(Elemento[] elementos) {
		this.elementos = elementos;
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
	
	public void addElemento(Elemento elem) {
		for(int i=0; i < this.elementos.length; i++) {
			if (this.elementos[i] == null) {
				this.elementos[i] = elem;
				this.beneficio += elem.getBeneficio();
				this.peso += elem.getPeso();
				break;
			}
		}
	}
	
	public void clear() {
		this.peso = 0;
		this.beneficio = 0;
		for(int i=0; i < this.elementos.length; i++) {
			this.elementos[i] = null;
		}
	}
	
	public void eliminarElemento( Elemento elem ) {
		for( int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i].equals(elem)) {
				this.elementos[i] = null;
				this.beneficio -= elem.getBeneficio();
				this.peso -= elem.getPeso();
				break;
			}
		}
	}
	
	public boolean existeElemento(Elemento elem) {
		for(int i=0; i<this.elementos.length; i++) {
			if(this.elementos[i] != null && this.elementos[i].equals(elem)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Mochila [pesoMaximo=" + pesoMaximo + ", elementos=" + Arrays.toString(elementos) + ", peso=" + peso
				+ ", beneficio=" + beneficio + "]";
	}
	
	
}
