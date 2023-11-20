import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fornecedor {
	private int id;
	private String nome;
	private String cnpj;
	
	
	 public Fornecedor(int id,String nome,String cnpj){
		 
		 setNome(nome);
		 setCnpj(cnpj);	
		 }
public Fornecedor(){

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
	
	public void addFornecedor() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Digite o nome do fonecedor: ");
		String nomeFornecedor = sc.nextLine();
		System.out.print("Digite o CNPJ do fonecedor: ");
		String cnpjFornecedor = sc.nextLine();
		Fornecedor fornecedor = new Fornecedor(12, nomeFornecedor, cnpjFornecedor);
		List<Fornecedor> fornecedores = new ArrayList();
		fornecedores.add(fornecedor);
	}
	
	

}
