package ifpe;

import java.util.List;


public class Cliente extends Pessoa{
	
	private String endereco;
	
	private List<Pedido> pedidos;
	
	

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public Cliente(int cpf, String nome, int telefone, String endereco) {
		super(cpf, nome, telefone);
		setEndereco(endereco);
		// TODO Auto-generated constructor stub
	}

	public Cliente() {
		// TODO Auto-generated constructor stub
	}
}
