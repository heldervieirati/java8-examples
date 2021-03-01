package br.com.java8.examples;

import java.util.Arrays;
import java.util.List;

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
		System.out.println("Example 3:");
		example3();
		
		System.out.println();
		System.out.println("Example 4:");
		example4();
		
		System.out.println();
		System.out.println("Example 5:");
		example5();
		
		System.out.println();
		System.out.println("Example 6:");
		example6();
		
		System.out.println();
		System.out.println("Example 7:");
		example7();
		
		System.out.println();
		System.out.println("******** Aplicação Finalizada. ********");
	}

	//Example1
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
	
	//Example2 - Interface Funcional 1
	interface Num {
		double getValue();
	}
	
	//Expressao lambda utilizada como uma constante	
	private static void example2() {
		
		Num n;
		n = () -> 16.18;
		System.out.println(n.getValue());
	}
	
	//Example3
	//Expressão lambda com classe Math 
	private static void example3() {
		
		Num n2 = () -> Math.random() * 100;
		System.out.println(n2.getValue());
		System.out.println(n2.getValue());
	}
	
	//Example4 - Interface Funcional 2
	interface ValorNumerico {
		boolean teste(int n);
	}
	
	//Expressão lambda com passagem de um Parametro para Interface Funcional
	private static void example4() {
		
		ValorNumerico isPar = (int n) -> (n % 2)==0;
		System.out.println(isPar.teste(10));
		System.out.println(isPar.teste(7));
	}
	
	
	//Example5 - Interface Funcional 3
	interface ValorNumerico2 {
		boolean teste(int n, int n2);
	}
	
	//Expressão lambda com passagem de dois Parametros para Interface Funcional
	private static void example5() {
		
		ValorNumerico2 isDiv = (x, y) -> (x%y)==0; // Caso declare o tipo em um dos parametros, deve-se definir tipos de ambos
		System.out.println(isDiv.teste(10, 5));
		System.out.println(isDiv.teste(12, 9));
	}
	
	//Expressão lambda com Corpo da Expressão Lambda
	private static void example6() {
		
		ValorNumerico2 expressao = (x, y) -> { // Quando aberto chaves, eh obrigatorio o uso do return
			return x + y > 1000;
		} ;
		System.out.println(expressao.teste(10, 100));
		System.out.println(expressao.teste(10, 1000));
	}
	
	//Stream na Pratica
	private static void example7() {
		
		//Antes do Java8
		List<String> lista1 = Arrays.asList(
						"Santa Catarina", 
						"Parana", 
						"Sao Paulo", 
						"Rio de Janeiro", 
						"Brasilia", 
						"Ceara");
		//for (String s : lista1) 
			//System.out.println(s);
		//lista1.forEach(x -> System.out.println(x));		
		lista1.forEach(System.out::println); 			// Referencia de Metodo
		
	}
}	
