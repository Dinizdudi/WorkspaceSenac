package br.com.agenda.formulario;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.sql.*;
import br.com.agenda.dal.ModuloConexao;

public class Contatos extends JFrame {

	/* Variáveis e objetos usados para conexão com o banco */
	// criando uma variável para estabelecer a conexão com o banco
	Connection conexao = null;
	// "Command" executa comandos SQL
	// pst -> variável de apoio a execução dos comandos sql
	PreparedStatement pst = null;
	// Recuperar os valores do banco
	// rs -> variável de apoio
	// *** todas as variáveis são referenciadas pelas classes principais
	ResultSet rs = null;
	
	/* Métodos */
	
	/* Método pesquisar */
	private void pesquisar() {
		String pesquisar = "select * from tb_contatos where id = ?";
		try {
			// a linha abaixo irá executar a instrução
			pst = conexao.prepareStatement(pesquisar);
			// substituir o argumento ? pelo conteúdo da caixa de texto txtId (1 é o primeiro campo da tabela)
			pst.setString(1, txtId.getText());
			rs = pst.executeQuery();//recuperar os dados do banco
			//setar os campos do formulário com as informações recuperadas do banco de dados
			// rs.next -> significa se houver informações para recuperar
			if(rs.next()) {
				txtNome.setText(rs.getString(2));
				txtFone.setText(rs.getString(3));
				txtEmail.setText(rs.getString(4));
			} else {
				//mensagem ao usuário
				JOptionPane.showMessageDialog(null, "Contato não cadastrado");
				//limpar campos
				limpar();
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* Método adicionar */
	private void adicionar() {
		String adicionar = "insert into tb_contatos(id,nome,fone,email) values(?,?,?,?)"; 
		try {
			pst=conexao.prepareStatement(adicionar);
			// a linha abaixo obtem o valor da caixa de texto txtId e armazena(set) no campo 1 do banco de dados
			pst.setString(1, txtId.getText());
			pst.setString(2, txtNome.getText());
			pst.setString(3, txtFone.getText());
			pst.setString(4, txtEmail.getText());
			//a estrutura abaixo executa o comando sql e exibe uma mensagem de confirmação ao usuário
			int adicionado = pst.executeUpdate();
			//System.out.println(adicionado); //apoio ao entendimento
			if (adicionado == 1) { //inserir ou alterar 1 linha na tabela
				JOptionPane.showMessageDialog(null, "Contato adicionado");
			}
			//limpar campos
			limpar();
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* método alterar */
	private void alterar() {
		String alterar = "update tb_contatos set nome=?,fone=?,email=? where id=?";
		try {
			pst=conexao.prepareStatement(alterar);
			//Atenção na passagem de parâmetros o id neste caso é o último
			//?nome ?fone ?email ?id
			pst.setString(1, txtNome.getText());
			pst.setString(2, txtFone.getText());
			pst.setString(3, txtEmail.getText());
			pst.setString(4, txtId.getText());
			int alterado = pst.executeUpdate();//mesmo raciocínio do insert
			if (alterado == 1) {
				JOptionPane.showMessageDialog(null, "Contato alterado com sucesso");
			}
			//limpar campos
			limpar();
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	/* método remover */
	private void remover() {
		//ATENÇÃO Vamos primeiro criar uma caixa de diálogo para confirmar a remoção
		// criando uma variável que irá receber um valor quando o usuário clicar no botão SIM ou NÃO
		int confirma = JOptionPane.showConfirmDialog(null,"Confirma a exclusão deste contato?","ATENÇÃO",JOptionPane.YES_NO_OPTION);
		//System.out.println(confirma);//apoio ao entendimento da lógica
		if(confirma == 0) {
			String apagar = "delete from tb_contatos where id=?";
			try {
				pst= conexao.prepareStatement(apagar);
				pst.setString(1, txtId.getText());
				int removido = pst.executeUpdate();
				if (removido == 1) {
					JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
				}
				//limpar campos
				limpar();
				
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
	
	/* método limpar campos */
	private void limpar() {
		txtId.setText(null);
		txtNome.setText(null);
		txtFone.setText(null);
		txtEmail.setText(null);
	}
	
	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtNome;
	private JTextField txtFone;
	private JTextField txtEmail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Contatos frame = new Contatos();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * CONSTRUTOR
	 */
	
	public Contatos() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Contatos.class.getResource("/javax/swing/plaf/metal/icons/ocean/computer.gif")));
		setTitle("Agenda");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 438, 369);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//dica Geovane (centralizar o formulário)
		setLocationRelativeTo(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setBounds(43, 37, 56, 16);
		contentPane.add(lblId);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setBounds(24, 83, 44, 16);
		contentPane.add(lblNome);
		
		JLabel lblFone = new JLabel("Fone");
		lblFone.setBounds(27, 123, 56, 16);
		contentPane.add(lblFone);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setBounds(24, 170, 56, 16);
		contentPane.add(lblEmail);
		
		JLabel lblConexao = new JLabel("");
		lblConexao.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/dberror.png")));
		lblConexao.setBounds(356, 13, 40, 40);
		contentPane.add(lblConexao);
		
		JButton btnCreate = new JButton("");
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adicionar();
			}
		});
		btnCreate.setToolTipText("Adicionar");
		btnCreate.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/create.png")));
		btnCreate.setBounds(53, 226, 70, 70);
		contentPane.add(btnCreate);
		
		JButton btnRead = new JButton("");
		btnRead.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				pesquisar();
			}
		});
		btnRead.setToolTipText("Pesquisar");
		btnRead.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/read.png")));
		btnRead.setBounds(135, 226, 70, 70);
		contentPane.add(btnRead);
		
		txtId = new JTextField();
		txtId.setBounds(74, 34, 76, 22);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtNome = new JTextField();
		txtNome.setBounds(74, 80, 304, 22);
		contentPane.add(txtNome);
		txtNome.setColumns(10);
		
		txtFone = new JTextField();
		txtFone.setBounds(75, 120, 193, 22);
		contentPane.add(txtFone);
		txtFone.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(74, 167, 280, 22);
		contentPane.add(txtEmail);
		txtEmail.setColumns(10);
		
		JButton btnUpdate = new JButton("");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				alterar();	
			}
		});
		btnUpdate.setToolTipText("Alterar");
		btnUpdate.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/update.png")));
		btnUpdate.setBounds(215, 226, 70, 70);
		contentPane.add(btnUpdate);
		
		JButton btnDelete = new JButton("");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				remover();
			}
		});
		btnDelete.setToolTipText("Excluir");
		btnDelete.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/delete.png")));
		btnDelete.setBounds(297, 226, 70, 70);
		contentPane.add(btnDelete);
		//estabelecer a conexão com o banco na interface gráfica dentro do construtor
				conexao = ModuloConexao.conector();
				if (conexao != null) {
					//a linha abaixo troca a imagem do ícone da label
					lblConexao.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/dbok.png")));
				} else {
					lblConexao.setIcon(new ImageIcon(Contatos.class.getResource("/br/com/agenda/icones/dberror.png")));
				}
	}
}
