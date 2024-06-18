import java.util.HashMap;
import java.util.Map;

public class sistemafuncionario {
	private Map<String, pessoa> funcionario;

	public Map<String, pessoa> getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Map<String, pessoa> funcionario) {
		this.funcionario = funcionario;
	}

	public sistemafuncionario() {
		funcionario = new HashMap<>();

	}

	public void adicionarFuncionario(funcionario funcionario) {
		this.funcionario.put(funcionario.getId(), funcionario);
	}
	
	public pessoa buscarFuncionario(String id) {
		return funcionario.get(id);
	}

}
