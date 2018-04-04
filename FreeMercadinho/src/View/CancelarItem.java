package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.CarrinhoControl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CancelarItem extends JFrame {

	private JPanel contentPane;

	static CancelarItem frame;
	private JTextField campoCodigo;
	private JTextField campoQuantidade;
	public static void run() {
		try {
			frame = new CancelarItem();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the frame.
	 */
	public CancelarItem() {
		setTitle("Cancelamento de item\r\n");
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(500, 200, 322, 237);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCancelarItem = new JLabel("Cancelar Item: ");
		lblCancelarItem.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCancelarItem.setBounds(98, 11, 122, 24);
		contentPane.add(lblCancelarItem);
		
		JLabel lblCdigoDeBarras = new JLabel("C\u00F3digo de Barras:");
		lblCdigoDeBarras.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCdigoDeBarras.setBounds(10, 56, 122, 24);
		contentPane.add(lblCdigoDeBarras);
		
		JLabel lblQuantidade = new JLabel("Quantidade:");
		lblQuantidade.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidade.setBounds(10, 102, 107, 24);
		contentPane.add(lblQuantidade);
		
		campoCodigo = new JTextField();
		campoCodigo.setBounds(125, 58, 145, 24);
		contentPane.add(campoCodigo);
		campoCodigo.setColumns(10);
		
		campoQuantidade = new JTextField();
		campoQuantidade.setBounds(127, 106, 55, 20);
		contentPane.add(campoQuantidade);
		campoQuantidade.setColumns(10);
		
		JButton btnConfirmar = new JButton("Confirmar");
		btnConfirmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(CarrinhoControl.cancelarItem(Long.parseLong(campoCodigo.getText()), Integer.parseInt(campoQuantidade.getText()))) {
					JOptionPane.showMessageDialog(frame,"CANCELADO!");
					frame.dispose();
				}else {
					JOptionPane.showMessageDialog(frame,"Houve algum erro!!");
				}
			}
		});
		btnConfirmar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnConfirmar.setBackground(new Color(102, 204, 102));
		btnConfirmar.setBounds(207, 164, 89, 23);
		contentPane.add(btnConfirmar);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnFechar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFechar.setBackground(new Color(102, 51, 0));
		btnFechar.setBounds(10, 165, 89, 23);
		contentPane.add(btnFechar);
	}

}
