package Atividades2;

import java.util.Scanner;

public class calculadora_switch_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int operacao;
		float num1, num2, resultado = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n Digite o primeiro número: ");
		num1 = leia.nextFloat();
		System.out.println("\n Digite o segundo número: ");
		num2 = leia.nextFloat();
		System.out.println("\n Operação: ");
		operacao = leia.nextInt();
		
		switch(operacao) {
		
		case 1:
			resultado = num1 + num2;
			
			break;
		case 2:
			resultado = num1 - num2;
			
			break;
		case 3:
			resultado = num1*num2;
			
			break;
		case 4: 
			resultado = num1/num2;
			
			break;
		}
		
		System.out.println(resultado);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
