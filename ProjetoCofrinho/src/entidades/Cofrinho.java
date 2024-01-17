package entidades;

import java.util.ArrayList;

public class Cofrinho {
	private ArrayList<Moeda> listaMoedas;
	
	public Cofrinho() {
		// Construtor para iniciar a lista
		this.listaMoedas = new ArrayList<Moeda>();
	}
	
	public Cofrinho(String mensagem) {
		System.out.println(mensagem);
	}
	
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
	}
	
	public void remover(Integer posicao) {
		// Remove da lista a posição -1 por causa da lista começar na posição 0
		this.listaMoedas.remove(posicao-1);
	}
	
	public void listagemMoedas() {
		Integer posicao = 1;
		
		for (Moeda moeda : this.listaMoedas) {
			// [posição da moeda] -  [Descrição da moeda] | Valor: [valor não convertido]
			System.out.println(posicao + " - " + moeda.info() + " | Valor: " + String.valueOf(moeda.valor));
			posicao++;
		}
	}
	
	public void totalConvertido() {
		Double total = 0.0;
		
		// Percorre todas as moedas da lista
		for (Moeda moeda : this.listaMoedas) {
			// Adiciona o valor convertido ao total
			total += moeda.converter();
		}
		
		System.out.println("O valor total convertido é de R$" + String.valueOf(total));
	}
}