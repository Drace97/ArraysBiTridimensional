package principal;

public class Inicio {
	public static void main(String[] args) {
		ArraysNDimensionales arrs = new ArraysNDimensionales();
		//arrs.entrarDatosAlArray();
		//arrs.mostrarValores();
		//arrs.sumarIJ();
		//arrs.arrayMatriz();
		//arrs.arrayMarco();
		//arrs.arrayTridimensional();
		//arrs.buscarMin();
		//arrs.buscarMAX();
		//arrs.arrayCambio();
		//arrs.arrayInvertido();
		//arrs.busquedaBinaria();
		//arrs.ordenarPorInsercion();
		//arrs.ordenarPorSeleccion();
		//arrs.factorial(5);
		//int factorial = arrs.factorialRecursiva(4);
		//System.out.println(factorial);
		//arrs.fibonacci(10);
		//System.out.println();
		//arrs.fibonacciRecursiva(0,1,35);
		//int posicion = arrs.busquedaBinariaNoRecursiva(3);
		//System.out.println(posicion);
		int[] array = {1,2,3,4,5,6,7,8,9,10};
		int resultado = arrs.busquedaBinariaRecursiva(array, 4, 0, array.length - 1);  
        System.out.println("Índice encontrado: " + resultado);  
        arrs.ordenarPorBurbuja();
	}

}
