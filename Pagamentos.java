package testando;

public interface Pagamentos {

	public void pagamentoDoCondominio(int diaDePagamento);
	
	public void pagamentoDoGas();
	
	public void pagamentoDaLuz();
	
	public void pagamentoDaAgua();
	
	//public double somaDeTodosPagamentos(); //METODO QUE CHAMA OS METODOS ACIMA E RETORNA 
	                                         // A SOMA TODOS OS VALORES A SEREM PAGOS 
	
}
