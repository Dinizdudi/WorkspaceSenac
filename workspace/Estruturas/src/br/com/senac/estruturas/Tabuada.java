package br.com.senac.estruturas;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		int valor;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite o valor da tabuada: ");
		valor = teclado.nextInt();
		System.out.println("");
		//exemplo de uso da estrutura for
		for (int i = 0; i < 11; i++) {
			System.out.println(valor + " x " + i + " = " + (valor * i));
		}
	}

} 
