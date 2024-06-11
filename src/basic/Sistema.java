package basic;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Sistema implements ActionListener {
	
	private JTextField campoNome;
	private JTextField campoTotalVendas;
	private JTextField campoSalario;
	private JTextField campoComissao;
	private JTextField campoSalariototal;

	public static void main(String[] args) {
		
		new Sistema();
		
	}
	
	public Sistema() {
		JFrame frame = new JFrame("Comissões");
		frame.setSize(400,500);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(9, 2, 10, 10));
		
		JLabel labelNome = new JLabel("Nome do funcionário: ");
		campoNome = new JTextField();
		
		JLabel numeroVendas = new JLabel("Total de vendas: ");
		campoTotalVendas = new JTextField();
		
		JLabel comissao = new JLabel("Comissão: ");
		
		JRadioButton umporcento = new JRadioButton("1%");
		umporcento.addActionListener(this);
		JRadioButton doisporcento = new JRadioButton("2%");
		doisporcento.addActionListener(this);
		JRadioButton tresporcento = new JRadioButton("3%");
		tresporcento.addActionListener(this);
		JRadioButton quatroporcento = new JRadioButton("4%");
		quatroporcento.addActionListener(this);
		
		JLabel labelValorcomissao = new JLabel("Valor da comissão: ");
		campoComissao = new JTextField();
		
		JLabel salario = new JLabel("Salário: ");
		campoSalario = new JTextField();
		
		JLabel labelSalarioTotal = new JLabel("Salário + comissão: ");
		campoSalariototal = new JTextField();
		
		
		JButton calcular = new JButton("Calcular");
		
		panel.add(labelNome);
		panel.add(campoNome);
		panel.add(numeroVendas);
		panel.add(campoTotalVendas);
		panel.add(comissao);
		panel.add(new JLabel(""));
		panel.add(umporcento);
		panel.add(doisporcento);
		panel.add(tresporcento);
		panel.add(quatroporcento);
		panel.add(labelValorcomissao);
		panel.add(campoComissao);
		panel.add(salario);
		panel.add(campoSalario);
		panel.add(labelSalarioTotal);
		panel.add(campoSalariototal);
		panel.add(calcular);
		
		frame.add(panel);
		frame.setVisible(true);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
