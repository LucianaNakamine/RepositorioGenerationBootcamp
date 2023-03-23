package Atividades6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class collections_arraylist_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Escreva um programa Java para criar uma Collection ArrayList de Objetos da Classe Wrapper Integer, 
		inicializada com 10 valores inteiros.
		O programa deverá solicitar ao usuário, que ele digite via teclado 1 número inteiro e,
		caso ele seja encontrado no ArrayList,exiba na tela a posição deste número na Collection.
		Caso o número não seja encontrado, ele deverá exibir na tela a mensagem: O número NN não foi encontrado! */
		
		List<Integer> lista_de_numeros = new ArrayList<Integer>();
		Scanner leia = new Scanner(System.in);
		/* numero_digitado corresponde ao número pedido ao usuário, posicao é a variável que vai percorrer os índices
		 * da ArrayList lista_de_numeros. Cada elemento é representado pela variável lista_de_numeros
		 */
		lista_de_numeros.add(2); /* adicionando cada valor primeiro, sem pedir ao usuário novo valor*/
		lista_de_numeros.add(5);
		lista_de_numeros.add(1);
		lista_de_numeros.add(3);
		lista_de_numeros.add(4);
		lista_de_numeros.add(9);
		lista_de_numeros.add(7);
		lista_de_numeros.add(8);
		lista_de_numeros.add(10);
		lista_de_numeros.add(6);
		
		//Lendo um número
		System.out.println("\nDigite o número que você deseja encontrar: ");
		int numero_digitado = leia.nextInt();
		
		//Verificando o índice(posição)
		int posicao = lista_de_numeros.indexOf(numero_digitado);
		
		if(posicao!=-1) {
		System.out.println("\nO número " +numero_digitado+" está localizado na posição: "+posicao);
		}
		else {
			System.out.println("\nO número "+numero_digitado+" não foi encontrado!");
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
