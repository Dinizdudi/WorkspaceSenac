/**
 * 
 */
package br.com.agenda.dal;

import java.sql.*; //importar recursos para trabalhar com banco de dados

/**
 * @author José de Assis
 * Módulo responsável pela conexão com o banco de dados
 */

public class ModuloConexao {
	//criando um método estático com retorno usando a classe Connection que faz parte do pacote java.sql.*
	public static Connection conector() {
		//criando uma variável especial referenciada(tipada) pela classe Connection para estabelecer a conexão com o banco atribuimos o valor null para não estabelecer uma conexão sem a devida permissão (lembrar da GELADEIRA)
		Connection conexao = null;
		//Criando uma variável do tipo String e atribuindo a ela o driver correspondente ao tipo de banco (não esquecer de importar antes este driver)
		String driver = "com.mysql.jdbc.Driver";
		//Criando uma variável do tipo String e atribuindo a ela o caminho para "chegar" ao banco de dados
		// 10.26.49.47 (ip do servidor de banco de dados, se for usar um servidor WEB mudar para o link que aponta ao servidor, se for usar local mudar para o ip 127.0.0.1 ou o nome localhost)
		// 3306 (porta padrão do MySQL)
		// agenda (nome do banco de dados)
		// ?useSSL="false" (ignorar avisos quando não usamos criptografia na transferência de dados)
		String url = "jdbc:mysql://10.26.49.52:3306/agenda?useSSL=false";
		//criando duas variáveis para autenticação no banco de dados
		String user = "admin";
		String password = "123";
		//estabelecendo a conexão
		//sempre tratar exceções ao tentar conectar o banco de dados
		//try (na tentativa de estabelecer a conexão)
		try {
			//se tudo OK conectar
			Class.forName(driver); //usar driver de conexão
			//a linha abaixo atribui os parametros a variável conexao estabelecendo a conexão com o banco 
			conexao = DriverManager.getConnection(url,user,password);
			return conexao; //abre a conexão com o banco quando solicitado
		} catch (Exception e) {
			//se ocorrer uma exceção mostrar a exceção e não conectar
			//System.out.println(e);
			return null; // lembrar da GELADEIRA (manter porta fechada)
		}
	}
}





