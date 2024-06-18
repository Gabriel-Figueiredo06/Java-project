import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		sistemafuncionario sistema = new sistemafuncionario();

		while (true) {
			System.out.println("\n\nO que você deseja fazer?"); 
			System.out.println("1 - Adicionar funcionario");
			System.out.println("2 - Buscar funcionario");
			System.out.println("3 - sair");
			int opcao = scanner.nextInt();
			scanner.nextLine();

			if (opcao == 1) {
				System.out.println("Id: ");
				String id = scanner.nextLine();
				System.out.println("Nome: ");
				String nome = scanner.nextLine();
				System.out.println("Idade: ");
				int idade = scanner.nextInt();
				scanner.nextLine();
				System.out.println("Telefone de contato: ");
				String telefoneContato = scanner.nextLine();
				System.out.print("Alergias: ");
				String alergias = scanner.nextLine();
				System.out.println("Problemas médicos:");
				String problemasMedicos = scanner.nextLine();

				funcionario funcionario = new funcionario(nome, idade, telefoneContato, id, alergias, problemasMedicos);
				sistema.adicionarFuncionario(funcionario);
				System.out.println("\nFuncionario adicionado com sucesso!");

			} else if (opcao == 2) {
				System.out.println("Digite o ID do funcionario: ");
				String id = scanner.nextLine();
				pessoa funcionario = sistema.buscarFuncionario(id);
				if (funcionario != null) {
					funcionario.informacoes();
				} else {
					System.out.println("Funcionario não encontrado! Verifique se o ID esta correto.");
				}

			} else if (opcao == 3) {
				System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n ");
				break;
			} else {
				System.out.println("Tente novamente!");
			}
		}
		scanner.close();
	}
}
