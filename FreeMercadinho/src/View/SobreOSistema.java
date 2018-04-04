package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SobreOSistema extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	static SobreOSistema frame;
	public static void run() {
		try {
			frame = new SobreOSistema();
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public SobreOSistema() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(450, 50, 451, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("OK!");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(302, 335, 89, 33);
		contentPane.add(btnNewButton);
		
		JTextPane txtpnOMercadohumilde = new JTextPane();
		txtpnOMercadohumilde.setEditable(false);
		txtpnOMercadohumilde.setBackground(UIManager.getColor("Button.background"));
		txtpnOMercadohumilde.setFont(new Font("Tahoma", Font.PLAIN, 13));
		txtpnOMercadohumilde.setText("    O Mercad\u00E3oHumilde \u00E9 um projeto open-source desenvolvido para a diciplina de LTP2.\r\n    A id\u00E9ia foi desenvolver um sistema PDV ( ponto de venda) de frente de caixa que integrasse ao controle de estoque e log das vendas utilizando os padr\u00F5es desenvolvimento MVC e DAO.\r\n\r\n\r\n< Dev by \\>\r\n     ~wwwMendex\r\n     ~Bigodinho22\r\n\r\n\r\n\r\n\r\n\r\nSalve Sininho, \u00E9h nois.");
		txtpnOMercadohumilde.setBounds(29, 51, 318, 278);
		contentPane.add(txtpnOMercadohumilde);
		
		JLabel lblSobreOSistema = new JLabel("Sobre o Sistema: ");
		lblSobreOSistema.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblSobreOSistema.setBounds(29, 11, 151, 29);
		contentPane.add(lblSobreOSistema);
	}
}
