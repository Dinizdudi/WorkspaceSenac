/**
 * 
 */
package br.com.senac.poo1;

/**
 * @author José de Assis
 * HERANÇA
 */

// extends (herda atributos e métodos da classe CArro)
public class Aviao extends Carro {
	//criando um novo atributo
	public double envergadura;
	//criando um novo método
	public void aterrizar() {
		System.out.println("----------____________ Aterrizando");
	}
}
