package es.studium.practica.jq;

import java.util.Scanner;

public class mitad
{

	public static void main(String[] args)
	{
		int numero;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingresar un n�mero: ");
		numero = teclado.nextInt();
		teclado.close();
		
		calcularMitad(numero);
		
	}

//	Funcion que calcula la mitad de un numero
	/**
	 * Esta funci�n divide un n�mero a la mitad
	 * @param numero Numero a dividir
	 */
	public static void calcularMitad(int numero)
	{
		double mitad;
		mitad = (double) numero / (double) 2;
		System.out.println(mitad);
	}

}
