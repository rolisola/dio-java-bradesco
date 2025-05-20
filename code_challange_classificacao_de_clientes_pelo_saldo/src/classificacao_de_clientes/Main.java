package classificacao_de_clientes;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;
import java.util.Locale;

public class Main {
	public static void main(String[] args) {
		// Objeto Scanner para receber a entrada dos valores
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

		// Recebe o valor do saldo
		System.out.println("Digite o saldo");
		double saldo = scanner.nextDouble();

		// Classifica de acordo com o saldo
		if (saldo < 0) {
			// Para saldos menores que 0
			System.out.println("Negativado");
		} else if(0 <= saldo && saldo <= 500) {
			// Para saldos entre 0 e 500, inclusive
			System.out.println("Baixo");
		} else {
			// Para saldos maiores que 500
			System.out.println("Confortavel");
		}

		scanner.close();
	}
}