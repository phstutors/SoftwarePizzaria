package ifpe;


public class ItemPedido {
	private int id;
	private int quantidade;
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

	public double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}




}
