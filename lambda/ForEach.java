package lambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.
				     asList("Ana", "Bia", "lia", "Gui");
		
		System.out.println("Forma Tradicional");
		for (String nome : aprovados) {
			
			System.out.println(nome);
			
		}
		System.out.println("\nLambda Versão 1");
		aprovados.forEach((nome)-> System.out.println(nome  + "!!!!"));
		
		System.out.println("\nMethod Reference 1...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambda Versão 2");
		aprovados.forEach((nome)-> meuImprimir(nome));
		
		System.out.println("\nMethod Reference 2...");
		aprovados.forEach(ForEach::meuImprimir);
		
		 
		
		
		
		}
	   static void meuImprimir(String nome){
		System.out.println("Oi, Meu nome é: " + nome);
		
	}

}
