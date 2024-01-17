import java.util.Scanner;

import entidades.Cofrinho;
import entidades.Dolar;
import entidades.Euro;
import entidades.Moeda;
import entidades.Real;

public class InicioCofrinho {

	public static void main(String[] args) {
		Cofrinho cofrinho = new Cofrinho();
		new Cofrinho("Bem vindo ao cofrinho");
		
		Scanner leitor;
		
		String opcao;
		while(true) {
			// Cria um leitor de texto do usuário
			leitor = new Scanner(System.in);
			
			//Menu principal
			System.out.println("O que deseja fazer?");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Exibir total (em Reais)");
			System.out.println("5 - Sair");
			
			// Lê a opção selecionada
			opcao = leitor.nextLine();
			
			if(opcao.equals("1")) {
				adicionarMoeda(cofrinho, leitor);
			}
			else if(opcao.equals("2")) {
				removerMoeda(cofrinho, leitor);
			}
			else if(opcao.equals("3")) {
				listarMoedas(cofrinho);
			}
			else if(opcao.equals("4")) {
				exibirTotal(cofrinho);
			}
			else if(opcao.equals("5")) {
				System.out.println("Até mais.");
				break;
			}
			else { // Caso não selecione opção valida
				System.out.println("Opção inválida.");
			}
			
			// Reinicia o leitor para não permanecer com os valores passados
			leitor.reset();
		}
		
		// Finaliza a instancia do leitor
		leitor.close();
	}
	
	private static void adicionarMoeda(Cofrinho cofrinho, Scanner leitor) {
		Moeda moeda;
		
		while(true) {
			// Menu de adição de moeda
			System.out.println("Qual moeda deseja adicionar?");
			System.out.println("1 - Dolar");
			System.out.println("2 - Euro");
			System.out.println("3 - Real");
			
			// Lê a opção selecionada
			String opcaoMoeda = leitor.nextLine();
			
			if (opcaoMoeda.equals("1")) {
				moeda = new Dolar();
			}
			else if (opcaoMoeda.equals("2")) {
				moeda = new Euro();
			}
			else if (opcaoMoeda.equals("3")) {
				moeda = new Real();
			}
			else { // Caso não selecione opção valida
				System.out.println("Opção inválida.");
				// continue força uma nova iteração do while
				continue;
			}
			
			// Lê valor da moeda a ser cadastrada
			System.out.println("Insira o valor:");
			Double valorMoeda = leitor.nextDouble();
			moeda.valor = valorMoeda;
			cofrinho.adicionar(moeda);
			
			// Interrompe a execução do while para sair
			break;
		}
		
		System.out.println("Moeda adicionada!");
	}

	private static void removerMoeda(Cofrinho cofrinho, Scanner leitor) {
		System.out.println("Qual moeda da lista quer remover?");
		// Lista moedas disponíveis com indice na lista
		cofrinho.listagemMoedas();
		
		// Lê posição a ser excluída
		Integer posicao = leitor.nextInt();
		
		cofrinho.remover(posicao);
		
		System.out.println("Moeda removida!");
	}
	
	private static void listarMoedas(Cofrinho cofrinho) {
		cofrinho.listagemMoedas();
	}

	private static void exibirTotal(Cofrinho cofrinho) {
		cofrinho.totalConvertido();
	}
}
