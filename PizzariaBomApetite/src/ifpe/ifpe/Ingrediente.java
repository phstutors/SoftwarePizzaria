package ifpe;

public class Ingrediente {
	
	private int id;
	private String nome;
	private int quantidadeDisponivel;
	
	public Ingrediente(String nome, int quantidadeDisponivel) {
		setNome(nome);
		setQuantidadeDisponivel(quantidadeDisponivel);
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}

	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}

	

}
