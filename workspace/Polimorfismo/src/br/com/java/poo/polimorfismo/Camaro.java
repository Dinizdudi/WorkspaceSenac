package br.com.java.poo.polimorfismo;

public class Camaro {

	public static void main(String[] args) {
		Carro z28 = new Carro();
		z28.combustivel = "Gasolina";
		z28.ano = 1982;
		System.out.println("Camaro modelo Z28");
		System.out.println("Ano: " + z28.ano);
		System.out.println("Combustível: " + z28.combustivel);
		z28.ligar();
		z28.acelerar();
	}

}
