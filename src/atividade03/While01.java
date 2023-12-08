package atividade03;

import java.util.Scanner;

public class While01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		  Scanner leia = new Scanner(System.in);

	        int idade;
	        int totalMenorQue21 = 0;
	        int totalMaiorQue50 = 0;

	        System.out.println("Digite as idades das pessoas (insira uma idade negativa para encerrar):");

	        while (true) {
	            System.out.print("Idade: ");
	            idade = leia.nextInt();

	            if (idade < 0) {
	                
	                break;
	            }

	            if (idade < 21) {
	                totalMenorQue21++;
	            } else if (idade > 50) {
	                totalMaiorQue50++;
	            }
	        }

	        
	        System.out.println("\nResultados:");
	        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenorQue21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaiorQue50);

	        
	      
	    }
	
		
	}


