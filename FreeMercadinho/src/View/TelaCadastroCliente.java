package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.ClienteControl;
import Model.Cliente;
import Model.DAO.ClienteDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campoCpf;
	private JTextField campoNome;

	/**
	 * Launch the application.
	 */
	static TelaCadastroCliente frame;
			public static void run() {
				try {
					frame = new TelaCadastroCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		

	/**
	 * Create the frame.
	 */
	public TelaCadastroCliente() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(500, 200, 348, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCadastroDeNovo = new JLabel("Cadastro de novo cliente");
		lblCadastroDeNovo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCadastroDeNovo.setBounds(70, 11, 243, 34);
		contentPane.add(lblCadastroDeNovo);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(34, 97, 59, 26);
		contentPane.add(lblCpf);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNome.setBounds(34, 145, 59, 26);
		contentPane.add(lblNome);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(70, 97, 167, 25);
		contentPane.add(campoCpf);
		campoCpf.setColumns(10);
		
		campoNome = new JTextField();
		campoNome.setColumns(10);
		campoNome.setBounds(85, 145, 152, 25);
		contentPane.add(campoNome);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Cliente cli = new Cliente(campoNome.getText(), campoCpf.getText());
				if(ClienteControl.cadastroCliente(cli)) {
					JOptionPane.showMessageDialog(frame, "Cadastrado com sucesso");
					frame.dispose();
				}else {
					JOptionPane.showConfirmDialog(frame, "Cliente já cadastrado");
				}
			}
		});
		btnCadastrar.setForeground(new Color(0, 128, 0));
		btnCadastrar.setBackground(new Color(60, 179, 113));
		btnCadastrar.setBounds(224, 215, 89, 23);
		contentPane.add(btnCadastrar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnCancelar.setForeground(new Color(139, 0, 0));
		btnCancelar.setBackground(new Color(255, 0, 0));
		btnCancelar.setBounds(10, 215, 89, 23);
		contentPane.add(btnCancelar);
	}

}
