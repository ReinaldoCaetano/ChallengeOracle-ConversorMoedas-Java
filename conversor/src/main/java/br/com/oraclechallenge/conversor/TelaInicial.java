package br.com.oraclechallenge.conversor;


import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import br.com.oraclechallenge.conversor.conversormedidascomprimento.TelaMedidasComprimento;
import br.com.oraclechallenge.conversor.conversormoedas.TelaConversorMoedas;

import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class TelaInicial extends JFrame{
	
	
	public TelaInicial() {
		getContentPane().setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		setTitle("Conversor");
		getContentPane().setLayout(null);
		setSize(new Dimension( 474 , 319));
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Conversores");
		lblNewLabel.setFont(new Font("Lucida Grande", Font.BOLD, 17));
		lblNewLabel.setBounds(65, 35, 134, 28);
		getContentPane().add(lblNewLabel);
		
		JComboBox<String> selecaoConversor = new JComboBox<String>();
		selecaoConversor.setBounds(65, 75, 328, 69);
		selecaoConversor.addItem("Conversor De Moeda");
        selecaoConversor.addItem("Conversor Medidas de Comprimento");
		getContentPane().add(selecaoConversor);
		
		JButton btnNewButton = new JButton("Ir");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 if(selecaoConversor.getSelectedIndex() == 0) {
		               TelaConversorMoedas telaConversorMoedas = new TelaConversorMoedas();
		               setVisible(false);
		               telaConversorMoedas.setVisible(true);
		            }
				 else if(selecaoConversor.getSelectedIndex() == 1) {
		                TelaMedidasComprimento telaConversorMedidasComprimento = new TelaMedidasComprimento();
		                telaConversorMedidasComprimento.setVisible(true);
		                setVisible(false);
		            }
		            else {
		            	JOptionPane.showInternalMessageDialog(null, "Erro ");
		            }
			}
		});
		btnNewButton.setFont(new Font("Lucida Grande", Font.BOLD, 16));
		btnNewButton.setBounds(293, 204, 117, 29);
		getContentPane().add(btnNewButton);
	}
}
