package consumo;
import javax.swing.JOptionPane;

public class Consumo {
	
	/*Atributos da Classe*/
	private int distancia;
	private double consumoMedio;
	private double preco;
	private double calcConsumo;
	private double calcPreco;
	private int exibir;
	
	/*Métodos*/
	public int getDistancia() {
		return distancia;
	}

	public void setDistancia(int d) {
		this.distancia = d;
	}

	public double getConsumoMedio() {
		return consumoMedio;
	}

	public void setConsumoMedio(double cm) {
		this.consumoMedio = cm;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double p) {
		this.preco = p;
	}

	public void distancia() {
		distancia = Integer.parseInt(JOptionPane.showInputDialog("Insira a distância(km):"));
		
	}

	public void consumoMedio() {
		consumoMedio = Double.parseDouble(JOptionPane.showInputDialog("Insira o consumo médio do veículo(km/l):"));
	}
	
	public void preco() {
		preco = Double.parseDouble(JOptionPane.showInputDialog("Insira o preço do Combustível(l):"));
	}
	
	
	/*Método para exibir na tela os resultados!*/
	public void exibir() {
		exibir = Integer.parseInt(JOptionPane.showInputDialog("Deseja Calcular a viagem de ida e volta? Sim(1) Não(2)"));
		if(this.exibir == 1) {
			calcConsumo = (this.distancia * 2) / this.consumoMedio;
			calcPreco = (this.distancia * 2) / this.consumoMedio * this.preco;
			
			JOptionPane.showMessageDialog(null, "Consumo(l): " + this.calcConsumo);
			JOptionPane.showMessageDialog(null, "Preço(R$): " + this.calcPreco);
			
		}else if(this.exibir == 2) {
			calcConsumo = this.distancia / this.consumoMedio;
			calcPreco = (this.distancia * this.preco) / this.consumoMedio;
			
			JOptionPane.showMessageDialog(null, "Consumo(l): " + this.calcConsumo);
			JOptionPane.showMessageDialog(null, "Preço(R$): " + this.calcPreco);
		}
		
	
	}

}
