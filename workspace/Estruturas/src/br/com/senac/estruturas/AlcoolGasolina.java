package br.com.senac.estruturas;

import java.util.Scanner;

public class AlcoolGasolina {

	public static void main(String[] args) {
		double alcool, gasolina;
		Scanner teclado = new Scanner(System.in);
		System.out.println("Calculadora FLEX");
		System.out.print("valor do �lcool: ");
		alcool = teclado.nextDouble();
		System.out.print("valor do gasolina: ");
		gasolina = teclado.nextDouble();
		if (alcool <= 0.7 * gasolina) {
			System.out.println("Abaste�a com �lcool");
		} else {
			System.out.println("Abaste�a com gasolina");
		}
	}

}
