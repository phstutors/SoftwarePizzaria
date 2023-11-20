import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Pizza {
	private int id;
	private String sabor;
	private String tamanho;
	private double preco;
	private String borda = "tradicional";

	public Pizza(String sabor,String tamanho) {
		Random random = new Random();
		setId(random.nextInt()+1);
		this.sabor= sabor;
		this.tamanho= tamanho;
	}
	public abstract void adicionarBordasRecheadas();
	
	public Pizza() {	
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void addPizza() {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.print("Digite o tamanho da Pizza: ");
		String tamanhoPizza = sc.nextLine();
		System.out.print("Digite o preço da Pizza: ");
		double precoPizza = sc.nextDouble();
		setId(random.nextInt());

		setPreco(precoPizza);
		setTamanho(tamanhoPizza);
	}
	public String getBorda() {
		return borda;
	}
	public void setBorda(String borda) {
		this.borda = borda;
	}

}
