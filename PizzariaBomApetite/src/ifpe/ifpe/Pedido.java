package ifpe;

import java.util.List;


public class Pedido {


    // Atributos
    private int numeroPedido;
    private String descricao;
    private double valorTotal;
    private List<ItemPedido> itensPedidos;
    private Entrega entrega;

    public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public List<ItemPedido> getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(List<ItemPedido> itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	public Entrega getEntrega() {
		return entrega;
	}

	public void setEntrega(Entrega entrega) {
		this.entrega = entrega;
	}

	// Construtor
    public Pedido(int numeroPedido, String descricao, double valorTotal) {
        this.numeroPedido = numeroPedido;
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }
    public Pedido() {
		// TODO Auto-generated constructor stub
	}

    // Métodos
    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Total: R$" + valorTotal);
    }
    
    public void calcularTotal() {
		for (ItemPedido itemPedido : itensPedidos) {
			setValorTotal(itemPedido.getPrecoUnitario() * itemPedido.getQuantidade());
		}
    	
    }

    public double calcularDesconto(double percentualDesconto) {
        return valorTotal - (valorTotal * percentualDesconto / 100);
    }


}
