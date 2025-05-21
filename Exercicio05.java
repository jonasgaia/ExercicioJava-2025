//5 - Escreva um programa que exiba apenas os números pares de 1 a 20.

public class Exercicio05 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.println("Os números pares entre 1 e 20 são: " + i);
            }
        }

    }
}