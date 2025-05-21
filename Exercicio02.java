//2 - Escreva um programa que leia um número inteiro e informe se ele é par ou ímpar.

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args){
        int numeroUsuario;
        Scanner tecladoUsuario = new Scanner(System.in);
        System.out.print("Digite um número inteiro: ");
        numeroUsuario = tecladoUsuario.nextInt();
        
        // Verifica se o número é par ou ímpar ou se não é numero inteiro
        if (numeroUsuario % 2 == 0) {
            System.out.println("O numero informado é par");
        } 
        else if(numeroUsuario % 2 != 0) {
            System.out.println("O numero informado é ímpar");
        }    
        else {
            System.out.println("O número informado não é um inteiro válido.");
        }
        tecladoUsuario.close();

    }
}

