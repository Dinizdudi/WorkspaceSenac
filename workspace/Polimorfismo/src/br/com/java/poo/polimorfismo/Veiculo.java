package br.com.java.poo.polimorfismo;

/* Super Classe */

public class Veiculo {
	String combustivel;
	int ano;
	
	void ligar() {
		System.out.println("engine ON ......");
	}
	
	void desligar() {
		System.out.println("engine OFF .");
	}
	//mudaremos a forma deste método (polimorfismo)
	void acelerar() {
		System.out.println("vrummmmm");
	}
}
