package br.com.senac.estruturas;

import java.util.Scanner;

public class VerificaMaioridade {

	public static void main(String[] args) {
		String nome;
		byte idade;
		//a linha abaixo cria um objeto de nome teclado tendo como modelo a classe Scanner
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		//a linha abaixo usa o objeto teclado para armazenar o nome digitado na variável nome
		nome = teclado.nextLine();//nextLine (tipo String)
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextByte();//nextInt (tipo inteiro)
		System.out.println("");
		System.out.println("________________________");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		//a estrutura abaixo verifica a maioridade
		if (idade < 18) {
			System.out.println("MENOR DE IDADE");
		} else {
			System.out.println("MAIOR DE IDADE");
		}
	}

}
