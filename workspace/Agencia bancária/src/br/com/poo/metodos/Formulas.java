package br.com.poo.metodos;

public class Formulas extends Conta {
	//m�todos com retorno
	//n�o usa o void e come�a com um atributo
	//neste exemplo o retorno � o conte�do de uma vari�vel
	
	/**
	 * Documenta��o autom�tica do m�todo com retorno
	 * @param num1
	 * @param num2
	 * @return total
	 */
	double soma(double num1, double num2) {
		double total = (num1 + num2);
		return total;
	}
	
	//neste exemplo o retorno � um dos par�metros
	double maior(double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
}
