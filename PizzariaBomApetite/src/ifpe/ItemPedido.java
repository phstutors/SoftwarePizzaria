package ProjePoo;

public class ItemPedido {
	private int id;
	private int quantidade;
	private double precoUnitario;
	private Pedido pedido;
	private Pizza pizza;
	
	public ItemPedido(int id, int quantidade,double precoUnitario) {
		this.id=id;
		this.quantidade=quantidade;
		this.precoUnitario=precoUnitario;
		
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

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizza(Pizza pizza) {
		this.pizza = pizza;
	}
	
	
	

}
