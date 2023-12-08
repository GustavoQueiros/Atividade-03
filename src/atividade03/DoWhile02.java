package atividade03;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner leia = new Scanner(System.in);

	        int numero;
	        int somaNumerosPositivos = 0;

	        System.out.println("Digite números inteiros (insira 0 para encerrar):");

	        do {
	            System.out.print("Número: ");
	            numero = leia.nextInt();

	            if (numero > 0) {
	                somaNumerosPositivos += numero;
	            }

	        } while (numero != 0);

	     
	        System.out.println("\nResultados:");
	        System.out.println("Soma dos números positivos: " + somaNumerosPositivos);

	        
	    }
	
		
	}


