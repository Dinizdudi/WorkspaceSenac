/**
 * 
 */
package br.com.senac.construtores;

/**
 * @author Jos� de Assis
 * estudo do construtor
 */
public class Carro {
	int ano;
	String cor;
	double velMax = 170;
	
	public Carro(int ano, String cor) {
		this.ano = ano;
		this.cor = cor;
	}
	
	//criando um m�todo com retorno (sem uso do void)
	double aceleracao() {
		return velMax;
	}
	
}
