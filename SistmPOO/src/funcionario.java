
public class funcionario extends pessoa {
	private String alergias;
	private String problemasMedicos;

	public funcionario(String nome, int idade, String telefoneContato, String id, String alergias,
			String problemasMedicos) {
		super(nome, idade, telefoneContato, id);
		this.alergias = alergias;
		this.problemasMedicos = problemasMedicos;
	}

	public String getProblemasMedicos() {
		return problemasMedicos;
	}

	public void setProblemasMedicos(String problemasMedicos) {
		this.problemasMedicos = problemasMedicos;
	}

	public String getAlergias() {
		return alergias;
	}

	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}

	public void informacoes() {
		super.informacoes();
		System.out.println("Alergias do funcionario: " + alergias);
		System.out.println("Problemas médicos do funcionario: " + problemasMedicos);
	}

}
