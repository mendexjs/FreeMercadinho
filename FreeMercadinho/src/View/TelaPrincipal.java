package View;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JScrollBar;
import java.awt.Button;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            System.err.println(ex);
        }
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public TelaPrincipal() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 910, 706);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 204, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar barraMenu = new JMenuBar();
		barraMenu.setBounds(0, 0, 894, 27);
		contentPane.add(barraMenu);
		
		JMenu mnCadastrarProdutos = new JMenu("Op\u00E7\u00F5es");
		barraMenu.add(mnCadastrarProdutos);
		
		JMenuItem mntmCadastrarProdutos = new JMenuItem("Cadastrar Produtos");
		mnCadastrarProdutos.add(mntmCadastrarProdutos);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Login Funcionario");
		mnCadastrarProdutos.add(mntmNewMenuItem);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		barraMenu.add(mnAjuda);
		
		JMenuItem mntmSobreOSistema = new JMenuItem("Sobre o Sistema");
		mnAjuda.add(mntmSobreOSistema);
		
		JLabel lblDescrioDo = new JLabel("DESCRI\u00C7\u00C3O DO PRODUTO:");
		lblDescrioDo.setForeground(new Color(255, 255, 255));
		lblDescrioDo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDescrioDo.setBounds(30, 54, 271, 27);
		contentPane.add(lblDescrioDo);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(23, 316, 803, 309);
		contentPane.add(textArea);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(20);
		scrollBar.setBlockIncrement(50);
		scrollBar.setBounds(826, 316, 17, 309);
		contentPane.add(scrollBar);
		
		textField = new JTextField();
		textField.setBounds(224, 53, 612, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(23, 134, 121, 27);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 51, 102));
		panel.setBounds(23, 108, 121, 27);
		contentPane.add(panel);
		
		JLabel lblQ = new JLabel("QUANTIDADE: ");
		lblQ.setForeground(new Color(255, 255, 255));
		panel.add(lblQ);
		lblQ.setFont(new Font("Times New Roman", Font.BOLD, 14));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(51, 102, 204));
		panel_1.setBounds(20, 104, 128, 60);
		contentPane.add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(0, 51, 102));
		panel_2.setBounds(23, 53, 813, 27);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(new Color(51, 102, 204));
		panel_3.setBounds(20, 50, 823, 34);
		contentPane.add(panel_3);
		
		JLabel lblX = new JLabel("X");
		lblX.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblX.setBounds(158, 123, 67, 41);
		contentPane.add(lblX);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 134, 133, 27);
		contentPane.add(textField_2);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 51, 102));
		panel_5.setBounds(190, 108, 133, 27);
		contentPane.add(panel_5);
		
		JLabel lblValorUnitrio = new JLabel("VALOR UNIDADE");
		lblValorUnitrio.setForeground(Color.WHITE);
		lblValorUnitrio.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_5.add(lblValorUnitrio);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(51, 102, 204));
		panel_4.setBounds(187, 104, 141, 60);
		contentPane.add(panel_4);
		
		JLabel label = new JLabel("=");
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(338, 123, 67, 41);
		contentPane.add(label);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 51, 102));
		panel_6.setBounds(363, 108, 133, 27);
		contentPane.add(panel_6);
		
		JLabel lblSubTotal = new JLabel("SUB TOTAL");
		lblSubTotal.setForeground(Color.WHITE);
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_6.add(lblSubTotal);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(363, 134, 133, 27);
		contentPane.add(textField_3);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 102, 204));
		panel_7.setBounds(360, 104, 141, 60);
		contentPane.add(panel_7);
		
		Button button = new Button("Concluir");
		button.setBackground(new Color(0, 153, 102));
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(610, 185, 194, 34);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancelar Item");
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBackground(new Color(255, 204, 102));
		button_1.setBounds(610, 226, 194, 34);
		contentPane.add(button_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(609, 140, 194, 34);
		contentPane.add(textField_4);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(51, 102, 204));
		panel_9.setBounds(602, 108, 208, 166);
		contentPane.add(panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_9.add(panel_8);
		panel_8.setBackground(new Color(102, 153, 255));
		
		JLabel lblTotalDaCompra = new JLabel("TOTAL DA COMPRA: R$");
		lblTotalDaCompra.setForeground(Color.WHITE);
		lblTotalDaCompra.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_8.add(lblTotalDaCompra);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(51, 102, 204));
		panel_10.setBounds(0, 633, 894, 60);
		contentPane.add(panel_10);
		
		JLabel lblCaixaAberto = new JLabel("CAIXA ABERTO");
		panel_10.add(lblCaixaAberto);
		lblCaixaAberto.setForeground(new Color(255, 255, 255));
		lblCaixaAberto.setFont(new Font("Times New Roman", Font.BOLD, 21));
		
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(new Color(0, 51, 102));
		panel_11.setBounds(23, 218, 151, 27);
		contentPane.add(panel_11);
		
		JLabel lblCdigoDeBarras = new JLabel("C\u00D3DIGO DE BARRAS");
		lblCdigoDeBarras.setForeground(Color.WHITE);
		lblCdigoDeBarras.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_11.add(lblCdigoDeBarras);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(23, 244, 151, 27);
		contentPane.add(textField_5);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(51, 102, 204));
		panel_12.setBounds(20, 214, 158, 60);
		contentPane.add(panel_12);
		
		JLabel lblMercadoHumilde = new JLabel("Mercad\u00E3o Humilde");
		lblMercadoHumilde.setFont(new Font("Gabriola", Font.BOLD, 33));
		lblMercadoHumilde.setBounds(272, 204, 285, 74);
		contentPane.add(lblMercadoHumilde);
	}
}
