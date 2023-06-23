package br.com.oraclechallenge.conversor.conversormedidascomprimento;

import java.util.HashMap;
import java.util.Map;

import br.com.oraclechallenge.conversor.utils.FormatarDoubleDecimalString;

public class ConversorMedida {
	
	 private Map<String, Double> converterUnidades;

	    public ConversorMedida() {
	        converterUnidades = new HashMap<>();
	        converterUnidades.put("KM", 1000.0);
	        converterUnidades.put("HM", 100.0);
	        converterUnidades.put("DAM", 10.0);
	        converterUnidades.put("M", 1.0);
	        converterUnidades.put("DM", 0.1);
	        converterUnidades.put("CM", 0.01);
	        converterUnidades.put("MM", 0.001);
	    }

	    public String converter(double valor, String converterDe, String converterPara) {
	        double valores = valor * converterUnidades.get(converterDe);
	        double resultado =  valores / converterUnidades.get(converterPara);
	        return String.valueOf(resultado);
	    }
	

}
