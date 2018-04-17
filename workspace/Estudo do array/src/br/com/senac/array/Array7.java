/**
 * 
 */
package br.com.senac.array;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author José de Assis
 * exemplo de uso da classe Arrays
 */
public class Array7 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		String[] nomes = new String[5];
		for (int i = 0; i < nomes.length; i++) {
			System.out.println("Digite o nome:");
			nomes[i] = teclado.nextLine();
		}
		System.out.println("");
		Arrays.sort(nomes, 0, nomes.length);
		System.out.println(Arrays.toString(nomes));
	}

}
