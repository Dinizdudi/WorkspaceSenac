package br.com.senac.estruturas;

import java.text.DecimalFormat;
import java.util.Scanner;

public class CalculadoraMedia {

	public static void main(String[] args) {
		//variáveis
		String nome;
		double nota1, nota2, resultado;
		//objetos
		Scanner teclado = new Scanner(System.in);
		//criando um objeto para formatar resultados
		//Dica: ("R$ 0.00")
		DecimalFormat formatador = new DecimalFormat("#0.00");
		//entrada
		System.out.print("Digite o seu nome: ");
		nome = teclado.nextLine();
		System.out.print("Digite a nota1: ");
		nota1 = teclado.nextDouble();
		System.out.print("Digite a nota2: ");
		nota2 = teclado.nextDouble();
		//processamento
		resultado = (nota1 + nota2) / 2;
		//Saída
		System.out.println("");
		System.out.println("=========================");
		System.out.println("Aluno: " + nome);
		//usamos abaixo o objeto formatador para formatar o resultado
		System.out.println("Média: " + formatador.format(resultado));
		//estrutura condicional encadeada para determinar o status
		if (resultado <= 2) {
			System.out.println("REPROVADO");
		} else if(resultado >= 5) {
			System.out.println("APROVADO");
		} else {
			System.out.println("RECUPERAÇÃO");
		}

	}

}
