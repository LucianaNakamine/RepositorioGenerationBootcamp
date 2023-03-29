package Atividades8;

public class testaCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* Instanciando dois objetos da classe Cliente */
		Cliente cliente1 = new Cliente("Luís", "Rua da Paz, 25", "(11) 985973345", "luisguerreiro@gmail.com", 25);
		Cliente cliente2 = new Cliente("Jacque", "Rua da Graça, 26", "(11) 945741049", "jacquehernandez@gmail.com", 23);
		
		/* Exibindo os dados dos dois objetos instanciados*/
		System.out.println("----------------------------------------------------");
		System.out.println("\n\t\tDados do cliente 1: ");
		System.out.println("----------------------------------------------------");
		cliente1.visualizar();
		System.out.println("                                                    ");
		System.out.println("----------------------------------------------------");
		System.out.println("                                                    ");
		System.out.println("\n\t\tDados do cliente 2: ");
		System.out.println("----------------------------------------------------");
		cliente2.visualizar();	
	}

}
