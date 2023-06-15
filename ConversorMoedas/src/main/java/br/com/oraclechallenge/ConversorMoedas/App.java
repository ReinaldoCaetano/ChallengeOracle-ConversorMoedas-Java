package br.com.oraclechallenge.ConversorMoedas;

import br.com.oraclechallenge.ConversorMoedas.API.CotacaoAPI;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        System.out.println( CotacaoAPI.buscaCotacao("EUR","BRL"));
    }
}
