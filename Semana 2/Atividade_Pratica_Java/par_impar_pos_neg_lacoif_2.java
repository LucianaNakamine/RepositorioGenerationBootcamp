package Atividades2;

import java.util.Scanner;

public class par_impar_pos_neg_lacoif_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float numero;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite um número: ");
		numero = leia.nextFloat();
		
		if(numero%2==0 && numero>0) {
			System.out.println("\n O número "+numero+ " é par e positivo");
		}
		else if(numero%2==0 && numero<0) {
			System.out.println("\n O número " +numero+ " é par e negativo");
		}
		else if(numero%2==1 && numero>0) {
			System.out.println("\n O número "+numero+ " é ímpar e positivo");
		}
		else if(numero%2==1 && numero<0) {
			System.out.println("\n O número "+numero+ " é ímpar e negativo");
		}
	}

}
