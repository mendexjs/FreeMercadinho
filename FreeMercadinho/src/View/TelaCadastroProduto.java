package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.EstoqueControl;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCadastroProduto extends JFrame {

	private JPanel contentPane;
	private JTextField campoCodigoProd;
	private JTextField campoQtdEstoque;
	private JTextField campoNomeProd;
	private JTextField campoPrecoUnit;
	static TelaCadastroProduto frame;
	public static void run() {
		try {
			 frame = new TelaCadastroProduto();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		

	/**
	 * Create the frame.
	 */
	public TelaCadastroProduto() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(450, 250, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCodigoDoProduto = new JLabel("Codigo do Produto: ");
		lblCodigoDoProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCodigoDoProduto.setBounds(20, 173, 170, 34);
		contentPane.add(lblCodigoDoProduto);
		
		JLabel lblQuantidadeNoEstoque = new JLabel("Quantidade no Estoque:");
		lblQuantidadeNoEstoque.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblQuantidadeNoEstoque.setBounds(20, 94, 170, 34);
		contentPane.add(lblQuantidadeNoEstoque);
		
		JLabel lblNomeProduto = new JLabel("Nome Produto: ");
		lblNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNomeProduto.setBounds(20, 21, 170, 25);
		contentPane.add(lblNomeProduto);
		
		JLabel lblPreoUnitrio = new JLabel("Pre\u00E7o Unit\u00E1rio: ");
		lblPreoUnitrio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPreoUnitrio.setBounds(256, 99, 112, 25);
		contentPane.add(lblPreoUnitrio);
		
		campoCodigoProd = new JTextField();
		campoCodigoProd.setBounds(30, 203, 130, 25);
		contentPane.add(campoCodigoProd);
		campoCodigoProd.setColumns(10);
		
		campoQtdEstoque = new JTextField();
		campoQtdEstoque.setBounds(30, 124, 86, 25);
		contentPane.add(campoQtdEstoque);
		campoQtdEstoque.setColumns(10);
		
		campoNomeProd = new JTextField();
		campoNomeProd.setBounds(30, 45, 394, 25);
		contentPane.add(campoNomeProd);
		campoNomeProd.setColumns(10);
		
		campoPrecoUnit = new JTextField();
		campoPrecoUnit.setBounds(266, 124, 95, 25);
		contentPane.add(campoPrecoUnit);
		campoPrecoUnit.setColumns(10);
		
		JLabel lblCadastroDeProdutos = new JLabel("Cadastro de Produtos");
		lblCadastroDeProdutos.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCadastroDeProdutos.setBounds(143, -1, 180, 35);
		contentPane.add(lblCadastroDeProdutos);
		
		Button button = new Button("Cadastrar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(EstoqueControl.cadastroProdutos(Long.parseLong(campoCodigoProd.getText()),
					Integer.parseInt(campoQtdEstoque.getText()), campoNomeProd.getText(), 
					Double.parseDouble(campoPrecoUnit.getText()))) {
					
					JOptionPane.showMessageDialog(frame,"Produto Cadastrado!");
					campoCodigoProd.setText("");
					campoNomeProd.setText("");
					campoPrecoUnit.setText("");
					campoQtdEstoque.setText("");
				}else {
					JOptionPane.showMessageDialog(frame,"Erro no cadastro!");
				}
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(102, 204, 102));
		button.setFont(new Font("Dialog", Font.BOLD, 15));
		button.setBounds(330, 212, 94, 39);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancelar");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Dialog", Font.BOLD, 15));
		button_1.setBackground(new Color(153, 51, 0));
		button_1.setBounds(219, 212, 94, 39);
		contentPane.add(button_1);
	}
}
