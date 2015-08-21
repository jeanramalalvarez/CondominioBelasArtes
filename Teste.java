package testando;

import java.util.Collection;
import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;

public class Teste {

	//private static double pagamento;

	public static void main(String[] args) {

		Collection<Condominio> c = new HashSet<>();

		Condominio c1 = new Condominio("101",700);
		Condominio c2 = new Condominio("102",750);
		Condominio c3 = new Condominio("201",800);
		Condominio c4 = new Condominio("202",850);
		Condominio c5 = new Condominio("301",900);
		Condominio c6 = new Condominio("302",950);
		Condominio c7 = new Condominio("401",1200);
		
		
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		c.add(c7);
			
		
	
		try (Scanner entrada = new Scanner(System.in)) {
        //pra aceitar colocar ponto ao inves de virgula e nao dar Exception do tipo	"java.util.InputMismatchException"
			entrada.useLocale(Locale.US);
			String continuar = "s";
			while ("s".equalsIgnoreCase(continuar)) {
				System.out.print("Apartamento: ");
				String apartamento = entrada.next();
				
				System.out.print("Pagamento: ");
				double pagamento = entrada.nextDouble();
				

				Condominio apto = new Condominio(apartamento, pagamento);
				Proprietario p = new Proprietario(apartamento, pagamento);
					
				if (c.contains(apto)) {
					//Condominio pag;
					//pagamento == pag.getPagamento();
			    	p.pagamentoDoCondominio(05);
                    
				} else {
					c.add(apto);
					System.out.println("Apartamento adicionado.");
					c.forEach(System.out::println);
				}
				  
				
				System.out.print("Deseja adicionar mais algum apartamento? (s/n) ");
				continuar = entrada.next();
				
				
				// OUTROS TIPOS DE PAGAMENTOS
				p.pagamentoDoGas(); p.pagamentoDaLuz(); p.pagamentoDaAgua();
			}
			
		}

		//c.forEach(System.out::println);
         
	
		
		
	}

}
