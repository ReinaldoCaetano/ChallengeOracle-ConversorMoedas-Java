package br.com.oraclechallenge.conversor.conversormoedas;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.oraclechallenge.conversor.utils.ClientHTTP;

import java.lang.reflect.Type;
import java.util.Map;
public class CotacaoAPI {
	
	 private static String url = "https://economia.awesomeapi.com.br/json/last/USD-BRL,USD-BRLT,CAD-BRL,EUR-BRL,GBP-BRL,ARS-BRL,BTC-BRL,LTC-BRL,JPY-BRL,CHF-BRL,AUD-BRL,CNY-BRL,ILS-BRL,ETH-BRL,XRP-BRL,EUR-USD,CAD-USD,GBP-USD,ARS-USD,JPY-USD,CHF-USD,AUD-USD,CNY-USD,ILS-USD,BTC-USD,LTC-USD,ETH-USD,XRP-USD,BRL-USD,BRL-EUR,USD-EUR,CAD-EUR,GBP-EUR,ARS-EUR,JPY-EUR,CHF-EUR,AUD-EUR,CNY-EUR,ILS-EUR,BTC-EUR,LTC-EUR,ETH-EUR,XRP-EUR,DOGE-BRL,DOGE-EUR,DOGE-USD,USD-JPY,USD-CHF,USD-CAD,NZD-USD,USD-ZAR,USD-TRY,USD-MXN,USD-PLN,USD-SEK,USD-SGD,USD-DKK,USD-NOK,USD-ILS,USD-HUF,USD-CZK,USD-THB,USD-AED,USD-JOD,USD-KWD,USD-HKD,USD-SAR,USD-INR,USD-KRW,FJD-USD,GHS-USD,KYD-USD,SGD-USD,USD-ALL,USD-AMD,USD-ANG,USD-ARS,USD-AUD,USD-BBD,USD-BDT,USD-BGN,USD-BHD,USD-BIF,USD-BND,USD-BOB,USD-BSD,USD-BWP,USD-BZD,USD-CLP,USD-CNY,USD-COP,USD-CRC,USD-CUP,USD-DJF,USD-DOP,USD-DZD,USD-EGP,USD-ETB,USD-FJD,USD-GBP,USD-GEL,USD-GHS,USD-GMD,USD-GNF,USD-GTQ,USD-HNL,USD-HRK,USD-HTG,USD-IDR,USD-IQD,USD-IRR,USD-ISK,USD-JMD,USD-KES,USD-KHR,USD-KMF,USD-KZT,USD-LAK,USD-LBP,USD-LKR,USD-LSL,USD-LYD,USD-MAD,USD-MDL,USD-MGA,USD-MKD,USD-MMK,USD-MOP,USD-MRO,USD-MUR,USD-MVR,USD-MWK,USD-MYR,USD-NAD,USD-NGN,USD-NIO,USD-NPR,USD-NZD,USD-OMR,USD-PAB,USD-PEN,USD-PGK,USD-PHP,USD-PKR,USD-PYG,USD-QAR,USD-RON,USD-RSD,USD-RWF,USD-SCR,USD-SDG,USD-SOS,USD-STD,USD-SVC,USD-SYP,USD-SZL,USD-TND,USD-TTD,USD-TWD,USD-TZS,USD-UAH";



	    public static Moeda buscaCotacao(String codigoConversao) {

	            ClientHTTP http = new ClientHTTP();
	            String json = http.buscaDados(url);

	            Gson gson = new Gson();
	            Type type = new TypeToken<Map<String, Moeda>>(){}.getType();
	            Map<String, Moeda> moedas = gson.fromJson(json, type);

	            Moeda moedaSelecionada = moedas.get(codigoConversao);
	            if (moedaSelecionada != null) {
	                return moedaSelecionada;
	            } else {
	                throw new IllegalArgumentException("Código de conversão inválido");
	            }

	       
	    }

}
