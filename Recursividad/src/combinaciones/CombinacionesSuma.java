package combinaciones;

import java.util.ArrayList;

public class CombinacionesSuma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		ArrayList<Integer> array = new ArrayList<Integer>();
		combiSuma(n, array, 0);
	}

	public static void combiSuma(int n, ArrayList<Integer> numeros, int suma) {
		
		if( suma == n) {
			System.out.println(numeros);
		}else {
			for( int i = 1; i <= n; i++) {
				suma += i;
				if(suma <= n) {
					numeros.add(i);
					combiSuma(n, numeros, suma);
					numeros.remove(numeros.indexOf(i));
				}
				suma -= i;
			}
		}
	}

}