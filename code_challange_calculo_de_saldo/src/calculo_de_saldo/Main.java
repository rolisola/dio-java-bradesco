package calculo_de_saldo;

//Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
//- new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
//- System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.  

import java.util.Scanner;
import java.util.Locale;

public class Main {

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
     double [] transacoes = new double[3];
     
     // Recebe o saldo inicial
     System.out.println("Digite o saldo inicial:");
     double saldoInicial = scanner.nextDouble();

     // Recebe a entrada das três transações
     System.out.println("Para Depositar, digite um valor positivo.\nPara Sacar, digite um valor negativo.");
     for (int i = 0; i < transacoes.length; i++) {
    	 System.out.println("Digite a " + (i+1) +"ª transação");
    	 transacoes[i] = scanner.nextDouble();
     }
     
     // Calcula o saldo final
     double saldoFinal = saldoInicial;
     for (int i = 0; i < transacoes.length; i++) {
    	 saldoFinal += transacoes[i];
     }
     
     // Imprime saldo final
     System.out.printf("Saldo final: %.2f\n", saldoFinal);

     scanner.close();
 }
}