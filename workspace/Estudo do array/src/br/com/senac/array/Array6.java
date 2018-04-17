/**
 * 
 */
package br.com.senac.array;

import java.util.Arrays;

/**
 * @author José de Assis
 * estudo do array - uso da classe Arrays
 */
public class Array6 {

	public static void main(String[] args) {
		String[] times = {"Palmeiras","Corinthians","São Paulo","Santos","Portuguesa"};
		//a linha abaixo usa a classe Arrays para exibir todo o conteúdo do array
		System.out.println(Arrays.toString(times));
		System.out.println("time: " + times[0]);
		//Usando a classe Arrays para ordenar o conteúdo do array
		//Arrays.sort(nome_array, índice de início, índice final);
		//Atenção!!! este comando também muda os índices do array
		Arrays.sort(times, 0, times.length);		
		System.out.println(Arrays.toString(times));
		System.out.println("time: " + times[0]);

	}

}
