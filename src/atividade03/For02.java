package atividade03;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner leia = new Scanner (System.in);
       
       int numerosPares = 0;
       int numerosImpares = 0;

       System.out.println("Digite 10 números :");

       for (int i = 0; i < 10; i++) {
           System.out.print("Número " + (i + 1) + ": ");
           int numero = leia.nextInt();

           if (numero % 2 == 0) {
               
               numerosPares++;
           } else {
               
               numerosImpares++;
           }
       }

       
       System.out.println("\nResultados:");
       System.out.println("Números pares: " + numerosPares);
       System.out.println("Números ímpares: " + numerosImpares);

       
       
   }

	

}


