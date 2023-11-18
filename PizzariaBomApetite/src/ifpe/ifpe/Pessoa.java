package ifpe;

public class Pessoa {

	
	protected int cpf;
	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	protected String nome;
	protected int telefone;
	
	public Pessoa(int cpf, String nome, int telefone) {
		
		setCpf(cpf);
		setNome(nome);
		setTelefone(telefone);
		
	}
	public Pessoa() {
		// TODO Auto-generated constructor stub
	}
}
