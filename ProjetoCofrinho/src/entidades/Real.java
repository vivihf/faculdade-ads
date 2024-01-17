package entidades;

//extends usado para herdar comportamento da classe Moeda
public class Real extends Moeda {

	@Override // Necessario para sobrescrever método da classe mãe
	public String info() {
		// Descrição da moeda
		return "Real (Moeda corrente usada no Brasil)";
	}

	@Override // Necessario para sobrescrever método da classe mãe
	public double converter() {
		// Não há conversão
		return this.valor;
	}

}
