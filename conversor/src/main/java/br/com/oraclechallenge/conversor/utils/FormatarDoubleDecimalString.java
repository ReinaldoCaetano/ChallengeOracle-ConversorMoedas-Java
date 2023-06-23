package br.com.oraclechallenge.conversor.utils;

import java.text.DecimalFormat;

public class FormatarDoubleDecimalString {
	
	public static String formatarDecimal(double valor) {
	    DecimalFormat formato = new DecimalFormat("0.00");
	    return formato.format(valor);
	}

}
