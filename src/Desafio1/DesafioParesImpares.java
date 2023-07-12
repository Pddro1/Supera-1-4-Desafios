package Desafio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DesafioParesImpares {

	public static void main(String[] args) {
		// Scanner para a entrada dos valores
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Digite os valores: ");
		int n = scanner.nextInt();
		
		List<Integer> valores = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int valor = scanner.nextInt();
			valores.add(valor);
		}
		
		List<Integer> par = new ArrayList<>();
		List<Integer> impar = new ArrayList<>();
		
		for (int valor : valores) {
			if(valor % 2 == 0) {
				par.add(valor);
			}
			else {
				impar.add(valor);
			}
		}
		
		//Pares com ordem crescente e os Impares com ordem Decrescente
		Collections.sort(par);
		Collections.sort(impar, Collections.reverseOrder());
		
		for(int valor : par) {
			System.out.println(valor);
		}
		
		for(int valor : impar) {
			System.out.println(valor);
		}

	}

}
