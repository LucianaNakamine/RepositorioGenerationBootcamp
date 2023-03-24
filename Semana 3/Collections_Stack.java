package Atividades7;

import java.util.Scanner;
import java.util.Stack;

public class Collections_Stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha_de_livros = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int opcao = -1;
		
		while (opcao!=0) {
			System.out.println("**********************************************************************");
			System.out.println("**********************************************************************");
			System.out.println("***                                                                ***");
			System.out.println("***                1 - Adicionar Livro na Pilha                    ***");
			System.out.println("***                2 - Listar todos os Livros                      ***");
			System.out.println("***                3 - Retirar Livro da Pilha                      ***");
			System.out.println("***                0 - Sair                                        ***");
			System.out.println("***                                                                ***");
			System.out.println("**********************************************************************");
			System.out.println("**********************************************************************");
			System.out.println("\nEntre com a opção desejada:*****************************************");
			System.out.println("                                                                      ");
			System.out.println("**********************************************************************");
			
			opcao = leia.nextInt();
		
		switch(opcao) {
			case 1:
				System.out.println("\nDigite o nome do Livro: ");
				String nome_do_livro = leia.next();
				pilha_de_livros.push(nome_do_livro);
				System.out.println("\nLivro adicionado à pilha. ");
				break;
				
			case 2:
				if(pilha_de_livros.isEmpty()) {
					System.out.println("\nA pilha de livros está vazia!");	
				}
				else {
					System.out.println("\nLista de Livros na pilha: ");
					for (String livro:pilha_de_livros)
					{
						System.out.println(livro);
					}
				}
				break;
			case 3:
				if(pilha_de_livros.isEmpty()) {
					
					System.out.println("A pilha de livros está vazia! ");	
				}
				else {
					System.out.println("Um livro foi retirado da pilha! ");
				}
				break;
			case 0:
				System.out.println("Programa Finalizado! ");
				break;
			default:
				System.out.println("\nOpção Inválida! ");
				break;
				
				}	
			}
			leia.close();	
	}

}
