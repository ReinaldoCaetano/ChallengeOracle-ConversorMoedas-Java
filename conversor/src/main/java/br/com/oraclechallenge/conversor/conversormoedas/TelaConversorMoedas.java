package br.com.oraclechallenge.conversor.conversormoedas;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.com.oraclechallenge.conversor.TelaInicial;
import br.com.oraclechallenge.conversor.utils.SoNumeros;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class TelaConversorMoedas extends JFrame {
	
	private JTextField textField;
	private JTextField textField_1;
	
	Moeda moeda = new Moeda();
	
	public TelaConversorMoedas() {
		
		setTitle("Conversor De Moedas");
		getContentPane().setLayout(null);
		setSize(new Dimension( 474 , 319));
		setLocationRelativeTo(null);
		
		JComboBox selecaoMoedasDe = new JComboBox();
		selecaoMoedasDe.setBounds(71, 58, 98, 27);
	        selecaoMoedasDe.addItem("BRL");
	        selecaoMoedasDe.addItem("USD");
	        selecaoMoedasDe.addItem("EUR");
	        selecaoMoedasDe.addItem("JPY");
	        selecaoMoedasDe.addItem("BTC");
	        selecaoMoedasDe.addItem("ETH");
	        selecaoMoedasDe.addItem("CAD");
	        selecaoMoedasDe.addItem("GBP");
	        selecaoMoedasDe.addItem("ARS");
	        selecaoMoedasDe.addItem("CHF");
	        selecaoMoedasDe.addItem("AUD");
	        selecaoMoedasDe.addItem("CNY");
	        selecaoMoedasDe.addItem("ILS");
	        selecaoMoedasDe.addItem("LTC");
	    getContentPane().add(selecaoMoedasDe);
		
		textField = new JTextField();
		textField.setBounds(181, 57, 213, 26);
		textField.setDocument(new SoNumeros()); // apenas numeoros no textfild
		textField.setHorizontalAlignment((int) CENTER_ALIGNMENT); //aliando texto ao centro
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("De");
		lblNewLabel_1.setBounds(48, 32, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Para");
		lblNewLabel_2.setBounds(48, 97, 61, 16);
		getContentPane().add(lblNewLabel_2);
		
		JComboBox selecaoMoedasPara = new JComboBox();
		selecaoMoedasPara.setBounds(71, 137, 98, 27);
		selecaoMoedasPara.addItem("USD");
        selecaoMoedasPara.addItem("EUR");
        selecaoMoedasPara.addItem("JPY");
        selecaoMoedasPara.addItem("BTC");
        selecaoMoedasPara.addItem("ETH");
        selecaoMoedasPara.addItem("CAD");
        selecaoMoedasPara.addItem("GBP");
        selecaoMoedasPara.addItem("ARS");
        selecaoMoedasPara.addItem("CHF");
        selecaoMoedasPara.addItem("AUD");
        selecaoMoedasPara.addItem("CNY");
        selecaoMoedasPara.addItem("ILS");
        selecaoMoedasPara.addItem("LTC");
        selecaoMoedasPara.addItem("BRL");
		getContentPane().add(selecaoMoedasPara);
		
		textField_1 = new JTextField();
		textField_1.setEditable(false);
		textField_1.setBounds(181, 136, 213, 26);
		textField_1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(String.valueOf(selecaoMoedasDe.getSelectedItem()) == String.valueOf(selecaoMoedasPara.getSelectedItem())){
                    JOptionPane.showMessageDialog(null,"Selecione Moedas Diferentes para conversão !!!");

                }else {
                  textField_1.setText(moeda.multiplicarConversor( String.valueOf(selecaoMoedasPara.getSelectedItem())
                  + String.valueOf(selecaoMoedasDe.getSelectedItem()) ,Double.valueOf(textField.getText())));
                    
                }
							}
		});
		btnNewButton.setBounds(312, 215, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial telaInicial = new TelaInicial();
	             setVisible(false);
	             telaInicial.setVisible(true);

			}
		});
		btnNewButton_1.setBounds(27, 215, 117, 29);
		getContentPane().add(btnNewButton_1);
		
		
	}
}
