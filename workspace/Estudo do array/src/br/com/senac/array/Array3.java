/**
 * 
 */
package br.com.senac.array;

/**
 * @author José de Assis
 * estudo do array - criando um objeto array
 */
public class Array3 {

	public static void main(String[] args) {
		//instanciando (criando) um objeto array de tamanho FIXO 5 
		int[] impares = new int[5];
		impares[0] = 1;
		impares[1] = 3;
		impares[2] = 5;
		impares[3] = 7;
		impares[4] = 9;
		//isto equivale a: int impares[] = {1,3,5,7,9};
		System.out.println("Número: " + impares[3]);
		System.out.println("Tamanho do array: " + impares.length);
		impares[3] = 11;
		System.out.println("Número: " + impares[3]);
		//a linha abaixo gera um erro, pois o array foi criado com tamanho 5
		impares[5] = 13;
		System.out.println("Número: " + impares[5]);
	}

}
