package Atividades;

import java.util.Scanner;

public class Calculo_Salario_Abono_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double salario, abono, novosalario;
		
		
		Scanner leia = new Scanner(System.in);

		System.out.println("\n Digite o salário: ");
		salario = leia.nextDouble();
		System.out.println("\n Digite o abono: ");
		abono = leia.nextDouble();
		
		novosalario = (salario + abono);
		
		System.out.println("\n Seu novo salário é: " +novosalario);	
	}

}
