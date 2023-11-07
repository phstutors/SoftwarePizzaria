package ifpe;

import java.util.List;

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

	
}
