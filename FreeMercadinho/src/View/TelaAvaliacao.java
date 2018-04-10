package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.AvaliacaoControl;
import Control.Factory.ManipuladorConfig;
import Model.Avaliacao;
import Model.DAO.AvaliacaoDAO;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Properties;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class TelaAvaliacao extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static TelaAvaliacao frame;
	private JTextField campoCPF;
			public static void run() {
				try {
					frame = new TelaAvaliacao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public TelaAvaliacao() throws IOException {
		Properties prop = ManipuladorConfig.getProp();
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(500, 150, 341, 255);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAvalieAExperincia = new JLabel("Avalie a Experi\u00EAncia");
		lblAvalieAExperincia.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblAvalieAExperincia.setBounds(79, 11, 222, 39);
		contentPane.add(lblAvalieAExperincia);
		String[] pagamento = {"1", "2", "3", "4","5"};
		JComboBox comboBox = new JComboBox(pagamento);
		comboBox.setBounds(51, 123, 52, 30);
		contentPane.add(comboBox);
		JLabel lblNota = new JLabel("Nota:");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNota.setBounds(10, 134, 76, 19);
		contentPane.add(lblNota);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avaliacao aval = new Avaliacao(Integer.parseInt(""+comboBox.getSelectedItem()), campoCPF.getText(),prop.getProperty("prop.nomeAtendente"));
				if(AvaliacaoControl.gerarAvaliacao(aval)) {
					JOptionPane.showMessageDialog(frame, "Obrigado!"); 
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(frame, "Cliente não cadastrado!");
				}
			}
			
		});
		btnConfirmar.setForeground(new Color(0, 128, 0));
		btnConfirmar.setBounds(226, 133, 89, 38);
		contentPane.add(btnConfirmar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnCancelar.setForeground(Color.RED);
		btnCancelar.setBounds(226, 182, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblCpf = new JLabel("CPF: ");
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCpf.setBounds(10, 76, 76, 14);
		contentPane.add(lblCpf);
		
		campoCPF = new JTextField();
		campoCPF.setBounds(59, 70, 150, 23);
		contentPane.add(campoCPF);
		campoCPF.setColumns(10);
		
		JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
		btnCadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				TelaCadastroCliente.run();
			}
		});
		btnCadastrarCliente.setBackground(new Color(65, 105, 225));
		btnCadastrarCliente.setBounds(14, 182, 117, 23);
		contentPane.add(btnCadastrarCliente);
	}
}
