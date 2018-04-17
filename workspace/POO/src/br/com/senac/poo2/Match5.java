package br.com.senac.poo2;

import br.com.senac.poo1.Carro;

public class Match5 {

	public static void main(String[] args) {
		Carro speed = new Carro();
		speed.ano = 1986;
		speed.cor = "Branco";
		System.out.println("Carro: Match 5");
		System.out.println("Ano: " + speed.ano);
		System.out.println("Cor: " + speed.cor);
		speed.acelerar();
	}

}
