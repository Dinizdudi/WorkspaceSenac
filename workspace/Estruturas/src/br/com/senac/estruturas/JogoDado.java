package br.com.senac.estruturas;

import java.util.Random;
import java.util.Scanner;

public class JogoDado {

	public static void main(String[] args) {
		// a linha abaixo cria uma variável que aceita um único caractere da tabela
		// ASCII
		// para atribuir um caractere a variável do tipo char usamos 'aspas simples'
		char opcao;
		Scanner teclado = new Scanner(System.in);
		System.out.println("_________Jogo do DADO________");
		System.out.println("");
		// exemplo de uso da estrutura (do while)
		do {
			// Random é uma classe que gera números aleatórios
			Random sorteio = new Random();
			int dado = sorteio.nextInt(6) + 1; //(gera números entre 0 e 5)
			System.out.println("Face sorteada: " + dado);
			System.out.print("Deseja jogar novamente(s/n) ");
			//charAt(0) -> obtem  apenas o 1º caractere digitado (ex: sim)
			opcao = teclado.next().charAt(0);
		} while (opcao == 's');
	}

}
