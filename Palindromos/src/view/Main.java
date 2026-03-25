package view;

import controller.PalindromoController;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		
		JOptionPane.showMessageDialog(null, "Palíndromo é uma cadeia de caracteres que se lê da direita para a\r\n"
				+ "esquerda e da esquerda para a direita e a sequência de caracteres é a\r\n"
				+ "mesma, como em arara, ovo, subinoonibus, por exemplo.");
		System.out.print("Escreva uma cadeia de caracteres para verificar se é um palíndromo: ");
		String plv = sc.nextLine();
		
		PalindromoController.comparaPalavras(plv);
		System.out.println((PalindromoController.comparaPalavras(plv)) ? "É um Palindromo" : "Não é um palíndromo!");
	}
}
