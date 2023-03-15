package Atividades;

import java.util.Scanner;

public class Diferenca_e_Produto_Float_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double numero1, numero2, numero3, numero4, diferenca;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		numero1 = leia.nextDouble();
		System.out.println("\n Digite o segundo número: ");
		numero2 = leia.nextDouble();
		System.out.println("\n Digite o terceiro número: ");
		numero3 = leia.nextDouble();
		System.out.println("\n Digite o quarto número: ");
		numero4 = leia.nextDouble();
		
		diferenca = (numero1*numero2)- (numero3*numero4);
		
		System.out.printf("\n A diferença do produto entre os números é: %.2f", diferenca);
		
		
	}

}
