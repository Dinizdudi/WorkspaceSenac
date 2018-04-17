package br.com.senac.estruturas;

import java.util.Scanner;

public class TabuadaWhile {

	public static void main(String[] args) {
		int valor;
		int i = 0;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");
		//exemplo de uso da estrutura while
		while (i < 11) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
			i++;
		}

	}

}
