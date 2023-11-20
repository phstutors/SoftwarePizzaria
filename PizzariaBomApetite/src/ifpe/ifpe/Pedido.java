

import java.util.List;
import java.util.Random;


public class Pedido {

	public Pedido() {
		// TODO Auto-generated constructor stub
	}

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
        Random random = new Random();
        setNumeroPedido(random.nextInt());
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }

    // Métodos
    public void exibirDetalhes() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor Total: R$" + valorTotal);
       for (ItemPedido itemPedido : itensPedidos) {
    	   
    	   for(Pizza pizza : itemPedido.getPizzas()) {
    		   System.out.println("Suas pizzas: " + "Sabor: " + pizza.getSabor() + " Tamanho: " + pizza.getTamanho());
    	   }
		
	}
    }
    
    public double calcularTotal() {
    	   double total = 0.0;

    	    for (ItemPedido itemPedido : itensPedidos) {
    	        for (Pizza pizza : itemPedido.getPizzas()) {
    	            total += pizza.getPreco(); // Adiciona o preço de cada pizza ao total
    	        }
    	    }

    	    setValorTotal(total); // Define o valor total após calcular o total das pizzas
    	    return total;
    }


    public double calcularDesconto(double percentualDesconto) {
    	double total = 0.0;

	    for (ItemPedido itemPedido : itensPedidos) {
	        for (Pizza pizza : itemPedido.getPizzas()) {
	            total += pizza.getPreco(); // Adiciona o preço de cada pizza ao total
	        }
	    }

	    setValorTotal(total - (total * percentualDesconto / 100)); // Define o valor total após calcular o total das pizzas
        return total;
    }


}
