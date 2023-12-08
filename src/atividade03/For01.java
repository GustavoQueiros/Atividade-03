package atividade03;

import java.util.Scanner;

public class For01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner (System.in);
		
        
        int n1, n2;
        
        System.out.println("Digite o primeiro número:");
        n1 =leia.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 =leia.nextInt();
        
        if (n1>=n2) {
        	System.out.println("Intervalo invalido");
        	
        	
        }else {
        	System.out.println("Números multiplos de " + n1 + " a " + n2 + "!");
        	
        for( int i = n1; i <= n2; i++) {
        if ( i % 3 == 0 && i % 5 == 0) {
        	System.out.println("Números multiplos de " + n1 + " a " + n2 + " : " + i);
        	
        	
        	
        }
        	
        }
        	
        }
        
		}
		
	}


