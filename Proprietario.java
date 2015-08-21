package testando;

import java.util.Random;
import java.util.Scanner;

public class Proprietario extends Condominio implements Pagamentos {
 
	Random gerador = new Random();
	
	
	public Proprietario(String apartamento, double pagamento) {
		super(apartamento, pagamento);
		// TODO Auto-generated constructor stub
	}

	// private String cpf;

	// public int numeroDeVagas;
	Scanner a = new Scanner(System.in);

	@Override
	public void pagamentoDoCondominio(int diaDePagamento) {

		System.out.print("Que dia você pagou?");
		int dataQueEuPaguei = a.nextInt();

		System.out.print("Seu apartamento é alugado? (s/n) ");
		alugado = a.next();

		System.out.print("Quantos meses você esta devendo?");
		mesesDevendo = a.nextInt();

		if ("s".equalsIgnoreCase(alugado)) {

			switch (alugado) {
			case "s":
				if (dataQueEuPaguei > diaDePagamento) {
					double pagoComJuros = pagamento + (5 * (dataQueEuPaguei - diaDePagamento) + (8 * mesesDevendo))
							- 100.0;
					System.out.println("PAGAMENTO COM JUROS! Pagará " + pagoComJuros + " de aluguel");
				}
				break;
			default:
				if (dataQueEuPaguei <= diaDePagamento) {
					pagamento -= 100;
					System.out.println("Pagará " + pagamento + "de aluguel");

				}

			}
		} else if ("n".equalsIgnoreCase(alugado)) {

			switch (alugado) {
			case "n":
				if (dataQueEuPaguei > diaDePagamento) {
					double valorTotal = pagamento + (5 * (dataQueEuPaguei - diaDePagamento) + (8 * mesesDevendo));

					System.out.println("PAGAMENTO COM JUROS! Valor é de: " + valorTotal);
				}
				break;

			default:
				if (dataQueEuPaguei <= diaDePagamento)

					System.out.println("O valor do seu apartamento é de: " + pagamento);
			}
		}

	}

	 @Override
	public void pagamentoDoGas() {
          double numero = 0;
		//imprime sequência de 10 números inteiros aleatórios entre 0 e 25
		    for (int i = 0; i < 1; i++) {
		    	System.out.println( numero = gerador.nextInt(50)*3.7);
		    } 
		      
		    	
	}

	@Override
	public void pagamentoDaLuz() {
        
		double numero = 0;
		//imprime sequência de 10 números inteiros aleatórios entre 0 e 25
	    for (int i = 0; i < 1; i++) {
	    	System.out.println(numero = gerador.nextInt(50)*8.3);
		 }
	}

	@Override
	public void pagamentoDaAgua() {

		 double numero = 0;
		//imprime sequência de 10 números inteiros aleatórios entre 0 e 25
	    for (int i = 0; i < 1; i++) {
	    	System.out.println(numero = gerador.nextInt(50)*6.8);
	    }
	}

}
