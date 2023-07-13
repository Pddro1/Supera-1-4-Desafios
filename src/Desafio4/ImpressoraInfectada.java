package Desafio4;

import java.util.Scanner;

public class ImpressoraInfectada {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Numeros de frases a ser Decifradas: ");
		int n = scanner.nextInt();
		
		
		System.out.println("Digite a(s) frase(s): ");
		for (int i = 0; i < n; i++) {
			String frase = readLine(scanner);
			
			// primeira metade da frase
			StringBuilder p1 = new StringBuilder(frase.substring(0, frase.length() / 2));
			
			// segunda metade da frase
			StringBuilder p2 = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			
			// inverte a primeira metade
			p1.reverse();
			
			//inverte a segunda metade
			p2.reverse();
			
			System.out.println(p1.toString() + p2.toString());
		}
	}
	
	// Leitura de mais de uma frase
	public static String readLine(Scanner scanner) {
		String linha = scanner.nextLine();
		
		while (linha.isEmpty()) {
			linha = scanner.nextLine();
		}
		
		return linha;
	}
	
}
