package Ejercicios;

//Crear métodos iterativo y recursivo que devuelva la suma de los elemnteos de un array de enteros 
//Y que lanza excepciones si el array está vacio o el argumento es nulo

public class Ej2Recursividad {
	
	//iterativo
	
	public int sumaArrayIterativo(int[] array) throws Exception{
		int contador=0;
		if(array==null||array.length==0)
			throw new Exception();
		else {
			for(int i =0;i<array.length;i++) {
				contador+=array[i];
			}
		}
		return contador;
	}
	
	//recursivo
	
	//metodo fachada
	public int sumaArrayRecursivo(int[] array) throws Exception{
		if(array==null||array.length==0)
			throw new Exception();
		else {
			return sumaArrayRecursivo(array,0);
		}
	}
	
	//metodo recursivo
	public int sumaArrayRecursivo(int[] array, int indice) throws Exception{
		if(indice==array.length-1)
			return array[indice];
		return array[indice] + sumaArrayRecursivo(array, indice+1);
		}


	//metodo main para probar los métodos 
	public static void main(String[] args) throws Exception{
		Ej2Recursividad x = new Ej2Recursividad();
		int[] array = {15,18,25,39,41,57,63,71,105,324,750,1064};
		System.out.println("Resultado Iterativo: " + x.sumaArrayIterativo(array));
		System.out.println("Resultado Recursivo: " + x.sumaArrayRecursivo(array));
	}
}