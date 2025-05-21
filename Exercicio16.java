//16 - Escreva um programa que valide uma senha de acordo com os
//seguintes critérios:
//• Pelo menos 8 caracteres
//• Pelo menos uma letra maiúscula
//• Pelo menos uma letra minúscula
//• Pelo menos um número

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;
        boolean senhaValida = false;

        while (!senhaValida) {
            System.out.println("Digite uma senha: ");
            senha = scanner.nextLine();

            if (validarSenha(senha)) {
                System.out.println("Senha válida!");
                senhaValida = true;
            } else {
                System.out.println("Senha inválida. A senha deve conter: ");
                System.out.println("• Pelo menos 8 caracteres");
                System.out.println("• Pelo menos uma letra maiúscula");
                System.out.println("• Pelo menos uma letra minúscula");
                System.out.println("• Pelo menos um número");
                System.out.println("Por favor, tente novamente.");
            }
        }

        scanner.close();
    }

    public static boolean validarSenha(String senha) {
        if (senha.length() < 8) {
            return false;
        }

        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (char c : senha.toCharArray()) {
            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            } else if (Character.isLowerCase(c)) {
                temMinuscula = true;
            } else if (Character.isDigit(c)) {
                temNumero = true;
            }

            if (temMaiuscula && temMinuscula && temNumero) {
                return true;
            }
        }

        return false;
    }
}