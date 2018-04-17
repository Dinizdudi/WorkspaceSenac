/**
 * 
 */
package br.com.senac.array;

import java.util.Random;

/**
 * @author José de Assis Estudo do array - Exemplo prático do "PODER" do array
 * Jogo de cartas
 */
public class Array2 {

	public static void main(String[] args) {
		//Copas (alt + 3) Ouros (alt + 4) Paus (alt + 5) Espada (alt + 6)
		String[] nipes = { "♥", "♦", "♣", "♠" };
		String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		Random sorteio = new Random();
		//a linha abaixo usa o objeto sorteio para gerar um número aleatório entre (0 e 12) e atribui este número a variável indice_faces
		int indice_faces = sorteio.nextInt(faces.length);
		int indice_nipes = sorteio.nextInt(nipes.length);
		System.out.println(faces[indice_faces] + " " + nipes[indice_nipes]);

	}

}
