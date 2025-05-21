import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("=== Digite 5 números ===\n");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println(); // Espaço antes do resultado
        int maior = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }
        System.out.println("O maior número é: " + maior);
        System.out.println(); // Linha extra
        System.out.println("Fim do programa!");
        sc.close();
    }
}
