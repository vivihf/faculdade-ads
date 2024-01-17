package entidades;

// extends usado para herdar comportamento da classe Moeda
public class Dolar extends Moeda {

	@Override // Necessario para sobrescrever método da classe mãe
	public String info() {
		// Descrição de conversão para real
		return "Dolar (equivale a 5 Reais)";
	}

	@Override // Necessario para sobrescrever método da classe mãe
	public double converter() {
		// Multiplica o valor de 1 para 5
		return this.valor * 5;
	}
}
