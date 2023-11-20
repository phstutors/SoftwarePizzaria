

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Cobertura {
	
	private int id;
	private String sabor;
	private int quantidadeDisponivel;
	private List<Fornecedor> fornecedores;
	
	public Cobertura(String sabor, int quantidadeDisponivel, List<Fornecedor> fornecedores) {
		
		setSabor(sabor);
		setQuantidadeDisponivel(quantidadeDisponivel);
		setFornecedores(fornecedores);
	}
	public Cobertura() {
		
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public int getQuantidadeDisponivel() {
		return quantidadeDisponivel;
	}
	public void setQuantidadeDisponivel(int quantidadeDisponivel) {
		this.quantidadeDisponivel = quantidadeDisponivel;
	}
	public List<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public void setFornecedores(List<Fornecedor> fornecedores) {
		this.fornecedores = fornecedores;
	}
	
	public void addCobertura() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Digite o Sabor da cobertura: ");
		String saborCobertura = sc.nextLine();
		System.out.print("Digite a quantidade disponivel: ");
		int qDisponivel = sc.nextInt();
		setSabor(saborCobertura);
		setQuantidadeDisponivel(qDisponivel);
		setId(random.nextInt());
	}

	
}
