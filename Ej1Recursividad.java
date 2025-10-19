package Ejercicios;

//Debo programar primero de forma iterativa y después de forma recursiva métodos para contar cuantas veces
//aparece un entero en una lista de enteros dada y eliminar dichos enteros

public class Ej1Recursividad {
	//iterativo
	public int veces(int[] lista, int numero) {
		int veces=0;
		for(int i=0;i<lista.length;i++) {
			if(lista[i]==numero)
				veces++;
		}
		return veces;
	}
	
	//recursivo
	
	//método fachada
	public int veces(int[] lista, int numero, int indice) {
		if(indice==lista.length-1) {
			if(lista[indice]==numero)
				return 1;
			else
				return 0;
		}
		else {
			if(lista[indice]==numero)
				return 1+veces(lista,numero,indice+1);
			else
				return veces(lista,numero,indice+1);
		}
	}
}
