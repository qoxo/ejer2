package ejer1;
import java.util.Scanner; 
public class Ejer1 {
	
	public static void main (String[] a) { 

		// Pides el valor de N por teclado 

		System.out.print ("Teclea el numero N: "); 
//git
		// Scanner te permite extraer informacion de un archivo o cadena 
		// En este caso le decimos que queremos informacion de 
		// system.in (entrada del sistema, el teclado por ejemplo) 

		@SuppressWarnings("resource")
		Scanner Leer = new Scanner (System.in); 

		// Scanner saca el siguiente entero que se encuentre en la entrada 
		// en este caso será el valor que ingreses por el teclado 
		// y se almacena en N 
		// Ejemplo: Si ingresas "30" con el teclado, Scanner toma el 3 y 0 
		// desde system.in, forma el 30 (int) y lo guarda en N 

		int N = Leer.nextInt (); 

		// variables para el procesamiento 
		int i, j, suma; 

		// buscamos los números perfectos a partir del número 2 
		// es decir, vamos a probar si 2 es perfecto, luego si 3 es perfecto, 
		// luego si 4 es perfecto... hasta llegar a N que es el número 
		// que ingresaste por teclado 

		for (i=2; i<=N; i++) { 

		// suma es la variable que va a almacenar la suma de los 
		// divisores del numero que estamos comparando (1,2,...,N) 
		// empieza en 1 porque el 1 es divisor de cualquier número 

		suma = 1; 

		// ahora buscamos todos los divisores que tenga el número 
		// que estamos comparando (por ejemplo: para 6 se compara 2,3,4 y 5) 

		for (j=2; j<i; j++) 
		if (i%j == 0) // si el resto de la division es cero entonces es divisor (ej: 6/3=2 residuo=0) 
		suma = suma + j; // entonces se suma el divisor 

		// si la suma de los divisores del número que estamos verificando 
		// es igual al propio número, entonces este número es perfecto 
		// y se imprime en la pantalla 

		if (suma == i) 
		System.out.println ( i + " es un numero perfecto menor (o igual) que " + N); 
		} 
		} 
}
