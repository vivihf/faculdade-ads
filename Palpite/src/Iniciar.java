
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calculo de área
 * 
 * 2 * raio * pi
 * pi = 3.14
 *
 */

public class Iniciar {
	

	public static void main(String[] args) {
		
		///Double raio;
		
		/////
		//Scanner entradaTeclado = new Scanner(System.in);
		///raio = entradaTeclado.nextDouble();
		//////
		///Double pi = 3.14;
		///Double areaCirculo = (2*raio*pi);
		
		///System.out.println(areaCirculo);
				
		/// if ([condicao]){
		/// }
		/// else if([condicao]) {
		/// }
		/// else {
		/// }
		
		System.out.println("Digite seu palpite");
		Scanner entradaTeclado = new Scanner(System.in);
		Integer palpite;
		palpite = entradaTeclado.nextInt();
		
		if (palpite == 10000){
			System.out.println("Resposta Correta!");
		}
		else if (palpite  <10000){
			System.out.println("Resposta Incorreta, palpite abaixo do valor correto.");
			
		}
		else {
			System.out.println("Resposta Incorreta, palpite acima do valor correto.");
			
		}
		
	}

}
