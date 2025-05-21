//6- Escreva um programa que leia 5 números do usuário e os armazene em um array,
//depois exiba todos os números.

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Números digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println(numeros[i]);
        }
        sc.close();
    }
}