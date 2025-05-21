
//8- Escreva um programa que conte o número de vogais em uma string fornecida pelo
import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();
        int cont = 0;
        for (int i = 0; i < texto.length(); i++) {
            char c = Character.toLowerCase(texto.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                cont++;
            }
        }
        System.out.println("Quantidade de vogais: " + cont);
        sc.close();
    }
}
