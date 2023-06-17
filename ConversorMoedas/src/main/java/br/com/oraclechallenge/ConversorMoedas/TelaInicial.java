package br.com.oraclechallenge.ConversorMoedas;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TelaInicial extends JDialog{
    
    private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
    private JLabel selecioneConversor = new JLabel("Selecione Conversor: ");
   
 

    private JComboBox selecaoDeConversor = new JComboBox<>();

    private JButton btnConverter = new JButton("Ir");


TelaInicial(){

        setTitle("Tela Inicial");
        //tamanho tela
        setSize(new Dimension (400,200));
        //centralizar a tela
        setLocationRelativeTo(null);
        //nao deixar redimencionar a tela manualmente
        setResizable(false);
        //gerenciar posição da tela
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;   
        gridBagConstraints.insets = new Insets(4,5,7,5);


        
        selecioneConversor.setPreferredSize(new Dimension(250,40));
        jPanel.add(selecioneConversor,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        selecaoDeConversor.setPreferredSize(new Dimension(300,30));
        selecaoDeConversor.addItem("Conversor De Moeda");
        selecaoDeConversor.addItem("Conversor Medidas de Comprimento");
    

        jPanel.add(selecaoDeConversor,gridBagConstraints);
    

        gridBagConstraints.gridx= 1 ;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new Insets(5,5,5,5);
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;
        
        btnConverter.setPreferredSize(new Dimension(100,40));
        jPanel.add(btnConverter,gridBagConstraints);
        
        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { 
               TelaConversorMoedas telaConversorMoedas = new TelaConversorMoedas();
               setVisible(false);
               telaConversorMoedas.setVisible(true);
            }

        });
        add(jPanel,BorderLayout.PAGE_START);
        setVisible(true);
    } 

}

    

