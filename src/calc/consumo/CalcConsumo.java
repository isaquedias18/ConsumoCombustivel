package calc.consumo;
import consumo.Consumo;

public class CalcConsumo {

	public static void main(String[] args) {
		
		Consumo consumo = new Consumo();
		
		consumo.distancia();
		consumo.consumoMedio();
		consumo.preco();

		consumo.exibir();
	}
}
