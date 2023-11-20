

import java.util.List;
import java.util.Random;
import java.util.Scanner;


public class Cliente extends Pessoa{
	
	private String endereco;
	
	private List<Entrega> entregas;
	
	

	public String getEndereco() {
		return endereco;
	}
	

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Cliente(String cpf, String nome, String telefone, String endereco) {
		super(cpf, nome, telefone);
		setEndereco(endereco);
		
	}
	public Cliente() {
		
	}
	
	
	
	public void cadastrarCliente() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o nome do cliente ");
		String nome = sc.nextLine();
		System.out.print("Digite o numero de telefone do cliente: ");
		String telefone = sc.nextLine();
		System.out.print("Digite o cpf do cliente: ");
		String cpf = sc.nextLine();
		System.out.print("Digite o endereço do cliente: ");
		String endereco = sc.nextLine();
		
		setNome(nome);
		setEndereco(endereco);
		setCpf(cpf);
		setTelefone(telefone);
		

	}



	public List<Entrega> getEntregas() {
		return entregas;
	}



	public void setEntregas(List<Entrega> entregas) {
		this.entregas = entregas;
	}


	public Cliente() {
		// TODO Auto-generated constructor stub
	}
}
