package ifpe;

import java.util.List;

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

}
