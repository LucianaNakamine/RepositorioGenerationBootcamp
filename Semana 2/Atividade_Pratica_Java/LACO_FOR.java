package Atividades3;

import java.util.Scanner;

public class LACO_FOR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int inicio, fim, x;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número do intervalo: ");
		inicio = leia.nextInt();
		System.out.println("\n Digite o último número do intervalo: ");
		fim = leia.nextInt();
		
		if(inicio>=fim) {
			System.out.println("\n Intervalo inválido!");
		}
		
		else {
			for(x=inicio; x<=fim; x++) {
				if(x%3==0 && x%5==0) {
					System.out.println(x);
				}
			}
		}
		
		
		
	}

}
