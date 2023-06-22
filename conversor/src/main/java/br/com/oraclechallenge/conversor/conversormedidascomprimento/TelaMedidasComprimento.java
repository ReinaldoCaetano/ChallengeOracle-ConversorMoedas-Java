package br.com.oraclechallenge.conversor.conversormedidascomprimento;

import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelaMedidasComprimento extends JFrame{
	public TelaMedidasComprimento() {
		getContentPane().setLayout(null);
		
		setSize(new Dimension( 474 , 319));
		setLocationRelativeTo(null);
		
		JLabel lblNewLabel = new JLabel("Conversor Medidas De Comprimento");
		lblNewLabel.setBounds(25, 21, 61, 16);
		getContentPane().add(lblNewLabel);
	}
}
