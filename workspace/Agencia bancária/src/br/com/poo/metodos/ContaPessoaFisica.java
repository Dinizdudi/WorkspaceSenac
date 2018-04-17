package br.com.poo.metodos;

import java.util.Date;

public class ContaPessoaFisica {

	public static void main(String[] args) {
		//a linha abaixo exibe a data e hora do sistema
		Date data = new Date();
		Conta cc1001 = new Conta();
		cc1001.cliente = "Leandro Ramos";
		cc1001.saldo = 10000;
		System.out.println(data);
		System.out.println("Cliente: " + cc1001.cliente);
		cc1001.exibirSaldo();
		//executando um método com parâmetros
		//neste caso precisamos fornecer o valor dentro de parenteses
		//cc1001.sacar(1000);
		//cc1001.exibirSaldo();
		//cc1001.depositar(5000);
		//cc1001.exibirSaldo();
		System.out.println("");
		//Criando um segundo objeto na mesma classe
		Conta cc1002 = new Conta();
		cc1002.cliente = "Robson Vaamonde";
		cc1002.saldo = 7000;
		System.out.println(data);
		System.out.println("Cliente: " + cc1002.cliente);
		cc1002.exibirSaldo();
		System.out.println("___________________________");
		System.out.println("");
		//a linha abaixo transfere o valor de uma conta para outra
		//usamos o método transferir para informar conta de destino e valor a ser transferido 
		cc1001.transferir(cc1002, 4000);
		System.out.println(data);
		System.out.println("Cliente " + cc1001.cliente);
		cc1001.exibirSaldo();
		System.out.println("");
		System.out.println(data);
		System.out.println("Cliente " + cc1002.cliente);
		cc1002.exibirSaldo();
		System.out.println("___________________________");
		System.out.println("");
		System.out.println("Relatório Gerencial");
		Formulas contas = new Formulas();
		//a linha abaixo cria uma variável e atribui a esta variável o retorno do método
		double relatorio1 = contas.soma(cc1001.saldo, cc1002.saldo);
		System.out.println("Saldo total nas contas: " + relatorio1);
		double relatorio2 = contas.maior(cc1001.saldo, cc1002.saldo);
		System.out.println("Conta com maior saldo: " + relatorio2);
	}
	

}
