

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class App {

	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		List<Pizza> pizzas = new ArrayList<Pizza>();
		System.out.println("-".repeat(15));
		
		System.out.println("Seja bem vindo a Pizzaria Bom apetit ");
		
			
			System.out.println("-".repeat(15));
			System.out.println("Painel do Pizzaria Bom Apetit \n 1: Criar novo Pedido");
			int opcaoLocal = sc.nextInt();
			
			while (opcaoLocal == 1) {
				
				
				int contador;
				
				
				
				System.out.println("Escolha uma opção: \n 1: Pizza Doce \n 2: Pizza Salgada \n 3: Finalizar Pedido");
				contador = sc.nextInt();
				
				switch(contador) {
				
				case 1:

						PizzaDoce pizzaDoce = new PizzaDoce();
						pizzaDoce.addPizza();
						
						System.out.println("Deseja Adicionar borda? \n 1: Sim \n 2: Não ");
						int escolhaContador = sc.nextInt();
						
					while(escolhaContador == 1) {
						System.out.println("Vamos criar sua cobertura: ");
						Cobertura cobertura = new Cobertura();
						cobertura.addCobertura();
						
						System.out.println("vamos cadastrar o fornecedor da cobertura: ");
						Fornecedor fornecedor = new Fornecedor();
						fornecedor.addFornecedor();
						
						List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
						fornecedores.add(fornecedor);
						
						cobertura.setFornecedores(fornecedores);
						
						List<Cobertura> coberturasDoce = new ArrayList<Cobertura>();
						
						pizzaDoce.setCoberturas(coberturasDoce);
						
						System.out.println("Deseja Adicionar mais cobertura? \n 1: Sim \n 2: Não ");
						escolhaContador = sc.nextInt();
					}
					pizzaDoce.adicionarBordasRecheadas();
					pizzas.add(pizzaDoce);
					
			
					break;
				case 2:
						PizzaSalgada pizzaSalgada = new PizzaSalgada();
						pizzaSalgada.addPizza();
						
						System.out.println("Deseja Adicionar ingredientes extras? \n 1: Sim \n 2: Não ");
						int escolhaContador1 = sc.nextInt();
						
					while(escolhaContador1 == 1) {
						System.out.println("Vamos criar os ingredientes extras: ");
						Ingrediente ingrediente =  new Ingrediente();
						ingrediente.addIngrediente();
						
						System.out.println("vamos cadastrar o fornecedor dos ingredientes: ");
						Fornecedor fornecedor = new Fornecedor();
						fornecedor.addFornecedor();
						
						List<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
						fornecedores.add(fornecedor);
						
						ingrediente.setFornecedores(fornecedores);
						
						List<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
						
						pizzaSalgada.setIngredientes(ingredientes);
						
						System.out.println("Deseja Adiciona11"
								+ "r mais ingredientes? \n 1: Sim \n 2: Não ");
						escolhaContador1 = sc.nextInt();
					}
					pizzaSalgada.adicionarBordasRecheadas();
					pizzas.add(pizzaSalgada);	
			
					break;
				

			case 3:

				    if(pizzas.size() > 01) {
				    	// Criar e configurar ItemPedido
					    ItemPedido itemPedido = new ItemPedido();
					    itemPedido.setPizzas(pizzas);

					    List<ItemPedido> itensPedidos = new ArrayList<ItemPedido>();
					    itensPedidos.add(itemPedido);

					    Cliente cliente = new Cliente();
						
						System.out.println("Vamos cadastrar seu cliente agora: ");
						cliente.cadastrarCliente();
				
						
						System.out.println("Vamos cadastrar seu pedido no sistema: ");
						

						
					    Pedido pedido = new Pedido();
					    pedido.setDescricao(sc.nextLine());
					    pedido.setItensPedidos(itensPedidos);
					    

					    pedido.calcularTotal();
					    
					    System.out.println("Quer dar desconto? \n 1: Sim \n 2: Não");
					    int opcaoLocal1 = sc.nextInt();
					
					    if(opcaoLocal1 == 1) {
					    	System.out.println("Informe o valor da porcetagem do desconto: ");
					    	pedido.calcularDesconto(sc.nextDouble());
					    }

					    // Exibir detalhes do pedido

					    List<Pedido> pedidos = new ArrayList<Pedido>();
					    
					    pedidos.add(pedido);


					    Entrega entrega = new Entrega();
					    
					    entrega.setEndereco(cliente.getEndereco());
					    entrega.setPedidos(pedidos);
					    
					    List<Entrega> entregas = new ArrayList<Entrega>();
					    
					    entregas.add(entrega);
					    
					    cliente.setEntregas(entregas);
					    
					    
					    System.out.println("Veja os detalhes do seu pedido");
					    pedido.exibirDetalhes();
					    entrega.calcularEntrega();
					    return;
				    }else {
				    	System.out.println("Você não escolheu nenhuma pizza!");
				    }
	}
	
			
		
				}
}
}
	
