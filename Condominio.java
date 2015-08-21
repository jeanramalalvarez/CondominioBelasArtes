package testando;

public class Condominio {

	//public String nomeDoProprietario;
	// int apartamentosDisponiveis; --> SÓ O SINDICO E O PORTEIRO SABEM
	
	protected String alugado;
    protected int mesesDevendo;
	protected String apartamento;
	protected double pagamento;

	
	
	public Condominio(String apartamento, double pagamento) {
		// super();
		this.apartamento = apartamento;
		this.pagamento = pagamento;
	}

	public String getApartamento() {
		return apartamento;
	}

	public void setApartamento(String apartamento) {
		this.apartamento = apartamento;
	}
	
	public double getPagamento() {
		return pagamento;
	}

	public void setPagamento(double pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public String toString() {
		
		return "[ apartamento= " + apartamento +
				  "\tpagamento= " + pagamento+ "]";
	}
	
	@Override
	public boolean equals(Object obj) {
	/*
	 * FOI CRIADO ESTE METODO, POIS SEM ELE O CONTAINS(USADO NO MÉTODO MAIN) SEMPRE VAI DAR 'false'. 
	 * SÓ RETORNA 'true' SE COMPARAR OBJETOS DE MESMA INSTÂNCIA.
	 */
		
		Condominio outro = (Condominio) obj;
		return this.apartamento.equals(outro.getApartamento());
		
	}
	
	@Override
	public int hashCode() {
	
		return this.apartamento.charAt(0);
	}

}
