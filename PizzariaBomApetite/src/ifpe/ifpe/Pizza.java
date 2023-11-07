package ifpe;

public abstract class Pizza {
	private String id;
	private String sabor;
	private String tamanho;

	public Pizza(String id,String sabor,String tamanho) {
		this.id= id;
		this.sabor= sabor;
		this.tamanho= tamanho;
	}
	public Pizza() {	
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

}
