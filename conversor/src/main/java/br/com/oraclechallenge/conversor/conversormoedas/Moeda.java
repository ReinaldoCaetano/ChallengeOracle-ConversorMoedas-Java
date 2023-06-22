package br.com.oraclechallenge.conversor.conversormoedas;

public class Moeda {
	private String code;
	private String codein;
	private String name;
	private Double high;
	private String low;
	private String varBid;
	private String pctChange;
	private String bid;
	private String ask;
	private String timestamp;
	private String create_date;

	

	 public Moeda() {
	}
	


	public String multiplicarConversor(String string, Double valor) {
     Moeda moeda = CotacaoAPI.buscaCotacao(string);
     double resultado = (moeda.getHigh() * valor);
       return String.valueOf(resultado);
	   
    }


	
	public Double getHigh() {
		return high;
	}



	public void setCode(String code) {
		this.code = code;
	}



	public void setCodein(String codein) {
		this.codein = codein;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setHigh(Double high) {
		this.high = high;
	}



	public void setLow(String low) {
		this.low = low;
	}



	public void setVarBid(String varBid) {
		this.varBid = varBid;
	}



	public void setPctChange(String pctChange) {
		this.pctChange = pctChange;
	}



	public void setBid(String bid) {
		this.bid = bid;
	}



	public void setAsk(String ask) {
		this.ask = ask;
	}



	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}



	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}

}
