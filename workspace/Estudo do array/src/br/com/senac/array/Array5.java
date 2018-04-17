/**
 * 
 */
package br.com.senac.array;

/**
 * @author Jos� de Assis
 * estudo do array - uso das estruturas for e foreach para percorrer e recuperar conte�do do array 
 */
public class Array5 {

	public static void main(String[] args) {
		int[] pares = {2,4,6,8};
		//uso da estrutura for
		System.out.println("Exemplo 1: la�o for comum");
		for (int i = 0; i < pares.length; i++) {
			System.out.println("pares[" + i + "] = " + pares[i]);
		}
		System.out.println("");
		//uso da estrutura foreach
		System.out.println("Exemplo 2: la�o foreach (simplifica��o do la�o for)");
		//neste caso n�o podemos concatenar a vari�vel i como no exemplo anterior
		for (int i : pares) {
			System.out.println(i); //neste caso n�o usamos[]
		}
		
	}

}
