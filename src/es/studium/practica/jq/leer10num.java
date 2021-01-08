package es.studium.practica.jq;

import java.util.Scanner;

public class leer10num
{

	private static Scanner teclado;

	public static void main(String[] args)
	{
		teclado = new Scanner(System.in);
		int i;
		final int COLUMNAS = 10;
		int tabla[] = new int[COLUMNAS];
		
		/* Pedimos los numeros por teclado y los guardamos en un array. */
		for(i=0;i<10;i++) {
			System.out.println("Dame un número para la posición [" + i + "]");
			tabla[i] = teclado.nextInt();
		}
		teclado.close();
		
		//Calculamos la media de la tabla
		media(COLUMNAS, tabla);
		
		//Mostramos el array comenzando desde atras
		for (i = 9; i >= 0; i--)
		{
			System.out.print(tabla[i] + " - ");
		}
	}

	public static void media(final int COL, int[] tabla)
	{
		int i;
		double media;
		int suma=0;
		for(i=0;i<COL;i++) {
			suma = suma + tabla[i];
		}
		media = (double) suma / (double) COL;
		System.out.println("La suma de todos los números es: " + suma);
		System.out.println("La media de los diez números ingresados es: " + media);
	}

}
