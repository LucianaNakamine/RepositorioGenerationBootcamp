package Atividades7;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Collections_Queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> fila_de_clientes = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int opcao =-1;
		String nome_do_cliente;
		
		while (opcao!=0) {
			System.out.println("**************************************************************");
			System.out.println("                                                              ");
			System.out.println("                                                              ");
			System.out.println("             1 - Adicionar Cliente na Fila                    ");
			System.out.println("             2 - Listar todos os Clientes                     ");
			System.out.println("             3 - Retirar Cliente da Fila                      ");
			System.out.println("             0 - Sair                                         ");
			System.out.println("                                                              ");
			System.out.println("                                                              ");
			System.out.println("**************************************************************");
			System.out.println("                                                              ");
			System.out.println("\nEntre com a opção desejada:                                 ");
			System.out.println("                                                              ");
			
			opcao = leia.nextInt();
			
			switch(opcao) {
			case 1:
				System.out.println("\nDigite o nome do cliente: ");
				nome_do_cliente = leia.next();
				fila_de_clientes.add(nome_do_cliente);
				System.out.println("\n Cliente adicionado! ");
				break;
			case 2:
				if (fila_de_clientes.isEmpty()) {
					System.out.println("A fila está vazia! ");
				}
				else {
					System.out.println("\nLista de Clientes na Fila: ");
					for(String cliente: fila_de_clientes) {
						System.out.println(cliente);
					}
				}
				break;
			case 3:
				if(fila_de_clientes.isEmpty()) {
					System.out.println("A Fila está vazia !");
				}
				else {
					String cliente_chamado = fila_de_clientes.remove();
					System.out.println("\nCliente já foi chamado!");
				}
				break;
			case 0:
				System.out.println("\nPrograma Finalizado! ");
				break;
				
			default:
				System.out.println("\nOpção Inválida.");
				break;
			}	
		}	
		leia.close();
	}

}
