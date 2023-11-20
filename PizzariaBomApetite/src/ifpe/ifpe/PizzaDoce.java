

import java.util.List;
import java.util.Scanner;

public class PizzaDoce extends Pizza {
	
	List<Cobertura> coberturas;
	
	public List<Cobertura> getCoberturas() {
		return coberturas;
	}
	public void setCoberturas(List<Cobertura> coberturas) {
		this.coberturas = coberturas;
	}
	public PizzaDoce(int id,String sabor,String tamanho, List<Cobertura> coberturas, double preco) {
		super(id,sabor,tamanho);
		setSabor(sabor);;
		setCoberturas(coberturas);
		setPreco(preco);
	}
	public PizzaDoce() {

	}
	
	public void adicionarBordasRecheadas() {
		// TODO Auto-generated method stub
		Scanner perguntarCliente = new Scanner(System.in);

        System.out.println("Deseja adicionar bordas recheadas à sua pizza Doce?");
        System.out.println("1 - Sim");
        System.out.println("2 - Não");

        int escolha = perguntarCliente.nextInt();

        if (escolha == 1) {
        	System.out.println("Recheios Disponiveis: \n Chocolate \n Morango \n Romeu e Julieta");
            System.out.print("Digite o nome do recheio desejado: ");
            String nomeRecheio = perguntarCliente.next();
            setBorda(nomeRecheio);
            System.out.println("Bordas recheadas com " + nomeRecheio + " adicionadas à sua pizza!");
        } else {
            System.out.println("Bordas recheadas não adicionadas à sua pizza.");
        }
    }
	
	@Override
	public void addPizza() {
		// TODO Auto-generated method stub
		super.addPizza();
		setSabor(PizzaDoce.class.getSimpleName());
	}

}
