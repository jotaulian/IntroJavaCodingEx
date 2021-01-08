package es.studium.practica.jq;

//Realizar un programa que lea una fecha y calcule el número de días
//que quedan hasta fin de año.

import java.util.Scanner;

public class finalAnio
{
	public static void main(String[] args)
	{
		int[] normalYear = {31,28,31,30,31,30,31,31,30,31,30,31};
		int[] leapYear = {31,29,31,30,31,30,31,31,30,31,30,31};
		int day, month, year, totalDays = 0, diasRestantes;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor, ingresa un día(DD): ");
		day = teclado.nextInt();
		System.out.println("Por favor, ingresa un mes(MM): ");
		month = teclado.nextInt();
		System.out.println("Por favor, ingresa un año(AAAA): ");
		year = teclado.nextInt();
		
		if((year%4==0) && (year%100!=0) || (year%400==0)) {
			for (int i = 0; i < (month-1); i++)
			{
				totalDays += leapYear[i]; 
			}
			diasRestantes = 366 - (totalDays + day);
		} else {
			for (int i = 0; i < (month-1); i++)
			{
				totalDays += normalYear[i]; 
			}
			diasRestantes = 365 - (totalDays + day);
		}
		
		System.out.println("La fecha indicada es: " + day+ "/" + month+ "/" + year);
		System.out.println("Por ende, quedan " + diasRestantes + " días restantes.");
		teclado.close();
		
	}
}
