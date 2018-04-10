package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.CarrinhoControl;
import Control.Factory.ManipuladorConfig;
import Model.Produto;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JScrollBar;
import java.awt.Button;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class TelaPrincipal extends JFrame {

	private JPanel contentPane;
	private JTextField campoCodigo;
	private JTextField campoQtdCod;

	
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
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

	
	public TelaPrincipal() throws IOException {
		Properties prop = ManipuladorConfig.getProp(); // abrindo arquivo de configs
		DecimalFormat df = new DecimalFormat("0.##");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(220, 10, 910, 706);
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
		mntmCadastrarProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TelaCadastroProduto.run();
			}
		});
		mnCadastrarProdutos.add(mntmCadastrarProdutos);
		
		JMenu mnAjuda = new JMenu("Ajuda");
		barraMenu.add(mnAjuda);
		
		JMenuItem mntmSobreOSistema = new JMenuItem("Sobre o Sistema");
		mntmSobreOSistema.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SobreOSistema.run();
			}
		});
		mnAjuda.add(mntmSobreOSistema);
		
		JLabel lblDescrioDo = new JLabel("DESCRI\u00C7\u00C3O DO PRODUTO:");
		lblDescrioDo.setForeground(new Color(255, 255, 255));
		lblDescrioDo.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblDescrioDo.setBounds(30, 54, 271, 27);
		contentPane.add(lblDescrioDo);
		
		JTextArea itensComprados = new JTextArea();
		itensComprados.setText("");
		itensComprados.setEditable(false);
		itensComprados.setBounds(23, 316, 803, 309);
		contentPane.add(itensComprados);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setMaximum(20);
		scrollBar.setBlockIncrement(50);
		scrollBar.setBounds(826, 316, 17, 309);
		contentPane.add(scrollBar);
		
		JPanel panel_17 = new JPanel();
		panel_17.setBackground(Color.WHITE);
		panel_17.setBounds(220, 55, 615, 23);
		contentPane.add(panel_17);
		
		JLabel campoDescricao = new JLabel("");
		campoDescricao.setVerticalAlignment(SwingConstants.TOP);
		campoDescricao.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		campoDescricao.setHorizontalAlignment(SwingConstants.LEFT);
		panel_17.add(campoDescricao);
		
		JLabel label_1 = new JLabel("");
		label_1.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_17.add(label_1);
		
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.WHITE);
		panel_13.setBounds(24, 135, 121, 27);
		contentPane.add(panel_13);
		
		JLabel campoQuantidade = new JLabel("");
		campoQuantidade.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_13.add(campoQuantidade);
		
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
		
		JPanel panel_14 = new JPanel();
		panel_14.setBounds(190, 134, 133, 27);
		contentPane.add(panel_14);
		panel_14.setBackground(Color.WHITE);
		
		JLabel campoValorQuantidade = new JLabel("");
		campoValorQuantidade.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_14.add(campoValorQuantidade);
		
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
		
		JPanel panel_15 = new JPanel();
		panel_15.setBackground(Color.WHITE);
		panel_15.setBounds(363, 135, 133, 27);
		contentPane.add(panel_15);
		
		JLabel campoSubTotal = new JLabel("");
		campoSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_15.add(campoSubTotal);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 51, 102));
		panel_6.setBounds(363, 108, 133, 27);
		contentPane.add(panel_6);
		
		JLabel lblSubTotal = new JLabel("SUB TOTAL");
		lblSubTotal.setForeground(Color.WHITE);
		lblSubTotal.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_6.add(lblSubTotal);
		
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(new Color(51, 102, 204));
		panel_7.setBounds(360, 104, 141, 60);
		contentPane.add(panel_7);
		
		Button button = new Button("Concluir");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String nomeFunc= prop.getProperty("prop.nomeAtendente");
				ConcluirCompra.run(CarrinhoControl.calcularTotal(),nomeFunc);
			}
		});
		button.setForeground(UIManager.getColor("Button.light"));
		button.setBackground(new Color(0, 153, 102));
		button.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button.setBounds(643, 190, 194, 34);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancelar Item");
		
		button_1.setForeground(UIManager.getColor("Button.disabledShadow"));
		button_1.setFont(new Font("Times New Roman", Font.BOLD, 15));
		button_1.setBackground(new Color(255, 204, 102));
		button_1.setBounds(643, 226, 194, 34);
		contentPane.add(button_1);
		
		JPanel panel_16 = new JPanel();
		panel_16.setBackground(Color.WHITE);
		panel_16.setBounds(642, 142, 194, 29);
		contentPane.add(panel_16);
		
		JLabel campoTotal = new JLabel("");
		campoTotal.setFont(new Font("Times New Roman", Font.BOLD, 20));
		panel_16.add(campoTotal);
		
		JPanel panel_9 = new JPanel();
		panel_9.setBackground(new Color(51, 102, 204));
		panel_9.setBounds(635, 108, 208, 166);
		contentPane.add(panel_9);
		
		JPanel panel_8 = new JPanel();
		panel_9.add(panel_8);
		panel_8.setBackground(new Color(102, 153, 255));
		
		JLabel lblTotalDaCompra = new JLabel("   TOTAL DA COMPRA:   ");
		lblTotalDaCompra.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalDaCompra.setForeground(Color.WHITE);
		lblTotalDaCompra.setFont(new Font("Times New Roman", Font.BOLD, 16));
		panel_8.add(lblTotalDaCompra);
		
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(new Color(51, 102, 204));
		panel_10.setBounds(0, 633, 894, 60);
		contentPane.add(panel_10);
		
		JLabel lblCaixaAberto = new JLabel(prop.getProperty("prop.mensagemRodape"));
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
		
		campoCodigo = new JTextField();
		campoCodigo.setFont(new Font("Tahoma", Font.BOLD, 16));
		campoCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		campoCodigo.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent arg0) {
				int tecla = arg0.getKeyCode();
		        if (tecla == KeyEvent.VK_ENTER) {
		        	Produto produtoBuscado= CarrinhoControl.buscarProduto(Long.parseLong(campoCodigo.getText()), 
		        		Integer.parseInt(campoQtdCod.getText()));
		        	// Atualizando GUI
		        	campoCodigo.setText("");
		        	campoQtdCod.setText("1");
		        	campoDescricao.setText(produtoBuscado.getNomeProduto());
		        	campoQuantidade.setText("" + produtoBuscado.getQtdComprada());
		        	campoValorQuantidade.setText("R$"+ df.format(produtoBuscado.getValorUnid()));
		        	campoSubTotal.setText("R$"+ df.format(produtoBuscado.getValorUnid() * produtoBuscado.getQtdComprada()));
		        	campoTotal.setText("R$"+ df.format(CarrinhoControl.calcularTotal()));
		        	itensComprados.setText(CarrinhoControl.listarComprados());
		        }
			}
		});
		
		campoQtdCod = new JTextField();
		campoQtdCod.setHorizontalAlignment(SwingConstants.CENTER);
		campoQtdCod.setText("1");
		campoQtdCod.setFont(new Font("Tahoma", Font.BOLD, 16));
		campoQtdCod.setColumns(10);
		campoQtdCod.setBounds(215, 245, 121, 27);
		contentPane.add(campoQtdCod);
		campoCodigo.setColumns(10);
		campoCodigo.setBounds(23, 244, 151, 27);
		contentPane.add(campoCodigo);
		
		JPanel panel_12 = new JPanel();
		panel_12.setBackground(new Color(51, 102, 204));
		panel_12.setBounds(20, 214, 158, 60);
		contentPane.add(panel_12);
		
		
		String nomeMercado=prop.getProperty("prop.nomeMercado");
		JLabel lblMercadoHumilde = new JLabel(nomeMercado);
		lblMercadoHumilde.setFont(new Font("Gabriola", Font.BOLD, 33));
		lblMercadoHumilde.setBounds(373, 175, 285, 55);
		contentPane.add(lblMercadoHumilde);
		
		JPanel panel_18 = new JPanel();
		panel_18.setBackground(new Color(0, 51, 102));
		panel_18.setBounds(215, 218, 121, 27);
		contentPane.add(panel_18);
		
		JLabel lblUnidades = new JLabel("UNIDADES");
		lblUnidades.setForeground(Color.WHITE);
		lblUnidades.setFont(new Font("Times New Roman", Font.BOLD, 14));
		panel_18.add(lblUnidades);
		
		JPanel panel_20 = new JPanel();
		panel_20.setBackground(new Color(51, 102, 204));
		panel_20.setBounds(212, 214, 128, 60);
		contentPane.add(panel_20);
		
		JLabel label_2 = new JLabel("->");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Palatino Linotype", Font.BOLD, 26));
		label_2.setBounds(175, 226, 35, 34);
		contentPane.add(label_2);
		
		JButton button_2 = new JButton("");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itensComprados.setText(CarrinhoControl.listarComprados());
	        	campoTotal.setText("R$"+ CarrinhoControl.calcularTotal());
			}
		});
		button_2.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/sun/javafx/scene/web/skin/Redo_16x16_JFX.png")));
		button_2.setBounds(808, 282, 35, 34);
		contentPane.add(button_2);
		
		JLabel lblCaixa = new JLabel("Caixa: "+prop.getProperty("prop.numeroCaixa"));
		lblCaixa.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCaixa.setBounds(375, 282, 121, 23);
		contentPane.add(lblCaixa);
		
		JLabel lblAtendente = new JLabel("Atendente: "+prop.getProperty("prop.nomeAtendente"));
		lblAtendente.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblAtendente.setBounds(372, 233, 215, 27);
		contentPane.add(lblAtendente);
		
		JButton button_3 = new JButton("");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				campoCodigo.setText("");
	        	campoQtdCod.setText("1");
	        	campoDescricao.setText("");
	        	campoQuantidade.setText("");
	        	campoValorQuantidade.setText("");
	        	campoSubTotal.setText("");
	        	campoTotal.setText("");
	        	itensComprados.setText("");
	        	CarrinhoControl.esvaziarCarrinho();
				
			}
		});
		button_3.setIcon(new ImageIcon(TelaPrincipal.class.getResource("/com/sun/javafx/scene/control/skin/caspian/dialog-error.png")));
		button_3.setBounds(23, 282, 35, 34);
		contentPane.add(button_3);
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CancelarItem.run();
			}
		});
	}
}
