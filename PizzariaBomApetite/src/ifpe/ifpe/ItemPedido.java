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


	private double precoUnitario;
	private Pizza pizza;

	public ItemPedido(int id, int quantidade,double precoUnitario) {
		this.id=id;
		this.quantidade=quantidade;
		this.precoUnitario=precoUnitario;

	}
	public ItemPedido() {
		// TODO Auto-generated constructor stub
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

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}



}
