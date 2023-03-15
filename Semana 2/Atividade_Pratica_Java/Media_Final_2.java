package Atividades;

import java.util.Scanner;

public class Media_Final_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite a sua primeira nota:");
		nota1 = leia.nextFloat();
		System.out.println("\n Digite a sua segunda nota: ");
		nota2 = leia.nextFloat();
		System.out.println("\n Digite a sua terceira nota: ");
		nota3 = leia.nextFloat();
		System.out.println("\n Digite a sua quarta nota: ");
		nota4 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4)/4;
		
		System.out.printf("\n Sua média final é: %.2f", media);
		
		
	}

}
