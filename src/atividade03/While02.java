package atividade03;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner leia = new Scanner(System.in);

	        int idade;
	        int genero;
	        int desenvolvedor;
	        int totalBackend = 0;
	        int totalFrontendMulheresCisTrans = 0;
	        int totalMobileHomensCisTransMaiores40 = 0;
	        int totalFullStackNaoBinariosMenores30 = 0;
	        int totalPessoas = 0;
	        int somaIdades = 0;

	        char continuar;

	        do {
	            System.out.print("Idade: ");
	            idade = leia.nextInt();

	            System.out.println("Identidade de Gênero:");
	            System.out.println("1 – Mulher Cis");
	            System.out.println("2 – Homem Cis");
	            System.out.println("3 – Não Binário");
	            System.out.println("4 – Mulher Trans");
	            System.out.println("5 – Homem Trans");
	            System.out.println("6 – Outros");
	            System.out.print("Escolha a opção correspondente: ");
	            genero = leia.nextInt();

	            System.out.println("Pessoa Desenvolvedora:");
	            System.out.println("1 – Backend");
	            System.out.println("2 – Frontend");
	            System.out.println("3 – Mobile");
	            System.out.println("4 – FullStack");
	            System.out.print("Escolha a opção correspondente: ");
	            desenvolvedor = leia.nextInt();

	            
	            if (desenvolvedor == 1) {
	                totalBackend++;
	            }

	            if (genero == 1 || genero == 4) { 
	                if (desenvolvedor == 2) { 
	                    totalFrontendMulheresCisTrans++;
	                }
	            }

	            if ((genero == 2 || genero == 5) && desenvolvedor == 3 && idade > 40) {
	                totalMobileHomensCisTransMaiores40++;
	            }

	            if (genero == 3 && desenvolvedor == 4 && idade < 30) {
	                totalFullStackNaoBinariosMenores30++;
	            }

	            
	            totalPessoas++;
	            somaIdades += idade;

	            System.out.print("Deseja continuar? (S/N): ");
	            continuar = leia.next().charAt(0);

	        } while (continuar == 'S' || continuar == 's');

	        
	        double mediaIdade = (double) somaIdades / totalPessoas;

	        
	        System.out.println("\nResultados:");
	        System.out.println("Número de pessoas desenvolvedoras Backend: " + totalBackend);
	        System.out.println("Número de Mulheres Cis e Trans desenvolvedoras Frontend: " + totalFrontendMulheresCisTrans);
	        System.out.println("Número de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + totalMobileHomensCisTransMaiores40);
	        System.out.println("Número de Não Binários desenvolvedores FullStack menores de 30 anos: " + totalFullStackNaoBinariosMenores30);
	        System.out.println("Número total de pessoas que responderam à pesquisa: " + totalPessoas);
	        System.out.println("Média de idade das pessoas que responderam à pesquisa: " + mediaIdade);

	        
	    }
	
		
	}


