/**
 * 
 */
package br.com.senac.poo1;

/**
 * @author jose.afilho3 Classe para construção do objeto fusca
 */
public class Fusca {

	public static void main(String[] args) {
		// a linha abaixo cria um objeto de nome fusquinha tendo como modelo a classe
		// carro
		Carro fusquinha = new Carro();
		fusquinha.ano = 1967;
		fusquinha.cor = "azul";// usar aspas para atribuir valor a variável do tipo String
		System.out.println("Carro: fusca");
		System.out.println("Ano: " + fusquinha.ano);
		System.out.println("Cor: " + fusquinha.cor);
		fusquinha.acelerar();
	}

}
