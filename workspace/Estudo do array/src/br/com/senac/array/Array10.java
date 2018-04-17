/**
 * 
 */
package br.com.senac.array;

import java.util.ArrayList;

/**
 * @author José de Assis estudo do array - trabalhando com listas (ArrayList)
 */
public class Array10 {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de array usando ArraList
		// o uso da classe ArrayList permite criar um objeto array sem tamanho pré
		// definido
		ArrayList<String> cores = new ArrayList<>();
		// adicionando(populando a lista de array)
		cores.add("Vermelho");
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Amarelo");
		// exibindo o conteúdo do array
		System.out.println(cores.toString());
		// a linha abaixo adiciona um conteúdo em um índice específico do array (índice,"Cor")
		cores.add(0, "Roxo");
		System.out.println(cores.toString());
		// a linha abaixo adiciona a cor laranja ao índice 2 do array
		cores.add(2, "Laranja");
		System.out.println(cores.toString());
		// a linha abaixo exibe o tamanho do array (equivale ao .length)
		System.out.println("Tamanho do array: " + cores.size());
		// a linha abaixo recupera um conteúdo do array
		System.out.println("Conteúdo do índice[1] do array: " + cores.get(1));
		// pesquisando o índice de um determinado conteúdo
		System.out.println("Índice da cor Azul: " + cores.indexOf("Azul"));
		// verificando se existe um determinado conteúdo no array
		// false (não tem o conteúdo) true (tem o conteúdo)
		System.out.println("Tem a cor Amarelo ? ");
		System.out.println(cores.contains("Amarelo"));
		System.out.println("Tem a cor Magenta ? ");
		System.out.println(cores.contains("Magenta"));
		// removendo um conteúdo do array
		cores.remove("Roxo");
		System.out.println(cores.toString());
	}

}
