
public class Pessoa {

	
	private String cpf;
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	private String nome;
	private String telefone;
	
	public Pessoa(String cpf, String nome, String telefone) {
		
		setCpf(cpf);
		setNome(nome);
		setTelefone(telefone);
		
	}
	
}
