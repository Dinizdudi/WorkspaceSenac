package br.com.poo.metodos;

public class Formulas extends Conta {
	//métodos com retorno
	//não usa o void e começa com um atributo
	//neste exemplo o retorno é o conteúdo de uma variável
	
	/**
	 * Documentação automática do método com retorno
	 * @param num1
	 * @param num2
	 * @return total
	 */
	double soma(double num1, double num2) {
		double total = (num1 + num2);
		return total;
	}
	
	//neste exemplo o retorno é um dos parâmetros
	double maior(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
