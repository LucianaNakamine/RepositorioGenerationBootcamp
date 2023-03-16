package Atividades2;

import java.util.Scanner;

public class soma_maior_menor_igual_lacoif_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A, B, C, soma;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Entre com o valor de A: ");
		A = leia.nextInt();
		System.out.println("\n Entre com o valor de B: ");
		B = leia.nextInt();
		System.out.println("\n Entre com o valor de C: ");
		C = leia.nextInt();
		
		soma = (A+B);
		
		if(soma < C) {
			System.out.println(" "+B+" + "+A+" = "+soma+" < "+C);
			System.out.println(" A soma de A + B é menor do que C");
		}
		else if(soma > C) {
			System.out.println(" "+B+" + "+A+" = "+soma+" > "+C);
			System.out.println(" A soma de A + B é maior do que C");
		}
		else if (soma == C){
			System.out.println(" "+B+" + "+A+" = "+soma+" = "+C);
			System.out.println(" A soma de A + B é igual a C");
		}
	}

}
