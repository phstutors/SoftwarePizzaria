package ProjePoo;

public class Fornecedor {
	private int id;
	private String nome;
	private String cnpj;
	private Ingrediente ingrediente;
	private Cobertura cobertura;
	 public Fornecedor(int id,String nome,String cnpj){
		 this.id=id;
		 this.nome=nome;
		 this.cnpj=cnpj;
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Ingrediente getIngrediente() {
		return ingrediente;
	}
	public void setIngrediente(Ingrediente ingrediente) {
		this.ingrediente = ingrediente;
	}
	public Cobertura getCobertura() {
		return cobertura;
	}
	public void setCobertura(Cobertura cobertura) {
		this.cobertura = cobertura;
	}
	
	

}
