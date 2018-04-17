/**
 * 
 */
package br.com.senac.array;

import java.util.ArrayList;

/**
 * @author Jos� de Assis estudo do array - trabalhando com listas (ArrayList)
 */
public class Array10 {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de array usando ArraList
		// o uso da classe ArrayList permite criar um objeto array sem tamanho pr�
		// definido
		ArrayList<String> cores = new ArrayList<>();
		// adicionando(populando a lista de array)
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Amarelo");
		// exibindo o conte�do do array
		System.out.println(cores.toString());
		// a linha abaixo adiciona um conte�do em um �ndice espec�fico do array (�ndice,"Cor")
		cores.add(0, "Roxo");
		System.out.println(cores.toString());
		// a linha abaixo adiciona a cor laranja ao �ndice 2 do array
		cores.add(2, "Laranja");
		System.out.println(cores.toString());
		// a linha abaixo exibe o tamanho do array (equivale ao .length)
		System.out.println("Tamanho do array: " + cores.size());
		// a linha abaixo recupera um conte�do do array
		System.out.println("Conte�do do �ndice[1] do array: " + cores.get(1));
		// pesquisando o �ndice de um determinado conte�do
		System.out.println("�ndice da cor Azul: " + cores.indexOf("Azul"));
		// verificando se existe um determinado conte�do no array
		// false (n�o tem o conte�do) true (tem o conte�do)
		System.out.println("Tem a cor Amarelo ? ");
		System.out.println(cores.contains("Amarelo"));
		System.out.println("Tem a cor Magenta ? ");
		System.out.println(cores.contains("Magenta"));
		// removendo um conte�do do array
		cores.remove("Roxo");
		System.out.println(cores.toString());
	}

}
