package ifpe;

import java.util.List;
import java.util.Scanner;

public class PizzaDoce extends Pizza {
	
	private String sabor;
	List<Cobertura> coberturas;
	private double preco;
	
	public List<Cobertura> getCoberturas() {
		return coberturas;
	}
	public void setCoberturas(List<Cobertura> coberturas) {
		this.coberturas = coberturas;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public PizzaDoce(String id,String sabor,String tamanho, List<Cobertura> coberturas, double preco) {
		super(id,sabor,tamanho);
		setSabor(sabor);;
		setCoberturas(coberturas);
		setPreco(preco);
	}
	public PizzaDoce() {

	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void adicionarBordasRecheadas() {
		// TODO Auto-generated method stub
		Scanner perguntarCliente = new Scanner(System.in);

        System.out.println("Deseja adicionar bordas recheadas à sua pizza?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int escolha = perguntarCliente.nextInt();

        if (escolha == 1) {
            System.out.print("Digite o nome do recheio desejado: ");
            String nomeRecheio = perguntarCliente.next();
            System.out.println("Bordas recheadas com " + nomeRecheio + " adicionadas à sua pizza!");
        } else {
            System.out.println("Bordas recheadas não adicionadas à sua pizza.");
        }
    }

}
