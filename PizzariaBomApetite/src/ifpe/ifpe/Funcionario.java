

public class Funcionario extends Pessoa{

	private String cargo;
	private double salario;
	private Cliente cliente;
	
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	
//Construtor da classe
	
	public Funcionario(String cpf, String nome, String telefone, String cargo, double salario) {
		super(cpf, nome, telefone);
		setCargo(cargo);
		setSalario(salario);
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	
	
}
