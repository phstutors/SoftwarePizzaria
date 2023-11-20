import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.Random;

public class Entrega {
	private int id;
	private String endereco;
	private int  tempoEntrega = 40;
	private List<Pedido> pedidos;
	
	public Entrega(String endereco,int tempoEntrega) {
		Random random = new Random();
		setId(random.nextInt());
		this.endereco=endereco;
		this.tempoEntrega=tempoEntrega;
		
		
	}
	
	public Entrega() {
		// TODO Auto-generated constructor stub
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


	public void calcularEntrega() {
		LocalTime horaAtual = LocalTime.now(); 
		Duration duracaoEntrega = Duration.ofMinutes(tempoEntrega);
		LocalTime horarioEstimadoEntrega = horaAtual.plus(duracaoEntrega); 
		System.out.println("Hora atual: " + horaAtual);
		System.out.println("Tempo de entrega em minutos: " + tempoEntrega); 
		System.out.println("Horário estimado de entrega: " + horarioEstimadoEntrega);
		}


	public List<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<Pedido> pedidos) {
		this.pedidos = pedidos;
	} 
	}
	
	
