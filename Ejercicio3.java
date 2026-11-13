/*
 * Objetivo: Pedir a un alumno su edad y si es mayor de edad pedirle su nombre y apellidos
 * Autor: Samuel Hierro
 * Fecha: 09/10/2026
 */
package ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		//Declaramos las variables
		byte edad;
		String nombre,apellidos;
		//Le pedimos al usuario su edad por pantalla
		System.out.println("Dinos tu edad: ");
		edad = teclado.nextByte();
		//Aquí nos aseguramos que cumpla con la mayoría de edad y si la cumple le pediremos que nos escriba los datos restantes
		if (edad < 18) {
			System.out.println("No tiene la edad requerida para realizar estos estudios");
			
		}else {
			System.out.println(" ");
			nombre = teclado.nextLine();
			System.out.println("Dinos tu nombre: ");
			nombre = teclado.nextLine();
			System.out.println("Dinos tus apellidos: ");
			apellidos = teclado.nextLine();
			System.out.println("Nombre: " + nombre + "\nApellidos: " + apellidos + "\nEdad: " + edad + "\n\nUsted ha sido admitido");
		}
		
		
		

	}

}
