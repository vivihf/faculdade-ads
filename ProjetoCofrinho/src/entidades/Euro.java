package entidades;

//extends usado para herdar comportamento da classe Moeda
public class Euro extends Moeda {

	@Override // Necessario para sobrescrever método da classe mãe
	public String info() {
		// Descrição de conversão para real
		return "Euro (equivale a 6,5 Reais)";
	}

	@Override // Necessario para sobrescrever método da classe mãe
	public double converter() {
		// Multiplica o valor de 1 para 6.5
		return this.valor * 6.5;
	}
}
