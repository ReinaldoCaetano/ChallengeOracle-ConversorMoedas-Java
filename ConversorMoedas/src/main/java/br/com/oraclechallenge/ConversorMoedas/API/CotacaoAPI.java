package br.com.oraclechallenge.ConversorMoedas.API;

import br.com.oraclechallenge.ConversorMoedas.Moeda;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CotacaoAPI   {

    static String url = "https://economia.awesomeapi.com.br/last/";
    private int codigoSucesso = 200;


    public static String buscaCotacao(String deMoeda , String paraMoeda ) {
        String urlParaChamada = url + deMoeda + "-" + paraMoeda;
        try {

            URI endereco = URI.create(urlParaChamada);
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String body = response.body();
            return body;


        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


}
