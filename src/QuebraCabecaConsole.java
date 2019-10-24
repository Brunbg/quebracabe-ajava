/**
 * IFPB - TSI/POO
 * Prof. Fausto Ayres
 * 
 * Aplicação console do Quebra-Cabeca
 * 
 */

import java.util.Scanner;

public class QuebraCabecaConsole {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		QuebraCabeca jogo = new QuebraCabeca(3, null);
		jogo.iniciar();
		System.out.println(jogo);
		
		Scanner teclado = new Scanner(System.in);
		int linhaorigem, colunaorigem, linhadestino, colunadestino;
		while(!jogo.finalizado()) {
			System.out.print("Digite a linha (origem):");
			linhaorigem = teclado.nextInt();
			System.out.print("Digite a coluna (origem): ");
			colunaorigem = teclado.nextInt();
			System.out.print("Digite a linha (destino):");
			linhadestino = teclado.nextInt();
			System.out.print("Digite a coluna (destino): ");
			colunadestino = teclado.nextInt();
			
			try {
				jogo.jogar(linhaorigem,colunaorigem,linhadestino,colunadestino);
				System.out.println(jogo);
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			


		}
		System.out.println("\n GAME OVER !!");
	}

}