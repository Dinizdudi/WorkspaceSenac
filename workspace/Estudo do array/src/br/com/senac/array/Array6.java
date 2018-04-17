/**
 * 
 */
package br.com.senac.array;

import java.util.Arrays;

/**
 * @author Jos� de Assis
 * estudo do array - uso da classe Arrays
 */
public class Array6 {

	public static void main(String[] args) {
		String[] times = {"Palmeiras","Corinthians","S�o Paulo","Santos","Portuguesa"};
		//a linha abaixo usa a classe Arrays para exibir todo o conte�do do array
		System.out.println(Arrays.toString(times));
		System.out.println("time: " + times[0]);
		//Usando a classe Arrays para ordenar o conte�do do array
		//Arrays.sort(nome_array, �ndice de in�cio, �ndice final);
		//Aten��o!!! este comando tamb�m muda os �ndices do array
		Arrays.sort(times, 0, times.length);		
		System.out.println(Arrays.toString(times));
		System.out.println("time: " + times[0]);

	}

}
