package View;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Control.CarrinhoControl;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import java.awt.Button;
import javax.swing.UIManager;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConcluirCompra extends JFrame {

	private JPanel contentPane;

	
	
	ConcluirCompra frame;
	public static void run(double total, String atendente) {
		try {
			ConcluirCompra frame = new ConcluirCompra(total,atendente);
			frame.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
		
	

	
	public ConcluirCompra(double total, String atendente) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(400, 250, 323, 239);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String[] pagamento = {"Dinheiro", "Crédito", "Débito", "Ticket"};
		JComboBox comboBox = new JComboBox(pagamento);
		comboBox.setBounds(122, 104, 69, 20);
		contentPane.add(comboBox);
		
		JLabel lblPagamento = new JLabel("Pagamento: ");
		lblPagamento.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblPagamento.setBounds(31, 105, 100, 14);
		contentPane.add(lblPagamento);
		
		JLabel lblValorTotal = new JLabel("Valor total : R$"+total);
		lblValorTotal.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblValorTotal.setBounds(31, 22, 266, 30);
		contentPane.add(lblValorTotal);
		
		JLabel lblAtendente = new JLabel("Atendente: "+atendente);
		lblAtendente.setFont(new Font("Times New Roman", Font.PLAIN, 18));
		lblAtendente.setBounds(31, 63, 266, 30);
		contentPane.add(lblAtendente);
		
		Button button = new Button("Concluir");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(CarrinhoControl.concluirCompra(atendente,""+comboBox.getSelectedItem())) {
					JOptionPane.showMessageDialog(frame,"Compra concluida com exito.");
					
				}else {
					JOptionPane.showMessageDialog(frame,"Houve algum erro!!");
				}
			}
		});
		button.setForeground(UIManager.getColor("Button.background"));
		button.setFont(new Font("Dialog", Font.BOLD, 14));
		button.setBackground(new Color(51, 204, 102));
		button.setBounds(205, 157, 92, 33);
		contentPane.add(button);
		
		Button button_1 = new Button("Cancelar");
		button_1.setForeground(SystemColor.menu);
		button_1.setFont(new Font("Dialog", Font.BOLD, 14));
		button_1.setBackground(new Color(153, 51, 0));
		button_1.setBounds(10, 157, 92, 33);
		contentPane.add(button_1);
	}
}
