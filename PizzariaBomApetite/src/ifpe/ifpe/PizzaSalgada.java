package ifpe;

import java.util.List;
import java.util.Scanner;

public class PizzaSalgada extends Pizza {
	
	
	private List<Ingrediente> ingredientes;
	private String sabor;
	private double preco;
	
	
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public PizzaSalgada(String id,String sabor,String tamanho,List<Ingrediente> ingredientes, double preco ) {
		super(id,sabor,tamanho);
		setIngredientes(ingredientes);
		setPreco(preco);
	}
	public PizzaSalgada() {
	}
	public List<Ingrediente> getIngredientes() {
		return ingredientes;
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
