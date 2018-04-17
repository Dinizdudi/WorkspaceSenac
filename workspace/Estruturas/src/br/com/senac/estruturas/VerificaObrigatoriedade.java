package br.com.senac.estruturas;

import java.util.Scanner;

public class VerificaObrigatoriedade {

	public static void main(String[] args) {
		String nome;
		int idade;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a sua idade: ");
		idade = teclado.nextInt();
		System.out.println("");
		System.out.println("________________________");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		if (idade < 16) {
			System.out.println("PROIBIDO VOTAR");
		} else if (idade == 16 || idade == 17 || idade > 70) {
			System.out.println("VOTO FACULTATIVO");
		} else {
			System.out.println("VOTO OBRIGATÓRIO");
		}
	}

}
