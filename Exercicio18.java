//18 - Desenvolva um programa que conte quantas palavras existem em uma
//string fornecida pelo usuário.

import java.util.Scanner;

public class Exercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite uma frase:");
        
        String input = scanner.nextLine();

        int numPalavra = contaPalavra(input);

        System.out.println("Numero de Palavras: " + numPalavra);
        
        scanner.close();
    }

   
    public static int contaPalavra(String str) {
  
        str = str.trim();

        if (str.isEmpty()) {
            return 0;
        }
        return str.split("\\s+").length;
    }
}