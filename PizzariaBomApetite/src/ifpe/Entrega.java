package ProjePoo;



public class Entrega {
	private int id;
	private String endereco;
	private int  tempoEntrega;
	private Pedido pedido;
	
	public Entrega(int id, String endereco,int tempoEntrega) {
		this.id=id;
		this.endereco=endereco;
		this.tempoEntrega=tempoEntrega;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getTempoEntrega() {
		return tempoEntrega;
	}

	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	
	}
