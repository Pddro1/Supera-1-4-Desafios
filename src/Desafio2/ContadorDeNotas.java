package Desafio2;

import java.util.Scanner;

public class ContadorDeNotas {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		//Digitar o valor com virgula, o uso do ponto da erro
		System.out.println("Digite o Valor: ");
		double valor = scanner.nextDouble();
		
		System.out.println("NOTAS:");
		
		int notas100 = (int) (valor/100);
		valor %= 100;
		System.out.println(notas100 + " nota(s) de R$ 100,00");
		
		int notas50 = (int) (valor/50);
		valor %= 50;
		System.out.println(notas50 + " nota(s) de R$ 50,00");
		
		int notas20 = (int) (valor/20);
		valor %= 20;
		System.out.println(notas20 + " nota(s) de R$ 20,00");
		
		int notas10 = (int) (valor/10);
		valor %= 10;
		System.out.println(notas10 + " nota(s) de R$ 10,00");
		
		int notas5 = (int) (valor/5);
		valor %= 5;
		System.out.println(notas5 + " nota(s) de R$ 5,00");
		
		int notas2 = (int) (valor/2);
		valor %= 2;
		System.out.println(notas2 + " nota(s) de R$ 2,00");
		
		System.out.println("MOEDAS:");
        int moedas1real = (int) valor;
        valor -= moedas1real;
        System.out.println(moedas1real + " moeda(s) de R$ 1.00");

        int moedas50 = (int) (valor / 0.50);
        valor %= 0.50;
        System.out.println(moedas50 + " moeda(s) de R$ 0.50");

        int moedas25 = (int) (valor / 0.25);
        valor %= 0.25;
        System.out.println(moedas25 + " moeda(s) de R$ 0.25");

        int moedas10 = (int) (valor / 0.10);
        valor %= 0.10;
        System.out.println(moedas10 + " moeda(s) de R$ 0.10");

        int moedas5 = (int) (valor / 0.05);
        valor %= 0.05;
        System.out.println(moedas5 + " moeda(s) de R$ 0.05");

        int moedas1cent = (int) Math.round(valor / 0.01);
        System.out.println(moedas1cent + " moeda(s) de R$ 0.01");

	}

}
