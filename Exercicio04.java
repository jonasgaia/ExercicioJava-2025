//4 - Faça um programa que converta uma temperatura em graus Celsius
//para Fahrenheit, utilizando a fórmula: F = (C × 9/5) + 32.

import java.util.Scanner; // Importando a classe Scanner para ler entradas do usuário

public class Exercicio04 {
    public static void main(String[] args) {
        double celsius, fahrenheit;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a temperatura em Celsius");

        celsius = teclado.nextDouble();

        fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Temperatura Fahrenheit");
        System.out.println("Temperatura: " + fahrenheit);
        teclado.close();

    }
}