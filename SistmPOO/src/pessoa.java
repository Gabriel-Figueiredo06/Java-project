
public class pessoa {
	protected String nome;
	protected int idade;
	protected String telefoneContato;
	protected String id;

	public pessoa(String nome, int idade, String telefoneContato, String id) {
		this.nome = nome;
		this.idade = idade;
		this.telefoneContato = telefoneContato;
		this.id = id;

	}

	public String getId() {
		return id;

	}

	public void informacoes() {
		System.out.println("Id: " + id);
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Telefone de contato: " + telefoneContato);		
		
	}

}
