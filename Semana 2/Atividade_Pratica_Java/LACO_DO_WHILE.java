package Atividades3;

import java.util.Scanner;

public class LACO_DO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, soma_positivos=0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("\n Digite um número: ");
			numero = leia.nextInt();	
			
			if(numero>0) {
				soma_positivos =soma_positivos + numero;
			}
		}
		
		while(numero!=0);
		System.out.println("\n A soma dos números positivos é: "+soma_positivos);
		
	
		
		
	}

}
