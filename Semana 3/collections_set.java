package Atividades6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class collections_set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escreva um programa Java para criar uma Collection Set de Objetos da Classe Wrapper Integer,
		 *  inicializada com 10 valores inteiros. O programa deverá solicitar ao usuário, 
		 *  que ele digite via teclado 1 número inteiro e caso ele seja encontrado no Set,
		 *   exiba na tela a mensagem: Número 00 Encontrado! Caso o número não seja encontrado,
		 *    ele deverá exibir na tela a mensagem: O número NN não foi encontrado!
*/
			Scanner leia = new Scanner(System.in);
		
			Set<Integer> numeros = new HashSet<Integer>();
		
		/* Adicionando valores */
			numeros.add(2);
			numeros.add(5);
			numeros.add(1);
			numeros.add(3);
			numeros.add(4);
			numeros.add(9);
			numeros.add(7);
			numeros.add(8);
			numeros.add(10);
			numeros.add(6);
			
		/*Lendo o valor a ser encontrado*/
			System.out.println("\nDigite o número que você deseja encontrar: ");
			int n_digitado = leia.nextInt();
		
		/* Verificando se o número digitado está dentro do HashSet*/
			boolean verificador;
			
			verificador = numeros.contains(n_digitado);
			
			if(verificador==true) {
				System.out.printf("\nO número %d foi encontrado!", n_digitado);
			}
			else {
				System.out.printf("\nO número %d não foi encontrado!", n_digitado);
			}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
