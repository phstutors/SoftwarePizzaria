package ifpe;

public class PizzaSalgada extends Pizza {
	private String ingredientes;
	public PizzaSalgada(String id,String sabor,String tamanho,String ingredientes ) {
		super(id,sabor,tamanho);
		this.ingredientes=ingredientes;
	}
	public PizzaSalgada() {
	}
	public String getIngredientes() {
		return ingredientes;
	}
	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

}
