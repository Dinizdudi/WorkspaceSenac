package br.com.poo.metodos;

public class Conta {
	String cliente;
	double saldo;
	
	//m�todo sem retorno
	void exibirSaldo() {
		System.out.println("R$ " + saldo);
	}
	
	//m�todo sem retorno com passagem de par�metros
	//neste caso criamos um atributo dentro dos parenteses
	void sacar(double valor) {
		saldo -= valor; //-= equivale a saldo = saldo - valor
	}
	
	void depositar(double valor) {
		saldo += valor; //-= equivale a saldo = saldo + valor
	}
	
	//m�todo especial que usa a pr�pria classe como passagem de par�metros para referenciar a conta de destino
	//destino � um objeto criado para fazer a opera��o de saque e dep�sito
	//neste caso o objeto destino foi criado no pr�prio m�todo
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //primeiro o valor sai da conta
		destino.depositar(valor);
	}
	
}
