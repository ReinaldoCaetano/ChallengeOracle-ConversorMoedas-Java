package br.com.oraclechallenge.conversor.conversormedidascomprimento;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import br.com.oraclechallenge.conversor.TelaInicial;
import br.com.oraclechallenge.conversor.utils.SoNumeros;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaMedidasComprimento extends JFrame{
	private JTextField textField;
	private JTextField textField_1;
	
	ConversorMedida conversorMedida = new ConversorMedida();
	
	public TelaMedidasComprimento() {
		getContentPane().setLayout(null);
		
		setSize(new Dimension( 474 , 319));
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Converter De");
		lblNewLabel.setBounds(25, 26, 128, 16);
		getContentPane().add(lblNewLabel);
		
		JComboBox<String> selecaoDe = new JComboBox<String>();
		selecaoDe.setBounds(82, 73, 72, 27);
		selecaoDe.addItem("KM");
		selecaoDe.addItem("HM");
		selecaoDe.addItem("DAM");
		selecaoDe.addItem("M");
		selecaoDe.addItem("DM");
		selecaoDe.addItem("CM");
		selecaoDe.addItem("MM");
		getContentPane().add(selecaoDe);
		
		textField = new JTextField();
		textField.setBounds(166, 72, 262, 26);
		textField.setDocument(new SoNumeros());// BLOQUEAR TECLADO PARA DIGITAR APENAS NUMEROS
		textField.setHorizontalAlignment((int) CENTER_ALIGNMENT);//ALINHAR TEXTO CENTRO
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Para");
		lblNewLabel_1.setBounds(48, 112, 61, 16);
		getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(166, 148, 262, 26);
		textField_1.setHorizontalAlignment((int) CENTER_ALIGNMENT);
		textField_1.setEditable(false);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JComboBox<String> selecaoPara = new JComboBox<String>();
		selecaoPara.setBounds(82, 149, 72, 27);
		selecaoPara.addItem("HM");
		selecaoPara.addItem("DAM");
		selecaoPara.addItem("M");
		selecaoPara.addItem("DM");
		selecaoPara.addItem("CM");
		selecaoPara.addItem("MM");
		selecaoPara.addItem("KM");
		getContentPane().add(selecaoPara);
		
		JButton btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(selecaoDe.getSelectedItem() == selecaoPara.getSelectedItem()) {
					 textField_1.setText(textField.getText());
					 JOptionPane.showMessageDialog(null,"Selecione Medidas Diferentes para conversão ou o Valor será o Mesmo!!!");
				 }
				 else{
					textField_1.setText(conversorMedida.converter(Double.valueOf(textField.getText()),
							selecaoDe.getSelectedItem().toString(),
							selecaoPara.getSelectedItem().toString()));
				 }
				
		}
		});
		btnNewButton.setBounds(326, 236, 117, 29);
		getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Voltar");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 TelaInicial telaInicial = new TelaInicial();
	             setVisible(false);
	             telaInicial.setVisible(true);
			}
		});
		btnNewButton_1.setBounds(25, 236, 117, 29);
		getContentPane().add(btnNewButton_1);
	}
}
