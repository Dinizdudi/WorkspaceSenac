package br.com.poo.metodos;

public class Conta {
	String cliente;
	double saldo;
	
	//método sem retorno
	void exibirSaldo() {
		System.out.println("R$ " + saldo);
	}
	
	//método sem retorno com passagem de parâmetros
	//neste caso criamos um atributo dentro dos parenteses
	void sacar(double valor) {
		saldo -= valor; //-= equivale a saldo = saldo - valor
	}
	
	void depositar(double valor) {
		saldo += valor; //-= equivale a saldo = saldo + valor
	}
	
	//método especial que usa a própria classe como passagem de parâmetros para referenciar a conta de destino
	//destino é um objeto criado para fazer a operação de saque e depósito
	//neste caso o objeto destino foi criado no próprio método
	void transferir(Conta destino, double valor) {
		this.sacar(valor); //primeiro o valor sai da conta
		destino.depositar(valor);
	}
	
}
