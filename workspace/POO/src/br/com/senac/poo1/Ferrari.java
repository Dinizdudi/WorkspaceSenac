package br.com.senac.poo1;

public class Ferrari {

	public static void main(String[] args) {
		Carro spider = new Carro();
		spider.ano = 2012;
		spider.cor = "vermelho";
		System.out.println("Carro: Ferrari");
		System.out.println("Ano: " + spider.ano);
		System.out.println("Cor: " + spider.cor);
		spider.acelerar();
	}

}
