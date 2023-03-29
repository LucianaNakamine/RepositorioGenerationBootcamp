package Atividades8;

public class Cliente {

	/* Atributos */
	private String nome;
	private String endereco;
	private String telefone;
	private String email;
	private int idade;
	
	/* Método Construtor */
	public Cliente(String nome, String endereco, String telefone, String email, int idade) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
		this.idade = idade;
	}
	
	/* Métodos Get e Set para todos os atributos*/
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	/* Método para visualização dos atributos */
	public void visualizar() {
		System.out.println("\nNome do(a) cliente: "+nome);
		System.out.println("\nEndereço do(a) cliente: "+endereco);
		System.out.println("\nTelefone do(a) cliente: "+telefone);
		System.out.println("\nEmail do(a) cliente: "+email);
		System.out.println("\nIdade do(a) cliente: "+idade);
		
	}	
}
