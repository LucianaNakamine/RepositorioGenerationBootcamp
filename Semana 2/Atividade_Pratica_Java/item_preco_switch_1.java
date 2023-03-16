package Atividades2;

import java.util.Scanner;

public class item_preco_switch_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String produto="";
		int cod,qtd;
		float valor=0, valor_total=0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o código do produto: ");
		cod = leia.nextInt();
		System.out.println("Quantidade: ");
		qtd = leia.nextInt();
		
		switch(cod) {
		
		case 1:
			produto = "Cachorro Quente";
			valor = 10;
			break;
		case 2:
			produto = "X-salada";
			valor = 15;
			break;
		case 3:
			produto = "X-bacon";
			valor = 18;
			break;
		case 4:
			produto = "Bauru";
			valor = 12;
			break;
		case 5:
			produto = "Refrigerante";
			valor = 8;
			break;
		case 6:
			produto = "Suco de laranja";
			valor = 13;
			break;
			
		}
		
	valor_total = qtd*valor;
	System.out.println("\nProduto: "+produto);
	System.out.println("\nValor Total: "+valor_total);
		
		
		
		
		
		
		
	}

}
