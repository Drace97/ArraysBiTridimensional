package principal;

import java.util.Arrays;

public class ArraysNDimensionales {
	private final Integer filas = 8;
	private final Integer cols = 6;
	private Integer[][] numeros = new Integer[filas][cols];
	
	public void entrarDatosAlArray() {
		//MANUAL
		/*numeros[0][0]=1;
		numeros[0][1]=2;
		numeros[0][2]=3;
		numeros[0][3]=4;
		numeros[1][0]=5;
		numeros[1][1]=6;
		numeros[1][2]=7;
		numeros[1][3]=8;*/
		
		//de forma automática
		int cont=1;
		for(int i=0; i<filas; i++) {
			for(int j=0; j<cols; j++) {
				numeros[i][j]=cont;
				cont++;
			}
		}
	}
	
	public void mostrarValores() {
		for(int i=0; i<filas; i++) {
			for(int j=0; j<cols; j++) {
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void sumarIJ() {
		for(int i=0; i<filas; i++) {
			for(int j=0; j<cols; j++) {
				numeros[i][j]=i+j;
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void arrayMatriz() {	
		for(int i=0; i<filas; i++) {
			for(int j=0; j<cols; j++) {
				if(numeros[i]==numeros[j]) {
					numeros[i][j]=1;
				}else {
					numeros[i][j]=0;
				}
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void arrayMarco() {
		for(int i=0; i<filas; i++) {
			for(int j=0; j<cols; j++) {
				if(( i==0 ) || (j==0) || (i==filas-1) || (j==cols-1)) {
					numeros[i][j]=1;
				}else {
					numeros[i][j]=0;
				}
				System.out.print(numeros[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void arrayTridimensional() {
		int[][][] arreglo = new int[2][3][5];
		arreglo[0][0][0]=1;
		
		int[][][] arreglo1 = {
				{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}},
				{{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}}
			};
		
		for(int i=0; i<arreglo1.length;i++) {
			for(int j=0; j<arreglo1[i].length;j++) {
				for(int z=0; z<arreglo1[i][j].length;z++) {
					System.out.print("  "+arreglo1[i][j][z]);;
				}
				System.out.println();
			}
		}
	}
	
	public void buscarMin() {
		int minimo = Integer.MAX_VALUE;
		int[] array = {10,11,4,15,7,18,6};
		for(int i=0; i<array.length;i++){
			if(array[i]<minimo)	{
				minimo=array[i];
			}
		}
		System.out.println(minimo);
	}
	
	public void buscarMAX() {
		int maximo = Integer.MIN_VALUE;
		int[] array = {10,11,4,15,7,18,6};
		for(int i=0; i<array.length;i++){
			if(array[i]>maximo)	{
				maximo=array[i];
			}
		}
		System.out.println(maximo);
	}
	
	public void arrayCambio() {
		int[] array = {2,4,5,9,3,6};
		for(int i=0; i<array.length-1;i=i+2) {
			int cambio = array[i];
			int cambio2 = array[i+1];
			array[i] = cambio2;
			array[i+1] = cambio;
		}
		for(int i=0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
	}
	
	public void arrayInvertido() {
		int[] array = {2,4,5,9,3,6};
		for(int i=0; i<array.length-1;i=i+2) {
			int cambio = array[i];
			int cambio2 = array[i+1];
			array[i] = cambio;
			array[i+1] = cambio2;
		}
		for(int i=array.length-1; i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}
	
	public void busquedaBinaria() {
		int[] array = {2,4,5,9,3,6};
		Arrays.sort(array);
		int busqueda = Arrays.binarySearch(array, 6);
		System.out.println(busqueda);
	}
	
	public void ordenarPorInsercion() {
		int[] arrs = {3,2,1,0,4,5};
		int numOrdenar, j;
		for (int i=0; i<arrs.length -1;i++) {
			numOrdenar = arrs[i];
			j = i-1;
			while(j>=0 && arrs[j]>numOrdenar) {
				arrs[i] = arrs[j];
				arrs[j] = numOrdenar;
				j = -1;
				i = 0;
			}
		}
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
	}
	
	public void ordenarPorSeleccion() {
		int[] arrs = {3,2,1,0,4,5};
		int busqueda, aux;
		for(int i=0; i<arrs.length; i++) {
			busqueda = buscarMin(arrs, i);
			aux = arrs[i];
			arrs[i] = arrs[busqueda];
			arrs[busqueda] = aux;			
		}
		System.out.println();
		for(int i=0;i<arrs.length;i++) {
			System.out.print(arrs[i]+" ");
		}
	}
	
	public int buscarMin(int[] arrs, int i) {
	    int minIndex = i;
	    for (int j = i + 1; j < arrs.length; j++) {
	        if (arrs[j] < arrs[minIndex]) {
	            minIndex = j;
	        }
	    }
	    return minIndex;
	}
	
	public void factorial(int fact) {
		for(int i = fact - 1; i > 0;i--) {
			fact *= i;
		}
		System.out.println(fact);
	}
	
	public int factorialRecursiva(int fact) {
		if(fact == 0) {
			return 1;
		}
		else {
			return fact * factorialRecursiva(fact-1);
		}
	}
	
	public void fibonacci(int cantNum) {
		int num1 = 0, num2 = 1;
        for (int i = 1; i <= cantNum; i++) {
            System.out.print(num1 + " ");
            int siguiente = num1 + num2;
            num1 = num2;
            num2 = siguiente;
        }
    }
	
	public void fibonacciRecursiva(int num1, int num2, int tope) {
		int res=num1+num2;
		if(num1==0 && num2==1) {
			System.out.print(num1+" "+num2+" ");
		}
		if(res<tope) {
			System.out.print(res+" ");
			fibonacciRecursiva(num2,res,tope);
		}
	}
	
	/*public int fibonacciRecursiva(int num) {
		if(num==0) {
			return 0;
		}else if(num==1) {
			return 1;
		} else {
			num = fibonacciRecursiva(num-1)+fibonacciRecursiva(num-2);
			return num;
		}
	}*/
	
	public int busquedaBinariaNoRecursiva(int num) {
		int[] array = {0,1,2,3,4,5,6,7,8,9,10};
		int mitad = (array.length - 1) / 2;
		if(num <= array[mitad]) {
			for(int i = 0; i <= mitad; i++) {
				if(num==array[i]) {
					return i;
				}
			}
		} else {
			for(int i = mitad; i < array.length; i++) {
				if(num==array[i]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	public int busquedaBinariaRecursiva(int[] array, int num, int inicio, int fin) {
        if (inicio > fin) {
            return -1;  
        }

        int mitad = inicio + (fin - inicio) / 2;

        if (array[mitad] == num) {
            return mitad;  
        }

        if (num < array[mitad]) {
            return busquedaBinariaRecursiva(array, num, inicio, mitad - 1);  
        } else {
            return busquedaBinariaRecursiva(array, num, mitad + 1, fin);  
        }
    }
	
	 public void ordenarPorBurbuja() {
	        int[] arrs = {3, 2, 1, 0, 4, 5};
	        
	        for (int i = 0; i < arrs.length - 1; i++) {
	            for (int j = 0; j < arrs.length - 1; j++) {
	                if (arrs[j] > arrs[j + 1]) {
	                    int temp = arrs[j];
	                    arrs[j] = arrs[j + 1];
	                    arrs[j + 1] = temp;
	                }
	            }
	        }

	        for (int i = 0; i < arrs.length; i++) {
	            System.out.print(arrs[i] + " ");
	        }
	    }
}
