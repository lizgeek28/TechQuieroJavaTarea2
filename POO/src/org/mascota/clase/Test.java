import java.util.Scanner;
package org.mascota.clase;

public class Test {
	
	public static void main(String[] args ) 
	{
		Mascota perro = new perro();
		Scanner scanner = new Scanner(System.in);//Creamos el objeto de la clase perro.
		
		System.out.println("¿Dame el nombre del perro?: ");
		perro.setNombre(scanner.next());
		
		System.out.println("¿Cual es su edad?: ");
		perro.setEdad(scanner.nextInt());
		
		System.out.println("¿Cual es la raza del perro?: ");
		perro.setRaza(scanner.next());
		
		System.out.println("¿Cual es su longitud?: ");
		perro.setLongitud(scanner.nextDouble());
		
		System.out.println("¿Cual es su género? (True para hembra): ");
		perro.setGenero(scanner.nextBoolean());
		
		if(perro.getGenero())
			System.out.println("Perra: " + perro.toString());
		else
			System.out.println("Perro: " + perro.toString());
	}
}
