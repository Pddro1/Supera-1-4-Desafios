package Desafio3;

import java.util.Arrays;
import java.util.Scanner;

public class ContadorPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o Tamanho do Array: ");
		int n = scanner.nextInt();
		
		System.out.println("Digite o Valor Alvo: ");
		int k = scanner.nextInt();
		
		int[] array = new int[n];
		
		System.out.println("Digite os Valores: ");
		for(int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		
		int contadorPares = contarPares(array, k);
		System.out.println(contadorPares);
	}
	
	public static int contarPares(int[] array, int k) {
		Arrays.sort(array);
		
		int contador = 0;
		
		int i = 0;
		int j = 1;
		
		while(j < array.length) {
			int diferente = array[j] - array[i];
			
			if(diferente == k) {
				contador++;
				j++;
			}
			else if(diferente < k) {
				j++;
			}
			else {
				i++;
			}
			
			if(i == j) {
				j++;
			}
		}
		
		return contador;
	}

}
