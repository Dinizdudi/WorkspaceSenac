package br.com.agenda.formulario;

import java.sql.*;
import br.com.agenda.dal.ModuloConexao;

public class Teste {

	public static void main(String[] args) {
		Connection conexao = null;
		//conectar com o banco
		conexao = ModuloConexao.conector();
		if (conexao != null) {
			System.out.println("conectado");
		} else {
			System.out.println("ERRO de conexão");
		}

	}

}
