package br.com.oraclechallenge.ConversorMoedas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TelaConversorMoedas extends JDialog {
    private JPanel jPanel = new JPanel(new GridBagLayout());//painel de componentes
    private JLabel converterDe = new JLabel("Converter De: ");
    private JLabel converterPara = new JLabel("Converter Para: ");
    private JTextField deMoeda = new JTextField();
    private JTextField paraMoeda = new JTextField();

    private JComboBox selecaoMoedasDe = new JComboBox<>();
    private JComboBox selecaoMoedasPara = new JComboBox<>();

    private JButton btnConverter = new JButton("Converter");
    private JButton btnLimpar = new JButton("Limpar");

    Moeda moeda = new Moeda();


    public TelaConversorMoedas() {
        //titulo da pagina
        setTitle("Conversor de Moedas");
        //tamanho tela
        setSize(new Dimension(490,330));
        //centralizar a tela
        setLocationRelativeTo(null);
        //nao deixar redimencionar a tela manualmente
          // setResizable(false);
        //gerenciar posição da tela
        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.insets = new Insets(4,5,7,5);



        converterDe.setPreferredSize(new Dimension(200,40));
        jPanel.add(converterDe,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        selecaoMoedasDe.setPreferredSize(new Dimension(80,40));
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

        jPanel.add(selecaoMoedasDe,gridBagConstraints);


        gridBagConstraints.gridy = 1 ;
        gridBagConstraints.gridx= 1 ;
        deMoeda.setPreferredSize(new Dimension(200,40));
        jPanel.add(deMoeda, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        converterPara.setPreferredSize(new Dimension(200,40));
        jPanel.add(converterPara,gridBagConstraints);


        gridBagConstraints.gridy = 3 ;
        gridBagConstraints.gridx= 0 ;
        selecaoMoedasPara.setPreferredSize(new Dimension(80,40));
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
        jPanel.add(selecaoMoedasPara,gridBagConstraints);

        gridBagConstraints.gridy = 3 ;
        gridBagConstraints.gridx= 1 ;
        paraMoeda.setPreferredSize(new Dimension(200,40));
        jPanel.add(paraMoeda, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.insets = new Insets(25,5,10,5);
        gridBagConstraints.anchor = GridBagConstraints.LINE_END;

        btnLimpar.setPreferredSize(new Dimension(130,40));
        jPanel.add(btnLimpar,gridBagConstraints);
        gridBagConstraints.gridx = 1;
        btnConverter.setPreferredSize(new Dimension(130,40));
        jPanel.add(btnConverter,gridBagConstraints);

        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //executa clic no botão
                if(String.valueOf(selecaoMoedasDe.getSelectedItem()) == String.valueOf(selecaoMoedasPara.getSelectedItem())){
                    JOptionPane.showMessageDialog(null,"Selecione Moedas Diferentes para conversão !!!");

                }else {
                  String resultado = moeda.multiplicarConversor( String.valueOf(selecaoMoedasPara.getSelectedItem())+ String.valueOf(selecaoMoedasDe.getSelectedItem()) ,Double.valueOf(deMoeda.getText()));
                    paraMoeda.setText(resultado);

                }
            }


        });


        add(jPanel,BorderLayout.PAGE_START);
        setVisible(true);
    }


}
