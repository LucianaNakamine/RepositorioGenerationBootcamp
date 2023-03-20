package Atividades4;

import java.util.Scanner;

public class Arrays_Vetores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero, valor_encontrado=0,i, cont=0;
		int[] vetor = new int[10];
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite um número: ");
		numero = leia.nextInt();
		
		for (i=0; i<10; i++) {
			System.out.println("\n Entre com um número do vetor: ");
			vetor[i]= leia.nextInt();
			
			if(vetor[i]== numero) {
				valor_encontrado = i;	
			}
			
		}
		
		
		for(i=0; i<10; i++) {
			if(valor_encontrado!=0) {
				System.out.println("\n O número "+numero+ " está localizado na posição: "+valor_encontrado);
			cont++;}
			}
			
			if (cont==0) {
				System.out.println("valor não encontrado");
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
