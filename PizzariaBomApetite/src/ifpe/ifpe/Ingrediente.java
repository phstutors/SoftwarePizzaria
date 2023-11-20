import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ingrediente {
	
	private int id;
	private String nome;
	private int quantidadeDisponivel;
	private List<Fornecedor> fornecedores;
	
	public Ingrediente(String nome, int quantidadeDisponivel) {
		setNome(nome);
		setQuantidadeDisponivel(quantidadeDisponivel);
	}
	
	public Ingrediente() {

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
	public void addIngrediente() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Digite o nome do ingrediente ");
		String nomeIngrediente = sc.nextLine();
		System.out.print("Digite a quantidade disponivel: ");
		int qDisponivel = sc.nextInt();
		setNome(nomeIngrediente);
		setQuantidadeDisponivel(qDisponivel);
		setId(random.nextInt());
	}

	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	

}
