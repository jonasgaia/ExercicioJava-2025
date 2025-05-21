import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();
        System.out.println("Tabuada do: " + numero + ":");
        for (int num = 1; num <= 10; num++) {
            System.out.println(numero + " x " + num + " = " + (numero * num));
        }
        scanner.close();
    }
}