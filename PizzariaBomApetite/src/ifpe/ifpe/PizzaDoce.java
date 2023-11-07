package ifpe;

import java.util.List;

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


}
