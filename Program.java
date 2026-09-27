package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// PROGRAMA QUE SIMULA UM CONTROLE FINANCEIRO DE ALGUEM QUE MORA SOZINHO
		// CRIADO POR: marrone_nunes_ 

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double salario, saldo, agua, luz, aluguel, internet, mercado, transporte, lazer;

		IO.println("Qual seu saldo e salario?: ");

		saldo = sc.nextDouble();
		salario = sc.nextDouble();

		saldo += salario;
		
		System.out.printf("Total dinheiro que tem: R$ %.2f%n ", saldo);

		IO.println("Quanto gastou de custos fixos: Agua, luz, aluguel e internet?)");

		agua = sc.nextDouble();
		System.out.printf("Agúa: R$ %.2f%n ", agua);

		luz = sc.nextDouble();
		System.out.printf("Luz: R$ %.2f%n ", luz);

		aluguel = sc.nextDouble();
		System.out.printf("Aluguel: R$ %.2f%n ", aluguel);

		internet = sc.nextDouble();
		System.out.printf("Internet: R$ %.2f%n", internet);

		saldo -= agua;
		saldo -= luz;
		saldo -= aluguel;
		saldo -= internet;

		System.out.printf("Saldo disponivel: R$ %.2f%n ", saldo);

		IO.println("Quanto gastou com gasto variavel?(Lazer, transporte e mercado: ");

		lazer = sc.nextDouble();
		System.out.printf("Lazer: R$ %.2f%n", lazer);

		transporte = sc.nextDouble();
		System.out.printf("Transporte: R$ %.2f%n ", transporte);

		mercado = sc.nextDouble();
		System.out.printf("Mercado: R$ %.2f%n", mercado);

		double totalVariavel = mercado + lazer + transporte;
		System.out.printf("Gasto total de variavel: R$ %.2f%n ", totalVariavel);

		saldo -= totalVariavel;

		System.out.printf("Saldo disponivel: R$ %.2f%n", saldo);

		double cashBack = mercado + lazer;
		cashBack *= 0.03;

		System.out.printf("Qual o valor do Cash Back do cartão referente ao mercado e lazer?: R$ %.2f%n ", cashBack);

		saldo += cashBack;

		System.out.printf("Saldo total agora: R$ %.2f%n ", saldo);

		IO.println("Você atrasou o aluguel?: Responda 1 para sim e 2 para não.");

		int resposta;
		resposta = sc.nextInt();

		if (resposta == 1) {

			aluguel *= 0.10;

			saldo -= aluguel;

			System.out.printf("Multa aluguel de R$ %.2f%n", aluguel);
			System.out.printf("Saldo total agora: R$ %.2f%n ", saldo);
		} else {

			if (resposta == 2) {

				IO.println("Nenhuma multa aplicada, obrigado por pagar em dia!");
			}
		}

		IO.println("Você gostaria de guardar a metade do dinheiro que sobrou?: ");

		int resposta2;
		resposta2 = sc.nextInt();

		if (resposta2 == 1) {

			saldo /= 2;

			System.out.printf("Saldo Total guardado: R$ %.2f%n ", saldo);
		}

		else {

			IO.println("Você decidiu não guardar!");
		}

		IO.println("Relatorio final de gastos:");

		System.out.printf("Gasto fixo: R$ %.2f%n ", (luz + agua + internet + aluguel));
		System.out.printf("GastoVariavel: R$ %.2f%n", totalVariavel);
		System.out.printf("CashBack recebido: R$ %.2f%n", cashBack);
		System.out.printf("Saldo final do mês: R$ %.2f%n ", saldo);

		if (saldo < 0) {

			IO.println("Você fechou o mês negativo!!");
		} else {

			IO.println("Você fechou o mês positivo!!");

		}

		saldo = (int) saldo;

		System.out.printf("O saldo em numero inteiro é: R$ %.2f%n", saldo);

		sc.close();
	}

}
