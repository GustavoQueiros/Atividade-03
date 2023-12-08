package atividade03;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner leia = new Scanner(System.in);

	        int numero;
	        int somaMultiplosDeTres = 0;
	        int contadorMultiplosDeTres = 0;

	        System.out.println("Digite números inteiros (insira 0 para encerrar):");

	        do {
	            System.out.print("Número: ");
	            numero = leia.nextInt();

	            if (numero != 0 && numero % 3 == 0) {
	                somaMultiplosDeTres += numero;
	                contadorMultiplosDeTres++;
	            }

	        } while (numero != 0);

	        
	        double media = 0.0;
	        if (contadorMultiplosDeTres > 0) {
	            media = (double) somaMultiplosDeTres / contadorMultiplosDeTres;
	        }

	        
	        System.out.println("\nResultados:");
	        System.out.println("Média dos múltiplos de 3: " + media);

	        
	        
	    }
	
		
	}


