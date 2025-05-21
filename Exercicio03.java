//3 - Escreva um programa que calcule a média de três notas fornecidas pelo usuário.

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        double p1, p2, trab, med;
        
        Scanner tecladoUsuario = new Scanner(System.in);
        
        //Digite os valores com virgula no teclado, o programa irá converter para ponto automaticamente
        
        System.out.println("Digite a nota da primeira prova: ");
        p1 = tecladoUsuario.nextDouble();
        System.out.println("Digite a nota da segunda prova: ");
        p2 = tecladoUsuario.nextDouble();
        System.out.println("Digite a nota do trabalho: ");
        trab = tecladoUsuario.nextDouble();
        
        med = (p1 + p2 + trab) / 3;

        System.out.println("A nota da primeira prova é: " + p1);
        System.out.println("A nota da segunda prova é: " + p2);
        System.out.println("A nota do trabalho é: " + trab);
        System.out.println("A média é: " + med);

        tecladoUsuario.close();
    }

}