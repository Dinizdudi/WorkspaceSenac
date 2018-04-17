package br.com.senac.construtores;

public class Fiat {

	public static void main(String[] args) {
		//Quando usamos um construtor é necessário definir entre parênteses os atributos que foram definidos pelo construtor
		//Atenção, no exemplo da linha abaixo 2003 (int) "Azul" (String) não esquecer de usar "aspas" para o tipo String
		Carro uno = new Carro(2003,"Azul");
		System.out.println("Fiat UNO");
		System.out.println("Ano: " + uno.ano);
		System.out.println("Cor: " + uno.cor);
		System.out.println("Velocidade máxima: " + uno.aceleracao());
	}

}
