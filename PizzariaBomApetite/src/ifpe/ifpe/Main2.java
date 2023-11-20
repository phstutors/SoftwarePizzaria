import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente = new Cliente();
        cliente.setCpf("12313122");
        cliente.setNome("Eduardo");
        cliente.setEndereco("Agua Preta, 33");
        cliente.setTelefone("4242448785");
        
        List<Pizza> pizzas = new ArrayList<Pizza>();
     List<Cobertura>listadeCobertura = new ArrayList<Cobertura>();
     
     Cobertura cobertura1 = new Cobertura();
    
     
    cobertura1.addCobertura();
   
    Fornecedor fornecedor = new Fornecedor(11, "Piracamjuba", "4123131");
    
    List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
    
    fornecedores.add(fornecedor);
    
     cobertura1.setFornecedores(fornecedores);
    
     listadeCobertura.add(cobertura1);

     
        PizzaDoce pizzaDoce = new PizzaDoce();
     
        pizzaDoce.addPizza();
        pizzaDoce.setCoberturas(listadeCobertura);
        pizzaDoce.adicionarBordasRecheadas();

        pizzas.add(pizzaDoce);
        

        ItemPedido itemPedido = new ItemPedido();
        List<ItemPedido> itensPedidos = new ArrayList<>();

  
        itemPedido.setPizzas(pizzas);
        itensPedidos.add(itemPedido);

        Pedido pedido = new Pedido();
        pedido.setDescricao("Pedido do(a) Cliente"+ cliente.getNome());
      pedido.setItensPedidos(itensPedidos);

        List<Pedido> pedidos = new ArrayList<>();

        

        
        pedidos.add(pedido);
        
        
        List<Entrega> entregas = new ArrayList<Entrega>();
        
        Entrega entrega = new Entrega();
        
        entrega.setPedidos(pedidos);
        entregas.add(entrega);
      
        cliente.setEntregas(entregas);
       pedido.calcularTotal();
       
       
       System.out.println("Se voce tiver um cupom de desconto, digite abaixo:");
       Scanner sc = new Scanner(System.in);
       
       if(sc.next().toLowerCase().equals("apetit10")) {
    	   
    	   pedido.calcularDesconto(10);
       }
       
      
        
        
        

        
        System.out.println("Pedido do Cliente:");
        System.out.println("-------------------");
        System.out.println("Detalhes dos Itens:");
        for (Entrega entregah : entregas) {
			for (Pedido pedidoh : entregah.getPedidos()) {
				for (ItemPedido pedidoss : pedidoh.getItensPedidos()) {
					System.out.println(pedidoh.getDescricao());
					System.out.println("Voce comprou: " + pedidoss.getPizzas().size() + " pizzas");
					
					
					System.out.println("O total do pedido ficou: " + pedidoh.getValorTotal());
				}
			}
		}

            System.out.println("-------------------");

    }}
