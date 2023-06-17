package br.com.oraclechallenge.ConversorMoedas;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

public class soNumeros extends PlainDocument{

    @Override
    public void insertString(int arg0, String arg1, AttributeSet arg2) throws BadLocationException {
        // TODO Auto-generated method stub
        super.insertString(arg0, arg1.replaceAll("[^0-9.]" , ""), arg2);
    }
    
}
