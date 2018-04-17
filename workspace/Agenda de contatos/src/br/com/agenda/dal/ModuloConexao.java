/**
 * 
 */
package br.com.agenda.dal;

import java.sql.*; //importar recursos para trabalhar com banco de dados

/**
 * @author Jos� de Assis
 * M�dulo respons�vel pela conex�o com o banco de dados
 */

public class ModuloConexao {
	//criando um m�todo est�tico com retorno usando a classe Connection que faz parte do pacote java.sql.*
	public static Connection conector() {
		//criando uma vari�vel especial referenciada(tipada) pela classe Connection para estabelecer a conex�o com o banco atribuimos o valor null para n�o estabelecer uma conex�o sem a devida permiss�o (lembrar da GELADEIRA)
		Connection conexao = null;
		//Criando uma vari�vel do tipo String e atribuindo a ela o driver correspondente ao tipo de banco (n�o esquecer de importar antes este driver)
		String driver = "com.mysql.jdbc.Driver";
		//Criando uma vari�vel do tipo String e atribuindo a ela o caminho para "chegar" ao banco de dados
		// 10.26.49.47 (ip do servidor de banco de dados, se for usar um servidor WEB mudar para o link que aponta ao servidor, se for usar local mudar para o ip 127.0.0.1 ou o nome localhost)
		// 3306 (porta padr�o do MySQL)
		// agenda (nome do banco de dados)
		// ?useSSL="false" (ignorar avisos quando n�o usamos criptografia na transfer�ncia de dados)
		String url = "jdbc:mysql://10.26.49.52:3306/agenda?useSSL=false";
		//criando duas vari�veis para autentica��o no banco de dados
		String user = "admin";
		String password = "123";
		//estabelecendo a conex�o
		//sempre tratar exce��es ao tentar conectar o banco de dados
		//try (na tentativa de estabelecer a conex�o)
		try {
			//se tudo OK conectar
			Class.forName(driver); //usar driver de conex�o
			//a linha abaixo atribui os parametros a vari�vel conexao estabelecendo a conex�o com o banco 
			conexao = DriverManager.getConnection(url,user,password);
			return conexao; //abre a conex�o com o banco quando solicitado
		} catch (Exception e) {
			//se ocorrer uma exce��o mostrar a exce��o e n�o conectar
			//System.out.println(e);
			return null; // lembrar da GELADEIRA (manter porta fechada)
		}
	}
}





