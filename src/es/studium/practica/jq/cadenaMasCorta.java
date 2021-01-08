package es.studium.practica.jq;

import java.util.Scanner;

public class cadenaMasCorta
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String tabla[] = new String[5];
		for (int j = 0; j < tabla.length; j++)
		{
			System.out.println("Dame una cadena para la posici�n [" + j + "]");
			tabla[j] = teclado.nextLine();
		}
		teclado.close();
		
//		Calculamos la cadena m�s corta
		System.out.println(cadenaCorta(tabla));;
	}
	
//	Funci�n que calcula cadena mas corta
	private static String cadenaCorta(String[] tabla)
	{
		String larga = tabla[0];
		for (int i = 0; i < tabla.length; i++)
		{
			if(tabla[i].length() < larga.length()) {
				larga = tabla[i];
			}
		}
		return larga;
	}

}
