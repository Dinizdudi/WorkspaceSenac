package br.com.senac.construtores;

public class Fiat {

	public static void main(String[] args) {
		//Quando usamos um construtor � necess�rio definir entre par�nteses os atributos que foram definidos pelo construtor
		//Aten��o, no exemplo da linha abaixo 2003 (int) "Azul" (String) n�o esquecer de usar "aspas" para o tipo String
		Carro uno = new Carro(2003,"Azul");
		System.out.println("Fiat UNO");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		System.out.println("Velocidade m�xima: " + uno.aceleracao());
	}

}
