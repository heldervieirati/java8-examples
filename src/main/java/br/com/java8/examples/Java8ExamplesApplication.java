package br.com.java8.examples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Java8ExamplesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8ExamplesApplication.class, args);
		System.out.println("******** Aplicação Executando... ********");
		System.out.println();
		
		System.out.println("Example 1:");
		example1();
		
		System.out.println();
		System.out.println("Example 2:");
		example2();
		
		System.out.println();
		System.out.println("******** Aplicação Finalizada. ********");
	}

	private static void example1() {
		//Implementação da classe anonima Runnable
		Runnable r1 = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Estutando a expressao lambda 1.");
				
			}
		};
		
		//Implementação da classe anonima Runnable com Lambda
		Runnable r2;
		r2 = () //Lista de argumentos 
			 -> //Seta
		     System.out.println("Estutando a expressao lambda 2."); //Corpo da Expressão Lambda
		
		r1.run();
		r2.run();
	}
	
	interface Num {
		double getValue();
	}
	
	private static void example2() {
		
		Num n;
		n = () -> 16.18;
		System.out.println(n.getValue());
	}
	
}
