package Atividades;

import java.util.Scanner;

public class Salario_Liquido_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario_bruto, adicional_noturno, horas_extras, descontos, salario_liquido;
			
		Scanner leia = new Scanner(System.in);
			
		System.out.println("\n Digite seu salário bruto: ");
		salario_bruto = leia.nextDouble();
		System.out.println("\n Digite o valor do adicional noturno: ");
		adicional_noturno = leia.nextDouble();
		System.out.println("\n Digite o valor das horas extras: ");
		horas_extras = leia.nextDouble();
		System.out.println("\n Digite o valor dos descontos: ");
		descontos = leia.nextDouble();
			
		salario_liquido = (salario_bruto + adicional_noturno +(horas_extras*5))- descontos;
			
		System.out.printf("\n Seu salário líquido é: %.2f",salario_liquido);
			
	}

}
