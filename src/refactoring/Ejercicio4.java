package refactoring;

import java.util.Scanner;
												   
public class Ejercicio4 {
	
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);

	System.out.println("Escribe una frase:");
	String frase = sc.nextLine();
	
	String Espacio = "";
	
	int numLetras = frase.length();
	
	for (int nUmErItO = numLetras - 1; nUmErItO >= 0; nUmErItO--) {
		
			Espacio = Espacio  + "" + frase.charAt(nUmErItO);
			
	}
	
	System.out.println(Espacio);
	
	sc.close();
	
  }
}