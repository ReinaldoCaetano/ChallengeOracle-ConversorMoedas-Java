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
    private JButton btnVoltar = new JButton("Voltar");

    Moeda moeda = new Moeda();


    public TelaConversorMoedas() {
      
        setTitle("Conversor de Moedas");
        setSize(new Dimension(450,290));
        setLocationRelativeTo(null);
      

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 1;
        gridBagConstraints.insets = new Insets(4,5,7,5);



        converterDe.setPreferredSize(new Dimension(200,30));
        jPanel.add(converterDe,gridBagConstraints);

        gridBagConstraints.gridy = 1;
        selecaoMoedasDe.setPreferredSize(new Dimension(80,30));
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
        deMoeda.setPreferredSize(new Dimension(200,30));
        deMoeda.setDocument(new soNumeros());
        deMoeda.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jPanel.add(deMoeda, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        converterPara.setPreferredSize(new Dimension(200,30));
        jPanel.add(converterPara,gridBagConstraints);


        gridBagConstraints.gridy = 3 ;
        gridBagConstraints.gridx= 0 ;
        selecaoMoedasPara.setPreferredSize(new Dimension(80,30));
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
        paraMoeda.setPreferredSize(new Dimension(200,30));
        paraMoeda.setEditable(false);
        paraMoeda.setHorizontalAlignment((int) CENTER_ALIGNMENT);
        jPanel.add(paraMoeda, gridBagConstraints);

        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new Insets(25,0,10,0);
        gridBagConstraints.anchor = GridBagConstraints.CENTER;
        
        btnVoltar.setPreferredSize(new Dimension(130,30));
        jPanel.add(btnVoltar,gridBagConstraints);
        btnVoltar.addActionListener(new ActionListener() {

          @Override
          public void actionPerformed(ActionEvent arg0) {
             TelaInicial telaInicial = new TelaInicial();
               setVisible(false);
               telaInicial.setVisible(true);
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
          }
          
        });

        gridBagConstraints.gridx = 1;
        btnConverter.setPreferredSize(new Dimension(130,30));
        jPanel.add(btnConverter,gridBagConstraints);

        btnConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //executa clic no botão
                if(String.valueOf(selecaoMoedasDe.getSelectedItem()) == String.valueOf(selecaoMoedasPara.getSelectedItem())){
                    JOptionPane.showMessageDialog(null,"Selecione Moedas Diferentes para conversão !!!");

                }else {
                  paraMoeda.setText(moeda.multiplicarConversor( String.valueOf(selecaoMoedasPara.getSelectedItem())
                  + String.valueOf(selecaoMoedasDe.getSelectedItem()) ,Double.valueOf(deMoeda.getText())));
                    
                }
            }


        });

        add(jPanel,BorderLayout.PAGE_START);
        setVisible(true);
    }


}
