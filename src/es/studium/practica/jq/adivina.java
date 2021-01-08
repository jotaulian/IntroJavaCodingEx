package es.studium.practica.jq;

import java.util.Scanner;

public class adivina
{

	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
//		Guardamos 5 cadenas en una tabla
		String cadenas[] = new String[5];
		cadenas[0] = "mi";
		cadenas[1] = "perra";
		cadenas[2] = "es";
		cadenas[3] = "muy";
		cadenas[4] = "pesada";
		
//		Creamos numero random del 0 al 5 que servira para elegir una de las cadenas al azar
		int nr = (int) (Math.random() * 5);
		String cadenaElegida = cadenas[nr];
		
//		Tomamos cadena por teclado
		System.out.println("Ingresar una cadena: ");
		String cadenaUser = teclado.nextLine();
		teclado.close();
		
//		Comparamos la cadena ingresada por teclado con la cadena elegida al azar
		if(cadenaElegida.equalsIgnoreCase(cadenaUser)) {
			System.out.println("La cadena ingresada es la misma que pensó el ordenador");
		} else {
			System.out.println("La cadena ingresada es diferente a la que pensó el ordenador");
		}
	}

}
