package Atividades3;

import java.util.Scanner;

public class LACO_WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade=0, m_21=0, m_50=0;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		while(idade>=0) {
			System.out.println("\n Digite uma idade: ");
			idade = leia.nextInt();
			if(idade<21) {
				m_21++;
			}
			else if(idade>50) {
				m_50++;
			}

		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: "+m_21);
		System.out.println("\nTotal de pessoas maiores de 50 anos: "+m_50);
	}

}
