import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class ItemPedido {
	private int id;
	private int quantidade;
	private List<Pizza> pizzas;
	


	public ItemPedido(List<Pizza> pizzas) {
		Random random = new Random();
		this.id= random.nextInt();
		this.quantidade=pizzas.size();
		this.pizzas = pizzas;
		}
	public ItemPedido() {
		
		}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public List<Pizza> getPizzas() {
		return pizzas;
	}

	public void setPizzas(List<Pizza> pizzas) {
		this.pizzas = pizzas;
	}


	
	
	
	

}
