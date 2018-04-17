package br.com.java.poo.polimorfismo;

public class Cessna {

	public static void main(String[] args) {
		Aviao c182 = new Aviao();
		c182.combustivel = "AVGAS";
		c182.ano = 2005;
		System.out.println("Cessna C182");
		System.out.println("Ano: " + c182.ano);
		System.out.println("Combustível: " + c182.combustivel);
		c182.ligar();
		c182.acelerar();

	}

}
