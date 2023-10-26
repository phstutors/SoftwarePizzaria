package ifpe;

public class PizzaDoce extends Pizza {
	private String cobertura;
	public PizzaDoce(String id,String sabor,String tamanho,String cobertura) {
		super(id,sabor,tamanho);
		this.cobertura= cobertura;
	}
	public PizzaDoce() {

	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

}
