

import java.util.List;
import java.util.Scanner;

public class PizzaSalgada extends Pizza {
	
	
	private List<Ingrediente> ingredientes;


	public void setIngredientes(List<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}
	public PizzaSalgada(String sabor,String tamanho,List<Ingrediente> ingredientes, double preco ) {
		super(sabor,tamanho);
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

        System.out.println("Deseja adicionar bordas recheadas à sua pizza Salgada?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int escolha = perguntarCliente.nextInt();

        if (escolha == 1) {
        	System.out.println("Recheios Disponiveis: \n Chocolate \n Morango \n Romeu e Julieta");
            System.out.print("Digite o nome do recheio desejado: ");
            String nomeRecheio = perguntarCliente.next();
            setBorda(nomeRecheio);
            System.out.println("Bordas recheadas com " + nomeRecheio + " adicionadas à sua pizza!");
        } else if(escolha == 2){
            System.out.println("Bordas recheadas não adicionadas à sua pizza.");
        }else {
        	System.out.println("Opcao Incorreta!");
        }
    }
	
	@Override
	public void addPizza() {
		// TODO Auto-generated method stub
		super.addPizza();
		setSabor(PizzaSalgada.class.getSimpleName());
	}
	
}
