/**
 * 
 */
package br.com.senac.array;

/**
 * @author Jos� de Assis
 * Estudo do Array - criando um array simples de tamanho vari�vel
 */
public class Array1 {

	public static void main(String[] args) {
		System.out.println("Array Simples");
		System.out.println("");
		System.out.println("Exemplo 1: (Sem array)");
		String time1 = "Palmeiras";
		String time2 = "Corinthians";
		String time3 = "S�o Paulo";
		String time4 = "Santos";
		System.out.println("Time: " + time2);
		System.out.println("");
		System.out.println("Exemplo 2: (Com array)");
		// a linha abaixo cria um array simples de tamanho 4
		String[] times = {"Palmeiras","Corinthians","S�o Paulo","Santos","Portuguesa"};
		// a linha abaixo recupera o conte�do do array times cujo �ndice � 1
		System.out.println("Time: " + times[1]);
		System.out.println("");
		System.out.println("Exemplo 3: (Modificando um conte�do do array)");
		times[1] = "Flamengo";
		System.out.println("Time: " + times[1]);
		System.out.println("");
		//a linha abaixo retorna o tamanho do array
		System.out.println("Tamanho do array: " + times.length);
		//a linha abaixo recupera o conte�do do array times cujo �ndice 4 foi acrescentado
		System.out.println("Time: " + times[4]);
	}

}





