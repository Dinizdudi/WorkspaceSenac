/**
 * 
 */
package br.com.senac.array;

/**
 * @author José de Assis
 * estudo do array - uso das estruturas for e foreach para percorrer e recuperar conteúdo do array 
 */
public class Array5 {

	public static void main(String[] args) {
		int[] pares = {2,4,6,8};
		//uso da estrutura for
		System.out.println("Exemplo 1: laço for comum");
		for (int i = 0; i < pares.length; i++) {
			System.out.println("pares[" + i + "] = " + pares[i]);
		}
		System.out.println("");
		//uso da estrutura foreach
		System.out.println("Exemplo 2: laço foreach (simplificação do laço for)");
		//neste caso não podemos concatenar a variável i como no exemplo anterior
		for (int i : pares) {
			System.out.println(i); //neste caso não usamos[]
		}
		
	}

}
